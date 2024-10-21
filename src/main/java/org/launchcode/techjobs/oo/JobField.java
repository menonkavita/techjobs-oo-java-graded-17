package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // toString() only returns the data stored in variable 'value'
    @Override
    public String toString() {
        return value;
    }

    // equals()
    // equals() from CoreCompetency class
    //    public boolean equals(Object o) {
    //        if (this == o) return true;
    //        if (!(o instanceof CoreCompetency)) return false;
    //        CoreCompetency that = (CoreCompetency) o;
    //        return id == that.id;
    //    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField jobField)) return false;
        return id == jobField.id;
    }

    // hashCode()
    // Objects.hashCode(): use to get the hashcode of a single object that might be null. It will throw an exception if the object is null.
    // Objects.hash(): use to get a hashcode for multiple objects.
    @Override
    public int hashCode() {
        return Objects.hash(id);            // Changed from generated() Objects.hashCode(id) to Objects.hash(id)
    }
}
