import java.util.Objects;
import java.util.UUID;


public class Student
{
    private UUID studentID;
    private String name;

    private byte age;

    private double grade;

    public Student(UUID studentID, String name, byte age, double grade)
    {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public UUID getStudentID()
    {
        return studentID;
    }

    public void setStudentID(UUID studentID)
    {
        this.studentID = studentID;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(byte age)
    {
        this.age = age;
    }

    public double getGrade()
    {
        return grade;
    }

    public void setGrade(double grade)
    {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID && age == student.age && Double.compare(grade, student.grade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public String toString()
    {
        return STR."Student{studentID=\{studentID}, name='\{name}\{'\''}, age=\{age}, grade=\{grade}\{'}'}";
    }


}
