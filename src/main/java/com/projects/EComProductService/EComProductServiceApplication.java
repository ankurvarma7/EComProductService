package com.projects.EComProductService;

import com.projects.EComProductService.services.InitService;
import com.projects.EComProductService.services.InitServiceImpl;
import com.projects.EComProductService.services.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EComProductServiceApplication implements CommandLineRunner {

	private InitService initService;

	public EComProductServiceApplication(InitService initService1){
		initService=initService1;
	}
	public static void main(String[] args) {
		SpringApplication.run(EComProductServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		initService.initialize();
	}
}
