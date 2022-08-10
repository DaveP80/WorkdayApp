package com.logic.demo.services;

import com.logic.demo.model.EmpType;
import com.logic.demo.model.Employee;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Profile("dev")
public class ManagerProviderServiceImpl implements StaffingProviderService {
    @Override
    public Employee getEmployee() {
        return new Employee(EmpType.MANAGER, UUID.randomUUID());
    }
}
