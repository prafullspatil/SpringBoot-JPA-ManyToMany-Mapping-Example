package com.mb.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mb.jpa.*")
@EntityScan("com.mb.jpa.*")
public class SpringbootJpaManyToManymapping1Application
{

	public static void main(String[] args)
	{
		SpringApplication.run(SpringbootJpaManyToManymapping1Application.class, args);
	}

}
