package org.launchcode.techjobs.oo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(job);
//        Employer test = new Employer("hi");
//        Employer test2 = new Employer("bye");
//        Location location = new Location("hi");
//        CoreCompetency coreCompetency = new CoreCompetency("zuan");
//        PositionType positionType = new PositionType("xuan");
//        System.out.println(test.getId());
//        System.out.println(test2.getId());
//        System.out.println(location.getId());
//        System.out.println(coreCompetency.getId());
//        System.out.println(positionType.getId());
//        System.out.println(positionType.getValue());

//        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job job2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));
//        Job job3 = new Job("Ice cream tester", new Employer(""), new Location("Home"), new PositionType("UX"), new CoreCompetency("Tasting ability"));
//
//        ArrayList<Job> jobs = new ArrayList<>();
//        jobs.add(job1);
//        jobs.add(job2);
//        jobs.add(job3);
//
//        for (Job job : jobs){
//            System.out.println(job);
//        }
    }

}
