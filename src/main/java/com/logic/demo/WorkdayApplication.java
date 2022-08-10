package com.logic.demo;

import com.logic.demo.model.Employee;
import com.logic.demo.services.RosterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


//this app will have a couple enums, associate and manager, return
//string of reporting their state, clockin in or working, or clocked out
@SpringBootApplication
public class WorkdayApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(WorkdayApplication.class, args);

		RosterService rosterService = context.getBean(RosterService.class);
		Employee employee = rosterService.startShift();
		rosterService.endShift(employee);
		//how do we choose which bean to call, we now have 2 beans, manager and associate
	}
}
