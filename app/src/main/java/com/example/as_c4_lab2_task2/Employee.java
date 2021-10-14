package com.example.as_c4_lab2_task2;

import java.util.ArrayList;

public class Employee
{
private String fName;
private String sName;
private String rating;
private String strok;
private String project;
private String team;
private int photo;
    public Employee(String fname, String sname, int photo,String rating,String strok,String project,String team)
    {
        this.fName = fname;
        this.sName = sname;
        this.photo = photo;
        this.rating = rating;
        this.strok = strok;
        this.project = project;
        this.team = team;
    }
    public String getfName() {
        return this.fName;
    }
    public void setfName(String name) {this.fName = name;}

    public String getRating() { return this.rating; }
    public void setRating(String name) {this.rating = name;}

    public String getsName() {
        return this.sName;
    }
    public void setsName(String name) {
        this.sName = name;
    }

    public String getStrok() {
        return this.strok;
    }
    public void setStrok(String name) {this.strok = name;}

    public String getProject() {
        return this.project;
    }
    public void setProject(String name) {this.project = name;}

    public String getTeam() {
        return this.team;
    }
    public void setTeam(String name) {this.team = name;}

    public int getPhoto()
    {
        return this.photo;
    }
    public void setPhoto(int photo)
    {
        this.photo = photo;
    }
    public static ArrayList<Employee> createList() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alexander","Timonin",R.drawable.emp1,"4","25633","3","TRY"));
        employees.add(new Employee("Alexander","Timonin",R.drawable.emp2,"5","2554233","3","CATCH"));
        employees.add(new Employee("Kirill","Sagitov",R.drawable.emp3,"4.5","87833","10","ONE"));
        return employees;
    }
}
