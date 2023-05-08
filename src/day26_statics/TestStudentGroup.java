package day26_statics;

public class TestStudentGroup {
    public static void main(String[] args) {


        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("Glenio", 24, 'M', "B34");
        Student student3 = new Student("Sumeyye", 22, 'F', "C56");
        Student student4 = new Student("Mehmet", 25, 'M', "D43");
        Student student5 = new Student("Sebastian", 23, 'M', "E27");

        StudentsGroup group1 = new StudentsGroup("Java Turtles", 1);

        Student [] students = {student2,student3, student4};
        System.out.println(group1);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group1.addStudent(student4);
        group1.addStudent(student5);

        group1.addStudent(students);








    }
}