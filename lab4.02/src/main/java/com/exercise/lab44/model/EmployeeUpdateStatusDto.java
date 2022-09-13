package com.exercise.lab44.model;

import com.sun.istack.NotNull;

public class EmployeeUpdateStatusDto {
    @NotNull
    private EmployeeStatus status;

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }
}
