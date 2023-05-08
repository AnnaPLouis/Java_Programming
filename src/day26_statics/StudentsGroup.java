package day26_statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {

    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();


    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addStudent(Student [] students){
        this.students.addAll(Arrays.asList(students));
    }
    public void addStudent(String name, int age, char gender, String id){
        //Student student = new Student(name,age,gender,id);
        students.add(new Student(name,age,gender,id));

    }

    public void removeStudent(String id){

        students.removeIf(p -> p.id.equals(id));

    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
