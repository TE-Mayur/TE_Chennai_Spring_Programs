package com.te.carwale.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name ="cardetails")
@Data
public class CarInfo implements Serializable{
	
	public CarInfo() {}

	@Id
	@Column
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String company;
	
	@Column(name = "Fuel_Type")
	private String fuelType;
	
	@Column(name = "Power_Steering")
	private String powerSteering;
	
	@Column(name = "Break_System")
	private String breakSystem;
	
	@Column(name = "Showroom_Price")
	private Double showroomPrice;
	
	@Column(name = "Onroad_Price")
	private Double onRoadPrice;
	
	@Column(name = "Image_URL")
	private String imageUrl;
	 
	@Column
	private Double milage;
	
	@Column(name = "Seating_Capacity")
	private Integer seatingCapacity;
	
	@Column(name = "Engine_Capacity")
	private Integer engineCapacity;
	
	@Column(name = "Gear_Type")
	private String gearType;
	
}
