package com.logic.demo.services;

import com.logic.demo.model.EmpType;
import com.logic.demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StaffingProviderService {

    public Employee getEmployee() {

        return new Employee(EmpType.ASSOCIATE, UUID.randomUUID());

    }


}
