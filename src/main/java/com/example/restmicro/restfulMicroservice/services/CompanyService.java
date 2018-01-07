package com.example.restmicro.restfulMicroservice.services;

import com.example.restmicro.restfulMicroservice.domain.Company;
import com.example.restmicro.restfulMicroservice.repo.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    private CompanyRepository companyRepository;

    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company createCompany(String name, String description, Integer year){
        return companyRepository.save(new Company(name, description, year));
    }

    public Iterable<Company> lookUp(){
        return companyRepository.findAll();
    }

    public long total(){
        return companyRepository.count();
    }

}


