package com.lakshx;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {

        return baseSalary + (extraHours * getHourlyRate());
    }
    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Base Salary Cannot be Zero or Less!");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {

        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 10)
            throw new IllegalArgumentException("Hourly rate cannot be 10 or Less!");
        this.hourlyRate = hourlyRate;
    }
}
