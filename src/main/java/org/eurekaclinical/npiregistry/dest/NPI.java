//import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
//import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */

package org.eurekaclinical.npiregistry.dest;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
public class NPI implements Serializable {

	public int result_count;
	@JsonUnwrapped
	public List<Result> results;
	public int getResult_count() {
		return result_count;
	}
	public void setResult_count(int result_count) {
		this.result_count = result_count;
	}
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "NPI [result_count=" + result_count + ", results=" + results + "]";
	}
	
	
}
