/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.cphbusiness.jpa;

import javax.persistence.Entity;
import javax.persistence.Id;


/**
 *
 * @author sofus
 */
 @Entity
public class Student {
    private String name;
    private String cpr;
    private String address;
    @Id
    private String studentId;
    private String email;
    private String tlf;

    public Student() {
    }

    public Student(String name, String cpr, String email) {
        this.name = name;
        this.cpr = cpr;
        this.email = email;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTlf() {
        return tlf;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }
    
    
}
