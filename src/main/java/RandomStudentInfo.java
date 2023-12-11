import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;


public class RandomStudentInfo
{
    private static final Random random = new Random();
    private static final String[] namesArray = {
            "Alice", "Bob", "Charlie", "Diana", "Edward",
            "Fiona", "George", "Hannah", "Ian", "Julia",
            "Kevin", "Luna", "Mason", "Nora", "Oscar",
            "Penny", "Quinn", "Ryan", "Sophia", "Tyler",
            "Uma", "Victor", "Wendy", "Xavier", "Yara",
            "Zach", "Aaron", "Beth", "Caleb", "Deborah"
    };

    private static final String[] lastNamesArray = {
            "Smith", "Johnson", "Williams", "Brown", "Jones",
            "Garcia", "Miller", "Davis", "Rodriguez", "Martinez",
            "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson",
            "Thomas", "Taylor", "Moore", "Jackson", "Martin",
            "Lee", "Perez", "Thompson", "White", "Harris",
            "Sanchez", "Clark", "Ramirez", "Lewis", "Robinson"
    };

    private static String randomFirstName()
    {
        return STR."\{namesArray[random.nextInt(0, 30)]} \{lastNamesArray[random.nextInt(0, 30)]}";
    }

    public static Student randomStudent()
    {

        UUID studentID = UUID.randomUUID();
        String name = randomFirstName();
        byte age = (byte) random.nextInt(7, 19);
        double grade = random.nextDouble(2.0, 6.0);
        return new Student(studentID, name, age, grade);
    }

}
