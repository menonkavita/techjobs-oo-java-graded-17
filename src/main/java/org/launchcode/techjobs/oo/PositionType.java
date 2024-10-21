package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField{

//    private int id;
//    private static int nextId = 1;
//    private String value;

    public PositionType() {
        super();
//        id = nextId;
//        nextId++;
    }

    public PositionType(String value) {
        super(value);
//        this();
//        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString(){
        return super.toString();
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.


    @Override
    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof PositionType that)) return false;
//        return id == that.id;
        return super.equals(o);
    }


    @Override
    public int hashCode() {
//        return Objects.hash(id);    // Changed from generated () Objects.hashCode(id) to Objects.hash(id)
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
