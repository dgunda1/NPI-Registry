package org.eurekaclinical.npiregistry.repository;

import org.springframework.data.repository.CrudRepository;
import org.eurekaclinical.npiregistry.entity.NPI_DATA_TEMP;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface NpiRepository extends CrudRepository<NPI_DATA_TEMP, String> {

}