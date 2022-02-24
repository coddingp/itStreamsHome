package com.company;

public class Student {
    private String name;
    private int id;
    private int mark;

    public Student(String name, int id, int mark) {
        this.name = name;
        this.id = id;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", mark=" + mark +
                '}';
    }
}
