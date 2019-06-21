package com.virtusa.banking.equaloverride;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Appraisal {
	public static void main(String[] args)
    {
        Employee[] employees=new Employee[5];
        
        /*employees[0]=new Employee();
        employees[0].setEmployeeId(154213);
        employees[0].setName("Gladson");
        employees[0].setRemarks("Excellent");
        employees[1]=new Employee();
        employees[1].setEmployeeId(15423);
        employees[1].setName("Gladson");
        employees[1].setRemarks("Outstanding");
        
        
        if(employees[0].equals(employees[1]))
        {
            System.out.println("They are in same rank");
            System.out.println(employees[0].hashCode());
            System.out.println(employees.clone()[1].hashCode());
        }
        else
        {
            System.out.println("They are in diff rank");
            System.out.println(employees[0].hashCode());
            System.out.println(employees.clone()[1].hashCode());
        }*/
        
        Scanner read=new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            employees[i]=new Employee();
            employees[i].setEmployeeId(new Random().nextInt(100000));
            System.out.println("enter the name");
            employees[i].setName(read.nextLine());
            System.out.println("Enter the Remarks");
            employees[i].setRemarks(read.nextLine());
            
        }
        
        Arrays.sort(employees);
        for(Employee emp:employees)
        {
            System.out.print(emp.getEmployeeId()+"\t");
            System.out.print(emp.getName()+"\t");
            System.out.println(emp.getRemarks()+"\t");
        }
        
        
    }
}
