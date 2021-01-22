package org.eurekaclinical.npiregistry.dest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Taxonomy {
	public String code;
	public String desc;
	public boolean primary;
	public String state;
	public String license;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isPrimary() {
		return primary;
	}
	public void setPrimary(boolean primary) {
		this.primary = primary;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	@Override
	public String toString() {
		return "Taxonomy [code=" + code + ", desc=" + desc + ", primary=" + primary + ", state=" + state + ", license="
				+ license + "]";
	}
	
	
}