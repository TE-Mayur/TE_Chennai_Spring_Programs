package org.te.ems.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.te.ems.beans.EmployeesInfo;
import org.te.ems.services.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired(required = false)
	private EmployeeService service;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Init");
		CustomDateEditor dateEditor = new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
	}

	@GetMapping("/login")
	public String getLoginForm() {
		return "LoginForm";
	}
	
	@GetMapping("/signup")
	public String getSignupForm() {
		return "Signup";
	}
	
	@PostMapping("/login")
	public String authenticate(Integer id, String pwd, ModelMap map,HttpServletRequest requset) {
	EmployeesInfo info = service.authenticate(id, pwd);
		if(info != null) {
			HttpSession session = requset.getSession(true);
			session.setAttribute("isLoggedIn", info);
//			session.setMaxInactiveInterval(60);
			map.addAttribute("user", info);
			return "welcome";
			}else {
				map.addAttribute("err", "Invalid Credentials");
				return "LoginForm";
			}
		}//end of authenticate
	
	@GetMapping("/searchPage")
	public String getSearchPage(HttpSession session, ModelMap map) {
		if (session.getAttribute("isLoggedIn") != null) {
			return "search";
		} else {
			map.addAttribute("err", "Please Login First");
			return "LoginForm";
		}// end of validation

	}

	@GetMapping("/search")
	public String sendSearchData(@SessionAttribute(name = "isLoggedIn", required = false) EmployeesInfo info, Integer id,
			ModelMap map) {
		if (info != null) {
			EmployeesInfo info1 = service.getEmployee(id);
			if (info1 != null) {
				map.addAttribute("user", info1);
			} else {
				map.addAttribute("msg", "No Data found");
			}
			return "search";
		} else {
			map.addAttribute("err", "Please Login First");
			return "LoginForm";
		}

	} // end of sendSearchData
		
		@GetMapping("/logout")
		public String logout(HttpSession session, ModelMap map) {
			session.invalidate();
			map.addAttribute("err", "Logged Out Successfully");
			return "LoginForm";
		}

		@GetMapping("/deleteuser")
		public String getDeletePage(@SessionAttribute(name = "isLoggedIn", required = false) EmployeesInfo info , ModelMap map){
			if(info != null) {
				return "delete";
			}else {
				map.addAttribute("err", "Please Login First");
				return "LoginForm";
			}
      } //

		@GetMapping("/delete")
		public String deleteData(Integer id , @SessionAttribute(name = "isLoggedIn", required = false) EmployeesInfo info , ModelMap map) {
			if(info != null) {
				if(service.delete(id)) {
				map.addAttribute("msg", "Deleted Data for"  + id);	
				}else {
					map.addAttribute("msg", " Data not found for"  + id);	
				}
				return "delete";
		}else {
		map.addAttribute("err", "Please Login First");
		return "LoginForm";
		}
		}//
		
		@PostMapping("/register")
		public String register(EmployeesInfo info, ModelMap map) {
			if(service.register(info)) {
				map.addAttribute("err", "Registered Successfully");
				return "LoginForm";
			}else {
				map.addAttribute("err", "Data Already Exists");
				return "Signup";
			}
		}
		
		@GetMapping("/updateData")
		public String getUpdateForm(@SessionAttribute(name = "isLoggedIn" , required = false)EmployeesInfo info,
				ModelMap map) {
			if(info != null) {
				map.addAttribute("user", info);
				return "update";
			}else {
				map.addAttribute("err", "Please Login First");
				return "LoginForm";
			}
			}
		
		@PostMapping("/update")
		public String updateRecord(@SessionAttribute(name = "isLoggedIn" , required = false)EmployeesInfo info,
				ModelMap map, EmployeesInfo bean){
			if (info != null) {
				if (service.update(bean)) {
					map.addAttribute("msg", "Updated Successfully");
				}
				else {
					map.addAttribute("msg", "Something Went Wrong");
				}
				map.addAttribute("user",info);
				return "update";
			} else {
				map.addAttribute("err", "Please Login First");
				return "LoginForm";
			}
		}

		@GetMapping("/getalldetail")
		public String getAllDetails(@SessionAttribute(name = "isLoggedIn", required = false) 
		EmployeesInfo info , ModelMap map) {
			
			if( info != null) {
				List<EmployeesInfo> bean = service.getAll();
				map.addAttribute("employee", bean);
				return "getall";	
					}else {
						map.addAttribute("err", "Login First to get the result");
						return "LoginForm";
						
					}
			
		}	
}
