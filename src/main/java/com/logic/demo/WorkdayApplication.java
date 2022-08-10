package com.logic.demo;

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
		rosterService.startShift();
	}
}
