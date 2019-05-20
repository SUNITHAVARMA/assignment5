package main.com.stackroute.pe5;


import java.util.Comparator;

public class StudentSorter implements Comparator<Student>
{

    public int compare(Student studentObject1, Student studentObject2) {

        //This condition checks the students age
        if (studentObject1.getAge() < studentObject2.getAge()) { return 1; }

        //This condition checks the students age and returns students in descending order.
        else if (studentObject1.getAge() > studentObject2.getAge()) { return -1; }
        else {
                //This condition compares the student names using compareTo() method
                if (studentObject1.getName().compareTo(studentObject2.getName()) < 0) { return 1; }

                //This condition compares the student names using compareTo() method and returns students in descending order based on names.
                else if (studentObject1.getName().compareTo(studentObject2.getName()) > 0) { return -1; }
                else {
                        //This statement compares id of students
                        if (studentObject1.getId() < studentObject2.getId()) { return 1; }

                        //This statement compares id of students and returns students indescending order based on id's.
                        else if (studentObject1.getId() > studentObject2.getId()) { return -1; }
                        else {
                                 return 0;
                             }
                     }
            }
        }
}


