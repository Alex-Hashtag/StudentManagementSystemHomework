import java.util.Objects;


public class Student
{
    private int studentID;
    private String name;

    private int age;

    private double grade;

    public Student(int studentID, String name, int age, double grade)
    {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getStudentID()
    {
        return studentID;
    }

    public void setStudentID(int studentID)
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

    public void setAge(int age)
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
    public int hashCode()
    {
        return Objects.hash(studentID, name, age, grade);
    }

    @Override
    public String toString()
    {
        return STR."Student{studentID=\{studentID}, name='\{name}\{'\''}, age=\{age}, grade=\{grade}\{'}'}";
    }
}
