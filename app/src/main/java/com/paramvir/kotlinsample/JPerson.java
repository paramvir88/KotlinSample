package com.paramvir.kotlinsample;

import java.util.Objects;

public class JPerson {

    private String name;
    private String account;
    private String id;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "JPerson{" +
                "name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", id='" + id + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JPerson jPerson = (JPerson) o;
        return Objects.equals(id, jPerson.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
