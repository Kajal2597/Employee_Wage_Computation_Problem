/*
Author:Kajal Gaikwad
Purpose: Calculate daily wage for full-time and part-time employees based on attendance using switch-case statement.
Date: 26/9/24
*/
//Add Part time Employee & Wage Using Switch Case
package com.Bridzlab.EmployeeWage;
public class EmployeeWageComputation {
    public static void main(String args[])
    {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        int WAGE_PER_HR = 20;
        int empType = (int) (Math.random() * 10) % 3;
        int workingHours =0;
        switch (empType)
        {
            case FULL_TIME:
                System.out.println("Employee is Present Full time");
                workingHours = 8;
                break;
            case PART_TIME:
                System.out.println("Employee is Present Part time");
                workingHours = 4;
                break;
            default:
                System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);
    }
}