package day35_polymorphism;

import java.util.*;


import day33_abstraction.employeeTask.*;

public class EmployeeTask {

    public static void main(String[] args) {


        Employee[] employees = {new Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Tester("George", 28, 'M', "A03", "SDET", 120000),
                new Developer("Yulia", 23, 'F', "A04", "Software Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M', "A05", "SDET", 105000),
                new Developer("Gulistan", 26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Tester("Nora", 28, 'F', "A07", "QE", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Developer("Diana", 29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Tester("Tatiana", 25, 'F', "A09", "SDET", 130000),
                new Developer("Alena", 26, 'F', "A10", "Back-end Developer", 150000, "Java"),
                new Tester("Timur", 29, 'M', "A11", "SDET", 115000),
                new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000),
                new Developer("Hasan", 26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Tester("Nataliia", 24, 'F', "A13", "QE", 125000),
                new Developer("Ermek", 26, 'M', "A14", "Full Stack Developer", 142000, "Java"),
                new Tester("Khashayar", 30, 'M', "A15", "SDET", 105000),
        };

        for (Employee each : employees) {

            System.out.println(each.getName() + ": " + each.getJobTitle());

        }

        int countOfDevelopers = 0,
        countOfTesters = 0,
        countOfDrivers = 0,
                countOfTeachers = 0;



        for (Employee each : employees) {

            if (each instanceof Developer){
                countOfDevelopers++;
            } else if (each instanceof Teacher) {
                countOfTesters++;
            } else if (each instanceof Driver) {
                countOfDrivers++;
            } else {
                countOfTeachers++;
            }

        }

        System.out.println("countOfDevelopers = " + countOfDevelopers);
        System.out.println("countOfTesters = " + countOfTesters);
        System.out.println("countOfDrivers = " + countOfDrivers);
        System.out.println("countOfTeachers = " + countOfTeachers);

        for (Employee each : employees) {

            if (!(each instanceof Developer)){
                System.out.println(each.getName());
            }

        }

        List<Employee> scrumMembers = new ArrayList<>();

        for (Employee eachEmployee : employees) {

            if ((eachEmployee instanceof Developer) || (eachEmployee instanceof Tester)){

                scrumMembers.add(eachEmployee);
            }

        }

        for (Employee scrumMember : scrumMembers) {
            System.out.println(scrumMember);

        }

        List<Tester> testers = new ArrayList<>();

        for (Employee eachEmployee : employees) {

            if (eachEmployee instanceof Tester){

                testers.add((Tester) eachEmployee);
            }

        }

        List<Developer> developers = new ArrayList<>();

        for (Employee eachEmployee : employees) {

            if (eachEmployee instanceof Developer){
                developers.add((Developer) eachEmployee);
            }

        }

        double maxSalaryTester = testers.get(0).getSalary();

        for (Tester eachTester : testers) {

            if (eachTester.getSalary() > maxSalaryTester){
                maxSalaryTester = eachTester.getSalary();
            }

        }

        for (Tester eachTester : testers) {

            if (eachTester.getSalary() == maxSalaryTester){
                System.out.println( eachTester.getName() + " is a tester who has the maximum salary");
            }

        }

        double maxSalaryDeveloper = developers.get(0).getSalary();

        for (Developer eachDeveloper : developers) {

            if (eachDeveloper.getSalary() > maxSalaryDeveloper){
                maxSalaryDeveloper = eachDeveloper.getSalary();
            }

        }
        for (Developer eachDeveloper : developers) {

            if (eachDeveloper.getSalary() == maxSalaryDeveloper){

                System.out.println( eachDeveloper.getName() + " is a developer who has the maximum salary");
            }

        }






        /*store all the developers & testers into the following List of employees
        List<Employee> scrumMembers = new ArrayList<>();

        2.2 store all the testers into the following List of testers:
        List<Tester> testers = new ArrayList<>();

        2.3 store all the developers into the following List of developers:
        List<Developer> developers = new ArrayList<>();

        2.4 which tester has the maximum salary?

        2.5 which developer has the maximum salary?

         */


    }
}

