
package com.dxc.myspproject.student;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student thanh = new Student(
					"Thanh",
					"thanhcong.bui@dxc.com",
					LocalDate.of(1999, 12, 13));
			
			Student alex = new Student(
					"Alex",
					"alex@dxc.com",
					LocalDate.of(2001, 12, 5));	
			
			repository.saveAll(
				Arrays.asList(thanh, alex)
			);
		};
	}
}
