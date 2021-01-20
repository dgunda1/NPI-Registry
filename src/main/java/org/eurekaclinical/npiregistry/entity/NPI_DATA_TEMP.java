package org.eurekaclinical.npiregistry.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class NPI_DATA_TEMP {
//	@GeneratedValue(strategy=GenerationType.AUTO)
  @Id
//  @Column(value = "PR_KEY")
  private String NPI;

  private String LOCATION_ID;

  private String BUSINESS_NAME;

  private String ADDRESS_LINE_1;

  private String ADDRESS_LINE_2;

  private String CITY;
  
  private String STATE;

  private String ZIP;

  private String COUNTRY_CODE;

  private String PHONE;
  
  private String FAX;

public String getLOCATION_ID() {
	return LOCATION_ID;
}

public void setLOCATION_ID(String lOCATION_ID) {
	LOCATION_ID = lOCATION_ID;
}

public String getNPI() {
	return NPI;
}

public void setNPI(String nPI) {
	NPI = nPI;
}

public String getBUSINESS_NAME() {
	return BUSINESS_NAME;
}

public void setBUSINESS_NAME(String bUSINESS_NAME) {
	BUSINESS_NAME = bUSINESS_NAME;
}

public String getADDRESS_LINE_1() {
	return ADDRESS_LINE_1;
}

public void setADDRESS_LINE_1(String aDDRESS_LINE_1) {
	ADDRESS_LINE_1 = aDDRESS_LINE_1;
}

public String getADDRESS_LINE_2() {
	return ADDRESS_LINE_2;
}

public void setADDRESS_LINE_2(String aDDRESS_LINE_2) {
	ADDRESS_LINE_2 = aDDRESS_LINE_2;
}

public String getCITY() {
	return CITY;
}

public void setCITY(String cITY) {
	CITY = cITY;
}

public String getSTATE() {
	return STATE;
}

public void setSTATE(String sTATE) {
	STATE = sTATE;
}

public String getZIP() {
	return ZIP;
}

public void setZIP(String zIP) {
	ZIP = zIP;
}

public String getCOUNTRY_CODE() {
	return COUNTRY_CODE;
}

public void setCOUNTRY_CODE(String cOUNTRY_CODE) {
	COUNTRY_CODE = cOUNTRY_CODE;
}

public String getPHONE() {
	return PHONE;
}

public void setPHONE(String pHONE) {
	PHONE = pHONE;
}

public String getFAX() {
	return FAX;
}

public void setFAX(String fAX) {
	FAX = fAX;
}
  
  
}