package com.student.model;

import javax.lang.model.element.NestingKind;


public class Student {
        private int id;
        private String sno;
        private String name;
        private String sex;
        private String department;
        private String homeTown;
        private String mark;
        private String email;
        private String tel;
}

public int getId() {
        return id;
}

public void setId(int id) {
        this.id = id;
}

public String getSno() {
        return sno;
}


public String getName() {
        return name;
}

public void setName() {
        this.name = name
}

public String getSex(){
        return sex;
}

public void setSex(String sex) {
        this.sex = sex;
}

public String getDepartment(){
        return department;
}

public void setDepartment(String department){
        this.department = department;
}

public String getHomeTown() {
        return homeTown;
}

public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
}

public String getMark() {
        return mark;
}

public void setMark(String mark){
        this.mark = mark;
}

public String getEmail() {
        return email;
}

public void setEmail(String email) {
        this.email = email;
}

public String getTel() {
        return tel;
}

public void setTel(String tel) {
        this.tel = tel;
}