package org.eurekaclinical.npiregistry.dest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Address {
	public String country_code;
	public String country_name;
	public String address_purpose;
	public String address_type;
	public String address_1;
	public String address_2;
	public String city;
	public String state;
	public String postal_code;
	public String telephone_number;
	public String fax_number;
	
	
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getAddress_purpose() {
		return address_purpose;
	}
	public void setAddress_purpose(String address_purpose) {
		this.address_purpose = address_purpose;
	}
	public String getAddress_type() {
		return address_type;
	}
	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}
	public String getAddress_1() {
		return address_1;
	}
	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
	public String getAddress_2() {
		return address_2;
	}
	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getTelephone_number() {
		return telephone_number;
	}
	public void setTelephone_number(String telephone_number) {
		this.telephone_number = telephone_number;
	}
	public String getFax_number() {
		return fax_number;
	}
	public void setFax_number(String fax_number) {
		this.fax_number = fax_number;
	}
	@Override
	public String toString() {
		return "Address [country_code=" + country_code + ", country_name=" + country_name + ", address_purpose="
				+ address_purpose + ", address_type=" + address_type + ", address_1=" + address_1 + ", address_2="
				+ address_2 + ", city=" + city + ", state=" + state + ", postal_code=" + postal_code
				+ ", telephone_number=" + telephone_number + ", fax_number=" + fax_number + "]";
	}
	
	public boolean isPrimaryPracticeAddress() { 
		return (this.getAddress_purpose().contains("LOCATION")?true:false);
	    
	}
}