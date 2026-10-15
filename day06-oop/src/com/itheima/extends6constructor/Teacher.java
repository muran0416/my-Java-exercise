package com.itheima.extends6constructor;

public class Teacher extends Pepole {
    private String skill;

    public Teacher() {
    }

    public Teacher(String name, String skill, char sex) {
        super(name,sex);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
