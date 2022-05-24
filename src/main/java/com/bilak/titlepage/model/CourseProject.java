package com.bilak.titlepage.model;

/**
 * @author Yuliana
 * @version 1.0.0
 * @title Lab 13
 * @group 243Б(2)
 * @department PZKS
 * @project TitlePage
 * @class CourseProject
 * @since 5/1/2022 - 21.09
 **/
public class CourseProject {
    private String university;
    private String department;
    private String discipline;
    private String topic;
    private int yearOfStudy;
    private String group;
    private String specialtyCode;
    private String specialty;
    private String author;
    private String advisor;
    private String normcontroller;
    private String city;
    private int year;

    public CourseProject() {
    }

    public CourseProject(String university, String department, String discipline, String topic, int yearOfStudy, String group,
                         String specialtyCode, String specialty, String author, String advisor, String normcontroller,
                         String city, int year) {
        this.university = university;
        this.department = department;
        this.discipline = discipline;
        this.topic = topic;
        this.yearOfStudy = yearOfStudy;
        this.group = group;
        this.specialtyCode = specialtyCode;
        this.specialty = specialty;
        this.author = author;
        this.advisor = advisor;
        this.normcontroller = normcontroller;
        this.city = city;
        this.year = year;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSpecialtyCode() {
        return specialtyCode;
    }

    public void setSpecialtyCode(String specialtyCode) {
        this.specialtyCode = specialtyCode;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getNormcontroller() {
        return normcontroller;
    }

    public void setNormcontroller(String normcontroller) {
        this.normcontroller = normcontroller;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
