package com.te.springcoreanotation.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Furniture implements Serializable {

	private String thing;

	private String material;

	@Autowired(required = false)
	/* @Qualifier("chair") */
	private Brand name;

}
