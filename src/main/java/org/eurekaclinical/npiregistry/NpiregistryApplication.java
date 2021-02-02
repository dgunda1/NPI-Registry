package org.eurekaclinical.npiregistry;

import java.util.List;
import java.util.stream.Collectors;

import org.eurekaclinical.npiregistry.dest.Address;
import org.eurekaclinical.npiregistry.dest.NPI;
import org.eurekaclinical.npiregistry.dest.Result;
import org.eurekaclinical.npiregistry.entity.NPI_DATA_TEMP;
import org.eurekaclinical.npiregistry.repository.NpiRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class NpiregistryApplication {

	private static final Logger log = LoggerFactory.getLogger(NpiregistryApplication.class);

	
	@Autowired
	  private NpiRepository npiRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(NpiregistryApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			List<Object> npis =null;
			npis = npiRepository.getProviderNPI();
			
			npis.forEach(npi -> {
				try {
					npiRESTcall(restTemplate,npi);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		};
	}
	
	public NPI_DATA_TEMP npiRESTcall(RestTemplate restTemplate,Object npi) throws Exception {
		log.info("Printing NPI data");
		
			log.info(" NPI  Rest Call begin : "+ System.currentTimeMillis());
			NPI npi_result = restTemplate.getForObject(
					"https://npiregistry.cms.hhs.gov/api/?number="+String.valueOf(npi)+"&version=2.1", NPI.class);
			log.info(" NPI  Rest Call End : "+ System.currentTimeMillis());
			
			NPI_DATA_TEMP ndt = null ;
			try {
			 ndt = CopyToNPI(npi_result);
			 
			}catch(Exception e) {
				e.printStackTrace();
			}
			log.info(ndt.toString());
			return ndt;

	}
	
	public NPI_DATA_TEMP CopyToNPI(NPI npi)
	{
		NPI_DATA_TEMP ndt = new NPI_DATA_TEMP();
		Result  result = npi.getResults().get(0);
		
		ndt.setNPI(result.number);
		
		 
		List<Address> addresses = result.getAddresses()
										.stream()
										.filter(Address::isPrimaryPracticeAddress)
										.collect(Collectors.toList());
		
		ndt.setADDRESS_LINE_1(addresses.get(0).getAddress_1());
		ndt.setADDRESS_LINE_2(addresses.get(0).getAddress_2());
		ndt.setCITY(addresses.get(0).getCity());
		ndt.setSTATE(addresses.get(0).getState());
		ndt.setZIP(addresses.get(0).getPostal_code());
		ndt.setCOUNTRY_CODE(addresses.get(0).getCountry_code());
		ndt.setPHONE(addresses.get(0).getTelephone_number());
		ndt.setFAX(addresses.get(0).getFax_number());
		
		 
		
		return ndt;
	}
	
	
	
}
