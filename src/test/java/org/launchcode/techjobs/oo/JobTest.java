package org.launchcode.techjobs.oo;


import org.junit.Test;

import java.util.Objects;

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

    // Test 3: Test two Job objects that have identical field values EXCEPT for id.
    // Test 3: Tests equals() - Test that equals returns false.
    @Test
    public void testJobsForEquality(){
        Job jobObj1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        Job jobObj2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

//        assertFalse("Job class assigns unique IDs for every new entry", jobObj1.equals(jobObj2));         // ----- delete later
        assertNotEquals("Job class assigns unique IDs for every new entry", jobObj1, jobObj2);
    }

    // Test 4: When passed a Job object, it should return a string that contains a
    // blank line before and after the job information.
    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        // In windows, new line is represented by '\r\n' while Linux uses '\n' as newline.
        // So System.lineSeparator() takes line separator of the current os.
        // \r or Carriage Return puts cursor at the start of the line
        // \n adds a new line & places cursor at the start
        // System. lineSeparator() represents \r\n

        Job jobObj = new Job();                 // --- test fails coz empty job object throws Null Pointer Exception
        Job jobObj2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));

//        String strExpected = "\n" + "\n";
//        String strExpected = System.lineSeparator();

        String strExpected = "\r";
        String strActual = jobObj2.toString();
        String [] wordActual = strActual.split("\n");

        assertEquals("Line separator before text", strExpected, wordActual[0]);
        assertEquals("Line separator after text", strExpected, wordActual[wordActual.length -1]);

//        assertEquals("line separator before & after text", strExpected, jobObj.toString());
    }

    // Test 5: The string should contain a label for each field, followed by the data
    // stored in that field. Each field should be on its own line.
    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job jobObj3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        int testId = jobObj3.getId();

        String lSep = System.lineSeparator();
        String strExpected = lSep +
                            "ID: " + testId + "\n" +
                            "Name: " + "Product tester" + "\n" +
                            "Employer: " + "ACME" + "\n" +
                            "Location: "+ "Desert" + "\n" +
                            "Position Type: "+ "Quality Control" + "\n" +
                            "Core Competency: "+ "Persistence" + "\n" +
                            lSep ;

        assertEquals("String contains correct labels & data", strExpected, jobObj3.toString());
    }

    // Test 6: If a field is empty, the method should add, “Data not available” after the label.
    @Test
    public void testToStringHandlesEmptyField(){
//        Job jobObj = new Job();
//        String strActual = jobObj.toString();
//        String [] wordActual = strActual.split("\n");
//
//        for(int i=1; i < wordActual.length-1; i++){
//            assertEquals("If field is empty, “Data not available” should be displayed", true, wordActual[i].contains("Data not available"));

        Job jobObj2 = new Job("", new Employer("ACME"), new Location(""), new PositionType(""), new CoreCompetency("Persistence"));
        int testId = jobObj2.getId();
        String strNotAvl = "Data not available";

        String lSep = System.lineSeparator();
        String strExpected = lSep +
                "ID: " + testId + "\n" +
                "Name: " + strNotAvl + "\n" +
                "Employer: " + "ACME" + "\n" +
                "Location: " + strNotAvl + "\n" +
                "Position Type: " + strNotAvl + "\n" +
                "Core Competency: " + "Persistence" + "\n" +
                lSep ;

        assertEquals("String Handles Empty Field", strExpected, jobObj2.toString());
        }



    // Test 7: (Optional) Task #5.4 If a Job object ONLY contains data for the id field,
    // the method should return, “OOPS! This job does not seem to exist.”
    @Test
    public void testEmptyJobObject(){
        Job jobObj = new Job();
//        Job jobObj2= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
//
        assertEquals("OOPS! This job does not seem to exist.", jobObj.toString());
//
////        assertEquals("OOPS! This job does not seem to exist.”", assertThrows(NullPointerException.class, () -> new Job().toString()));
//
////        assertNotNull("OOPS! This job does not seem to exist.", jobObj);
////        assertNull("OOPS! This job does not seem to exist. job.getName() failed.", jobObj2.getName());
////        assertNull("OOPS! This job does not seem to exist. jobObj.getEmployer() failed.", jobObj.getEmployer());
////        assertNull("OOPS! This job does not seem to exist", jobObj.getLocation());
////        assertNull("OOPS! This job does not seem to exist", jobObj.getPositionType());
////        assertNull("OOPS! This job does not seem to exist", jobObj.getCoreCompetency());
    }

}
