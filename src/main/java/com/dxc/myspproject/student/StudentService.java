package com.dxc.myspproject.student;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class StudentService {
	public Student getStudents() {
		return new Student(1L,
				"Thanh",
				"thanhcong.bui@dxc.com",
				LocalDate.of(1999, 12, 13),
				23);
	}
}
