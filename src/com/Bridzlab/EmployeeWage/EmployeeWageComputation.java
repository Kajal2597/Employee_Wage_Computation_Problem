/*
Author:Kajal Gaikwad
Purpose: Calculate daily wage for full-time and part-time employees based on attendance using switch-case statement.
Date: 26/9/24
*/
//UC1 Check employee is present or absent
//UC2 Updated Calculate daily employee wage
//UC3 Updated part-time employee & wage
//UC4 Updated Using switch case statement
//UC5 Updated Calculating wages for a month
package com.Bridzlab.EmployeeWage;
public class EmployeeWageComputation {
    public static void main(String args[])
    {
        final int PART_TIME = 1;
        final int FULL_TIME = 2;
        final int WAGE_PER_HR = 20;
        final int WORKING_DAYS = 30;
        int totalWage = 0;
        for (int day = 1; day <= WORKING_DAYS; day++)
        {
            int empType = (int) (Math.random() * 100) % 3;
            int workingHours =0;
            switch (empType)
            {
                case FULL_TIME:
                    workingHours = 8;
                    break;
                case PART_TIME:
                    workingHours = 4;
                    break;
                default:
            }
            int wage = workingHours * WAGE_PER_HR;
            System.out.println("Day " + day + " wage is:" + wage);
            totalWage += wage;
        }
        System.out.println("Total wage for a month is " + totalWage);
    }
}