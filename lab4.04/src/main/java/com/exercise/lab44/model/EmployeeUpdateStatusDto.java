package com.exercise.lab44.model;

import com.sun.istack.NotNull;

public class EmployeeUpdateStatusDto {
    @NotNull
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
