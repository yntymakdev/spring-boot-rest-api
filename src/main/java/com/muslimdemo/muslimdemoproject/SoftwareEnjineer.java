package com.muslimdemo.muslimdemoproject;

import java.util.Objects;

public class SoftwareEnjineer {
    private Integer id;
    private String name;
    private String techStack;
    public SoftwareEnjineer(Integer id, String name, String techStack) {

    }

    public SoftwareEnjineer(String techStack, String name, Integer id) {
        this.techStack = techStack;
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareEnjineer that = (SoftwareEnjineer) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, techStack);
    }
}
