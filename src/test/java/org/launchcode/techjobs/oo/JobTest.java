package org.launchcode.techjobs.oo;


import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    // Test #1 - Each Job object should have a unique ID that is an integer.
    // Test #1: Empty Constructor
    @Test
    public void testSettingJobId(){
        Job jobObj1 = new Job();
        Job jobObj2 = new Job();

        assertNotEquals("New Job objects have unique IDs", jobObj1.getId(), jobObj2.getId());
    }

    // Test #2: Use assertTrue and assertEquals statements to test if the constructor correctly assigns both
    // the class and value of each field.
    // Test #2: Test the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobObj= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));


        Employer empTest= new Employer();
        Location locTest = new Location();
        PositionType posTest = new PositionType();
        CoreCompetency compTest = new CoreCompetency();
        Job jobTest = new Job();

        // Check: Difference between instanceof & getClass(). Merits of each.
        assertTrue("First parameter of type Job in Job class getting set correctly", jobObj.getName() instanceof String);
        assertTrue("Second parameter of type Employee in Job class getting set", jobObj.getEmployer().getClass() == empTest.getClass());
        assertTrue("Third parameter of type Employee in Job class getting set", jobObj.getLocation().getClass() == locTest.getClass());
        assertTrue("Fourth parameter of type Employee in Job class getting set", jobObj.getPositionType().getClass() == posTest.getClass());
        assertTrue("Fifth parameter of type Employee in Job class getting set correctly", jobObj.getCoreCompetency().getClass() == compTest.getClass());

        assertEquals("Job getting set by Constructor correctly", jobObj.getName(),"Product tester");
        assertEquals("Employer in Job class getting set by Constructor correctly", jobObj.getEmployer().getValue(),"ACME");
        assertEquals("Location in Job class getting set by Constructor correctly", jobObj.getLocation().getValue(),"Desert");
        assertEquals("PositionType in Job class getting set by Constructor correctly", jobObj.getPositionType().getValue(),"Quality Control");
        assertEquals("CoreCompetency name in Job class getting set by Constructor correctly", jobObj.getCoreCompetency().getValue(),"Persistence");
    }

    @Test
    public void testJobsForEquality(){
        Job jobObj1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job jobObj2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

//        assertFalse("Job class assigns unique IDs for every new entry", jobObj1.equals(jobObj2));         // ----- delete later
        assertNotEquals("Job class assigns unique IDs for every new entry", jobObj1, jobObj2);
    }

}
