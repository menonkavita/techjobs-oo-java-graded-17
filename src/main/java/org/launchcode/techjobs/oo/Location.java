package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Location extends JobField{

//    private int id;
//    private static int nextId = 1;
//    private String value;

    public Location() {
        super();
//        id = nextId;
//        nextId++;
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.
    public Location(String aValue){
        super(aValue);
//        this();
//        this.value =  aValue;
    }

    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Location)) return false;
//        Location location = (Location) o;
//        return getId() == location.getId();
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
//        this.value = value;
    }

}
