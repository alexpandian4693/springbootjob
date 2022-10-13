package com.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Component
@ConfigurationProperties(prefix="Customer")
public class Customer {
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String phone;
	private String email;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
