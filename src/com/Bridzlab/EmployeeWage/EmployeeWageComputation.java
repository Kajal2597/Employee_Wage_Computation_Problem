/*
Author:Kajal Gaikwad
Purpose: Calculate daily wage for full-time and part-time employees based on attendance using switch-case statement.
Date: 26/9/24
*/
//Add Part time Employee & Wage
package com.Bridzlab.EmployeeWage;

public class EmployeeWageComputation {
    public static void main(String args[])
    {
        int FULL_TIME = 2;
        int PART_TIME = 1;
        int WAGE_PER_HR = 20;
        int workingHours = 0;
        double empType = Math.floor(Math.random() * 10) % 3; //Math Floor Function
        if (empType == FULL_TIME)
        {
            System.out.println("Employee is Present Full Time");
            workingHours = 8;
        }
        else if (empType == PART_TIME)
        {
            System.out.println("Employee is Present Part Time");
            workingHours = 4;
        }
        else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR; //Calculate wage
        System.out.println("Employee Daily Wage is " + wage);
    }
}