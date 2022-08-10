package com.logic.demo.model;

import java.util.UUID;

public class Employee {

    //these plain objects define our employees
    // type is job title

    private EmpType type;
    private UUID empNumber;

    public Employee (EmpType type, UUID empNumber) {
        this.type = type;
        this.empNumber = empNumber;
    }

    public EmpType getType() {
        return type;
    }

    public void setType(EmpType type) {
        this.type = type;
    }

    public UUID getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(UUID empNumber) {
        this.empNumber = empNumber;
    }
}
