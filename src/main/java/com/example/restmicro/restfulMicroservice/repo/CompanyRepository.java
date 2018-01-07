package com.example.restmicro.restfulMicroservice.repo;

import com.example.restmicro.restfulMicroservice.domain.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CompanyRepository extends CrudRepository<Company, Integer> {
    Company findByNameContaining(@Param("name")String name);
}
