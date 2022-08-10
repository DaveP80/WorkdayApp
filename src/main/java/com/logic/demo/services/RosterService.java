package com.logic.demo.services;

import com.logic.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RosterService {

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

}