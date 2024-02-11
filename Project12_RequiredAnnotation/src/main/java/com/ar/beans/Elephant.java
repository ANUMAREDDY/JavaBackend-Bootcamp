package com.ar.beans;

import org.springframework.beans.factory.annotation.Required;

public class Elephant {
    // Bean Properties
    private Integer id;
    private String name;
    private String group;
    private String area;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    @Required
    public void setId(Integer id) {
        System.out.println("Id");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Name");
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        System.out.println("Group");
        this.group = group;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        System.out.println("Area");
        this.area = area;
    }

    @Override
    public String toString() {
        return "Elephant [id=" + id + ", name=" + name + ", group=" + group + ", area=" + area + "]";
    }
}
