package org.eurekaclinical.npiregistry.dest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Basic {
	public String name_prefix;
	public String first_name;
	public String last_name;
	public String middle_name;
	public String credential;
	public String sole_proprietor;
	public String gender;
	public String enumeration_date;
	public String last_updated;
	public String status;
	public String name;
	public String getName_prefix() {
		return name_prefix;
	}
	public void setName_prefix(String name_prefix) {
		this.name_prefix = name_prefix;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getCredential() {
		return credential;
	}
	public void setCredential(String credential) {
		this.credential = credential;
	}
	public String getSole_proprietor() {
		return sole_proprietor;
	}
	public void setSole_proprietor(String sole_proprietor) {
		this.sole_proprietor = sole_proprietor;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEnumeration_date() {
		return enumeration_date;
	}
	public void setEnumeration_date(String enumeration_date) {
		this.enumeration_date = enumeration_date;
	}
	public String getLast_updated() {
		return last_updated;
	}
	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Basic [name_prefix=" + name_prefix + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", middle_name=" + middle_name + ", credential=" + credential + ", sole_proprietor=" + sole_proprietor
				+ ", gender=" + gender + ", enumeration_date=" + enumeration_date + ", last_updated=" + last_updated
				+ ", status=" + status + ", name=" + name + "]";
	}
	
	
	
}