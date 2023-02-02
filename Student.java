package Homework.hw2;

public class Student {

    private String name;
    private int idNumber;
    private static int nextID = 100;

    public Student(String name, int idNumber)
    {
        this.name = name;
        this.idNumber = idNumber;
    }

    public Student(String name)
    {
        this.name = name;
        this.nextID++;
    }

    public void changeName(String newName)
    {
        name = newName;
    }

    public boolean precedesById(Student otherstudent)
    {
        return this.idNumber < otherstudent.idNumber;
    }

    public String toString()
    {
        return "Student names " + name + " has ID Number " + idNumber;
    }
}
