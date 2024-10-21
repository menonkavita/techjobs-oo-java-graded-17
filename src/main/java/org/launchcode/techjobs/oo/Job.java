package org.launchcode.techjobs.oo;

import java.util.Objects;


public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job(){
        this.id=nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();                                       // initializing id field using empty constructor
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
// Came with Starter code
// public boolean equals(Object o) {
//    if (this == o) return true;
//    if (!(o instanceof Location)) return false;
//    Location location = (Location) o;
//    return getId() == location.getId();
//}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job job)) return false;      // ?? find info on this type of casting
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);        // Two objects are equal if they have the same id.
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }


    // toString method

    @Override
    public String toString() {

    // Testing out Task #5.4 - (Optional) If a Job object ONLY contains data for the id field,
    // the method should return, “OOPS! This job does not seem to exist.”

//      Another Option to catch null objects / perform null checks:
//        if(!strId.isEmpty()){
//            if(Objects.isNull(getName()) && Objects.isNull(getEmployer())  && Objects.isNull(getLocation())
//                && Objects.isNull(getPositionType()) && Objects.isNull(getCoreCompetency())){
//                return "OOPS! This job does not seem to exist.";
//            }

        String notAvl = "Data not available";
        String strId = Integer.toString(getId());

        // Performs null checks without throwing Null Pointer Exception
        if(!strId.isEmpty()){
            if(Objects.isNull(getName()) && getEmployer() == null  && getLocation() == null
                    && getPositionType() == null && getCoreCompetency() == null){
                return "OOPS! This job does not seem to exist.";
            }
        } // end of if !strId.isEmpty()


        // new line in windows is represented by '\r\n' while in Linux it is '\n'
        // So System.lineSeparator() takes line separator of the current os.
        //  String strReturn = "\r\n" + "Testing" + "\r\n";

            String strReturn = System.lineSeparator() +
                "ID: " + (!strId.isEmpty() ? strId : notAvl) + "\n" +
                "Name: " + (!getName().isEmpty() ? getName() : notAvl) + "\n" +
                "Employer: " + (!getEmployer().getValue().isEmpty() ? getEmployer().getValue() : notAvl) + "\n" +
                "Location: " + (!getLocation().getValue().isEmpty() ? getLocation().getValue() : notAvl) + "\n" +
                "Position Type: " + (!getPositionType().getValue().isEmpty() ? getPositionType().getValue() : notAvl) + "\n" +
                "Core Competency: " + (!getCoreCompetency().getValue().isEmpty() ? getCoreCompetency().getValue() : notAvl) + "\n" +
                System.lineSeparator();

        return strReturn;

    }
}
