package com.devfii.sb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration;


@SpringBootApplication
//(exclude = SqlInitializationAutoConfiguration.class)
public class SbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbApplication.class, args);
	}

}
