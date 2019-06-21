package com.virtusa.banking.equaloverride;

 

import java.util.Random;

 

public class Employee 
//implements Comparable 
{
    
    private int employeeId;
    private String name;
    private String remarks;
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return new Random().nextInt();
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        
        Employee emp=(Employee) obj;
        if(this.remarks.equals(emp.remarks))
            return true;
        else
            return false;
    }
//    @Override
//    public int compareTo(Object obj) {
//        // TODO Auto-generated method stub
//        Employee emp=(Employee) obj;
//        return this.name.compareTo(emp.name);
//    }
    
    

 

}