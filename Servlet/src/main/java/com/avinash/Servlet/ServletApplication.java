package com.avinash.Servlet;

import com.avinash.Servlet.dto.Repo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		SpringApplication.run(ServletApplication.class, args);
		System.out.println("Hello World...!");
		Repo repo = new Repo();
		repo.getData(1);
		repo.getData(2);
	}

}
