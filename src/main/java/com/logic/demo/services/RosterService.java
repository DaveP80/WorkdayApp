package com.logic.demo.services;

import com.logic.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RosterService {

    //spring will automatically look for beans that implement Staffing ProviderService

    private final StaffingProviderService staffingProviderService;

    @Autowired
    public RosterService(StaffingProviderService staffingProviderService) {
        this.staffingProviderService = staffingProviderService;
    }

    public Employee startShift() {

        Employee employee = staffingProviderService.getEmployee();
        System.out.println(employee.getType().toString() + " with emp ID (#" + employee.getEmpNumber().toString() + ") has clocked in");

        return employee;

    }

    public void endShift(Employee employee) {

        System.out.println(employee.getType().toString() + " with emp ID (#" + employee.getEmpNumber().toString() + ") has clocked out");


    }


}
