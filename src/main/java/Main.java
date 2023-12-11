import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;


private static final Scanner scanner = new Scanner(System.in);
void main()
{

    HashMap<UUID, Student> studentList = new HashMap<>();

    byte choice;
    while (true)
    {
        printOptions();
        choice = scanner.nextByte();

        switch (choice)
        {
            case 1 -> addStudent(studentList);
            case 2 -> addRandomStudent(studentList);
            case 3 -> displayStudentTable(studentList);
            case 4 -> viewStudentByID(studentList);
            default -> System.exit(-1);
        }

        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

    }
}

void printOptions()
{
    System.out.println("""
            1. Add a new student
            2. Add a random student
            3. View all students
            4. View student by ID
            5. Exit
            """);
}

void addStudent (HashMap<UUID,Student> studentList)
{
    UUID studentID = UUID.randomUUID();

    System.out.print("Name: ");
    String name = scanner.nextLine();
    name = scanner.nextLine();

    System.out.print("Age: ");
    byte age = scanner.nextByte();

    System.out.print("Grade: ");
    double grade = scanner.nextDouble();

    studentList.put(studentID, new Student(studentID, name, age, grade));
}

void addRandomStudent (HashMap<UUID,Student> studentList)
{
    Student student = RandomStudentInfo.randomStudent();

    studentList.put(student.getStudentID(), student);
}

void displayStudentTable (HashMap<UUID,Student> studentHashMap)
{
    // Constants for table drawing
    final String topLeftCorner = "┌";
    final String topRightCorner = "┐";
    final String bottomLeftCorner = "└";
    final String bottomRightCorner = "┘";
    final String horizontalLine = "─";
    final String horizontalDown = "┬";
    final String horizontalUp = "┴";
    final String verticalRight = "├";
    final String verticalLeft = "┤";
    final String cross = "┼";
    final String verticalLine = "│";
    final int uuidWidth = 38;
    final int nameWidth = 38;
    final int ageWidth = 3;
    final int gradeWidth = 6;

    String uuidSection = horizontalLine.repeat(uuidWidth + 2);
    String nameSection = horizontalLine.repeat(nameWidth + 2);
    String ageSection = horizontalLine.repeat(ageWidth + 2);
    String gpaSection = horizontalLine.repeat(gradeWidth + 2);

    String header = String.format("%s%s%s%s%s%s%s%s%s\n",
            topLeftCorner, uuidSection, horizontalDown, nameSection, horizontalDown,
            ageSection, horizontalDown, gpaSection, topRightCorner);

    String headerTitles = String.format("%s %s %s %-38s %s %3s %s %6s %s\n",
            verticalLine, StringUtils.center("Student ID", 38), verticalLine, "Name", verticalLine, "Age", verticalLine, "GRADE", verticalLine);

    String divider = String.format("%s%s%s%s%s%s%s%s%s\n",
            verticalRight, uuidSection, cross, nameSection, cross, ageSection, cross, gpaSection, verticalLeft);

    String bottom = String.format("%s%s%s%s%s%s%s%s%s\n",
            bottomLeftCorner, uuidSection, horizontalUp, nameSection, horizontalUp,
            ageSection, horizontalUp, gpaSection, bottomRightCorner);

    System.out.print(header + headerTitles + divider);

    for (Map.Entry<UUID, Student> entry : studentHashMap.entrySet())
    {
        System.out.printf("%s %-38s %s %-38s %s %3d %s %6.1f %s\n",
                verticalLine, entry.getValue().getStudentID(), verticalLine, entry.getValue().getName() , verticalLine, entry.getValue().getAge(), verticalLine, entry.getValue().getGrade(), verticalLine);
    }

    System.out.print(bottom);

    standby();
}

void viewStudentByID (HashMap<UUID,Student> studentHashMap)
{
    System.out.print("Give the ID of the student you want to check: ");
    String id = scanner.nextLine();
    id = scanner.nextLine();
    UUID studentId = UUID.fromString(id);

    Student student = studentHashMap.get(studentId);

    System.out.println(student.getName());
    System.out.println(student.getAge());
    System.out.println(student.getGrade());
}

void standby()
{
    System.out.print("Please press enter to continue...");
    scanner.nextLine();
}