package org.example.entity;

import java.util.Objects;

public class Employee {
    private  int id;
    private String firstname ;

    private  String lastname;

    public Employee(int id, String name, String lastname) {
        this.firstname  = name;
        this.id = id;
        this.lastname = lastname;
    }



    public String getFirstname() {
        return firstname ;
    }

    public void setFirstName(String name) {
        this.firstname  = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + firstname  + '\'' +
                ", id=" + id +
                ", lastName='" + lastname + '\'' +
                '}';
    }



}
