package main.com.stackroute.pe5;

public class Student
{
    //Declaration of private variables.
    private int id;
    private int age;
    private String name;

    //Student class constructor.
    public Student(int id,int age,String name)
   {
       //Initialise the variables.
        this.id=id;
        this.age=age;
        this.name=name;

    }

    //settar methods.
    public void setId(int id)
    {
        id=id;
    }

    public void setAge(int age)
    {
        age=age;
    }
    public void setName(String name)
    {
        name=name;
    }

    //gettar methods
    public int getId()
    {
        return id;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }

}
