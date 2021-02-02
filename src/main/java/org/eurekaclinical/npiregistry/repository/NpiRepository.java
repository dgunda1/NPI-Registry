package org.eurekaclinical.npiregistry.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

import org.eurekaclinical.npiregistry.entity.NPI_DATA_TEMP;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface NpiRepository extends CrudRepository<NPI_DATA_TEMP, String> {

    @Query(value = "SELECT I2B2OMOP.npi_location_seq.nextval FROM DUAL", nativeQuery = true)
    public BigDecimal getNextValMySequence();
    
    @Query(value = "  select a2.npi from provider_final a2 LEFT join npi_data a1 on a1.npi = a2.npi\n" + 
    		"  WHERE location_id IS NULL\n" + 
    		"  and a2.npi is not null\n" + 
    		"  and a2.npi not like 'NOTRECORDED'\n" + 
    		"  and a2.npi not like '00%'\n" + 
    		"  order by a2.npi", nativeQuery = true)
    public List<Object> getProviderNPI();
    
}