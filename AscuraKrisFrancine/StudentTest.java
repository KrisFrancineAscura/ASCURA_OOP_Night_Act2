package AscuraKrisFrancine;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter test case number: ");
        int testCase = scanner.nextInt();

        switch (testCase) {
            case 1:
                // Case 1: Student below 18
                Student student1 = new Student("Frans", "Almero", 17);
                System.out.println("Case 1: Student below 18");
                System.out.println(student1.toString());
                break;

            case 2:
                // Case 2: Increment age of student1
                Student student2 = new Student("Frans", "Almero", 17);
                System.out.println("Case 2: Increment age of student1");
                System.out.println("Before increment: " + student2.toString());
                student2.celebrateBirthday();
                System.out.println("After increment: " + student2.toString());
                break;

            case 3:
                // Case 3: Student 18 or older
                Student student3 = new Student("Frank", "Chris", 19);
                System.out.println("Case 3: Student 18 or older");
                System.out.println(student3.toString());
                break;

            default:
                System.out.println("Invalid test case number.");
        }
    }
}
