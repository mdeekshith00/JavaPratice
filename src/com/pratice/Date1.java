package com.pratice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime current = LocalDateTime.now();
		Month month = current.getMonth();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("24-01-2025");
		
		System.out.println(date);
		System.out.println(time);
		System.out.println(current);
		System.out.println(month);
		System.out.println(format);

	}

}
