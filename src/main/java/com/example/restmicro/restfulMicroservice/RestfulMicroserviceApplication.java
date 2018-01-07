package com.example.restmicro.restfulMicroservice;

import com.example.restmicro.restfulMicroservice.services.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestfulMicroserviceApplication implements CommandLineRunner{

	@Autowired
	private CompanyService companyService;

	public static void main(String[] args) {
		SpringApplication.run(RestfulMicroserviceApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		companyService.createCompany("Ford", "The Ford Motor Company (commonly referred to simply as Ford) is an American multinational automaker headquartered in Dearborn, Michigan, a suburb of Detroit. It was founded by Henry Ford and incorporated on June 16, 1903. The company sells automobiles and commercial vehicles under the Ford brand and most luxury cars under the Lincoln brand.", 1903);
		companyService.createCompany("General Motors", "General Motors Company, commonly known as GM, is an American multinational corporation headquartered in Detroit, Michigan, that designs, manufactures, markets, and distributes vehicles and vehicle parts, and sells financial services. With global headquarters at the Renaissance Center in Detroit, Michigan, United States, GM manufactures cars and trucks in 35 countries.", 1908);
		companyService.createCompany("Toyota", "Toyota Motor Corporation is a Japanese multinational automotive manufacturer headquartered in Toyota, Aichi, Japan. In 2017, Toyota's corporate structure consisted of 364,445 employees worldwide and, as of October 2016, was the fifth-largest company in the world by revenue.", 1937);
		companyService.createCompany("Volkswagen", "Volkswagen, shortened to VW, is a German automaker founded on May 28, 1937 by the German Labour Front and headquartered in Wolfsburg. It is the flagship marque of the Volkswagen Group, the largest automaker by worldwide sales in 2016.", 1937);
		companyService.createCompany("Fiat Chrysler Automobiles", "Fiat Chrysler Automobiles N.V. (abbreviated as FCA) is an Italian-controlled multinational corporation incorporated in the Netherlands, and currently the world’s seventh-largest auto maker. The group was established in late 2014 by merging Fiat S.p.A. into a new holding company, FCA (with headquarters in London) for tax purposes.", 2014);
		companyService.createCompany("Honda", "Honda Motor Co., Ltd. is a Japanese public multinational conglomerate corporation primarily known as a manufacturer of automobiles, aircraft, motorcycles, and power equipment.", 1946);

	}
}
