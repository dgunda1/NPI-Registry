package org.eurekaclinical.npiregistry.dest;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class Result {

	public String enumeration_type;
	public int number;
	public int last_updated_epoch;
	public int created_epoch;
	public Basic basic;
	@JsonUnwrapped
	public List<Object> other_names;
	@JsonUnwrapped
	public List<Address> addresses;
	@JsonUnwrapped
	public List<Taxonomy> taxonomies;
	@JsonUnwrapped
	public List<Object> identifiers;
	
	
	
	 public String getEnumeration_type() {
		return enumeration_type;
	}



	public void setEnumeration_type(String enumeration_type) {
		this.enumeration_type = enumeration_type;
	}



	public int getNumber() {
		return number;
	}



	public void setNumber(int number) {
		this.number = number;
	}



	public int getLast_updated_epoch() {
		return last_updated_epoch;
	}



	public void setLast_updated_epoch(int last_updated_epoch) {
		this.last_updated_epoch = last_updated_epoch;
	}



	public int getCreated_epoch() {
		return created_epoch;
	}



	public void setCreated_epoch(int created_epoch) {
		this.created_epoch = created_epoch;
	}



	public Basic getBasic() {
		return basic;
	}



	public void setBasic(Basic basic) {
		this.basic = basic;
	}



	public List<Object> getOther_names() {
		return other_names;
	}



	public void setOther_names(List<Object> other_names) {
		this.other_names = other_names;
	}



	public List<Address> getAddresses() {
		return addresses;
	}



	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}



	public List<Taxonomy> getTaxonomies() {
		return taxonomies;
	}



	public void setTaxonomies(List<Taxonomy> taxonomies) {
		this.taxonomies = taxonomies;
	}



	public List<Object> getIdentifiers() {
		return identifiers;
	}



	public void setIdentifiers(List<Object> identifiers) {
		this.identifiers = identifiers;
	}



	@Override
	public String toString() {
		return "NPI [enumeration_type=" + enumeration_type + ", number=" + number + ", last_updated_epoch="
				+ last_updated_epoch + ", created_epoch=" + created_epoch + ", basic=" + basic + ", other_names="
				+ other_names + ", addresses=" + addresses + ", taxonomies=" + taxonomies + ", identifiers="
				+ identifiers + "]";
	}


}
