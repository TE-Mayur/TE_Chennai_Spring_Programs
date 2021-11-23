package org.te.ems.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookies")
public class CoockiesController {

	@GetMapping("/show")
	public String getCookiesPage() {
		return "cookiePage";
	}

	@GetMapping("/create")
	public String createCookies(HttpServletResponse resp, ModelMap map) {
		Cookie cookie = new Cookie("user", "Mayur");
		Cookie cookie2 = new Cookie("Chennai", "RedAlerts");
		cookie2.setMaxAge(30);
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
		map.addAttribute("msg", "created cookies....");
		return "cookiePage";
	}

	@GetMapping("/read")
	public String readCookies(@CookieValue(name = "user", required = false) String user, HttpServletRequest req,
			ModelMap map) {
		Cookie[] cookies = req.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName());
			System.out.println(cookie.getValue());
		}
		map.addAttribute("msg", "user ID is " + user);
		return "cookiePage";

	}

}
