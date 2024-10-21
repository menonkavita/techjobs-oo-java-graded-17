package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField{

//    private int id;
//    private static int nextId = 1;
//    private String value;

    public Employer() {
//        id = nextId;
//        nextId++;
        super();
    }

    public Employer(String value) {
        super(value);
//        this();
//        this.value = value;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {       // Two objects are equal if they have the same id.
//        if (this == o) return true;
//        if (!(o instanceof Employer)) return false;
//        Employer employer = (Employer) o;
//        return getId() == employer.getId();
        return super.equals(o);
    }

    @Override
    public int hashCode() {
//        return Objects.hash(getId());
        return super.hashCode();
    }

    // Getters and Setters:

    public int getId() {
        return super.getId();
    }

    public String getValue() {
        return super.getValue();
    }

    public void setValue(String value) {
        super.setValue(value);
    }

}
