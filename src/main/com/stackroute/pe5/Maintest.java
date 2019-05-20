package main.com.stackroute.pe5;

import main.com.stackroute.pe5.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Maintest {
    public static void main(String[] args) {
        //This statement is used to create ArrayList.
        List<Student> studentObjects=new ArrayList<Student>();

        //These statements are used to create the objects for Student class.
        Student student1=new Student(1,20,"sunitha");
        Student student2=new Student(2,23,"varma");
        Student student3=new Student (3,20,"latha");
        Student student4=new Student(4,22,"valli");
        Student student5=new Student(5,21,"chinni");

        //These statements are used to add the student objects into ArrayList.
        studentObjects.add(student1);
        studentObjects.add(student2);
        studentObjects.add(student3);
        studentObjects.add(student4);
        studentObjects.add(student5);

        //This statement used used to sort the objects
        Collections.sort(studentObjects,new StudentSorter());

        //This statement is used to iterate the student objects by using Iterator.
        Iterator iterator=studentObjects.iterator();
        while(iterator.hasNext()){

            //next() is used to iterate the next student object.
            Student studentObject=(Student) iterator.next();
            System.out.println(studentObject.getId()+"\t"+studentObject.getName()+"\t"+studentObject.getAge());
        }
    }

}
