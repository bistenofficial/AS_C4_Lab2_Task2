package com.example.as_c4_lab2_task2;

import java.util.ArrayList;

public class Employee
{
private String fName;
private String sName;
private int photo;
    public Employee(String fname, String sname, int photo)
    {
        this.fName = fname;
        this.sName = sname;
        this.photo = photo;
    }
    public String getfName() {
        return this.fName;
    }
    public void setfName(String name) {this.fName = name;}

    public String getsName() {
        return this.sName;
    }
    public void setsName(String name) {
        this.sName = name;
    }

    public int getPhoto()
    {
        return this.photo;
    }
    public void setPhoto(int photo)
    {
        this.photo = photo;
    }
    public static ArrayList<Employee> createList() {
        ArrayList<Employee> states = new ArrayList<>();
        states.add(new Employee("Alexander","Timonin",R.drawable.emp1));
        states.add(new Employee("Alexander","Timonin",R.drawable.emp2));
        states.add(new Employee("Kirill","Sagitov",R.drawable.emp3));
        return states;
    }
}
