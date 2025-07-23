import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class student {

    public void calculateAverage(String studentName, List<Integer> grades) {

        long startTime = System.nanoTime();

        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average = Math.round((double) sum / grades.size() * 100.0) / 100.0;
        System.out.println(studentName + " - Average: " + average);

        long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " ns");
        System.out.println("Time Complexity: O(n) -> n = number of grades");
        System.out.println();
    }

    public void displayAllStudents(Map<String, List<Integer>> studentMap) {

        long startTime = System.nanoTime();

        System.out.println("The Student Names and grades are as follows ");
        studentMap.forEach((String name, List<Integer> grades) -> {
            System.out.println("Student: " + name + ", Grades: " + grades);
        });
        System.out.println();
        long endTime = System.nanoTime();
        System.out.println("Time taken: " + (endTime - startTime) + " ns");
        System.out.println("Time Complexity: O(m) -> n = number of students");
    }
}


public class gradeBook {
    public static void main(String[] args) {

        List<Integer> alokGrades = new ArrayList<>();  //O(1)
        alokGrades.add(45);
        alokGrades.add(44);
        alokGrades.add(50);

        List<Integer> vinayGrades = new ArrayList<>(); // O(1)
        vinayGrades.add(42);
        vinayGrades.add(50);
        vinayGrades.add(50);

        List<Integer> raviGrades = new ArrayList<>();  // O(1)
        raviGrades.add(37);
        raviGrades.add(36);
        raviGrades.add(45);


        Map<String, List<Integer>> studentMap = new HashMap<>(); // O(1)
        studentMap.put("alok", alokGrades);
        studentMap.put("vinay", vinayGrades);
        studentMap.put("ravi", raviGrades);

        student s = new student();

        System.out.println("Student Averages: O(n)");
        s.calculateAverage("Alok", alokGrades);   // O(n)
        s.calculateAverage("Vinay", vinayGrades); // O(n)
        s.calculateAverage("Ravi", raviGrades);   // O(n)

        System.out.println("Display all Students: O(n)");
        s.displayAllStudents(studentMap); // O(n)


    }
}


OUTPUT
Student Averages: O(n)
Alok - Average: 46.33
Time taken: 15392599 ns
Time Complexity: O(n) -> n = number of grades

Vinay - Average: 47.33
Time taken: 44101 ns
Time Complexity: O(n) -> n = number of grades

Ravi - Average: 39.33
Time taken: 26501 ns
Time Complexity: O(n) -> n = number of grades

Display all Students: O(n)
The Student Names and grades are as follows 
Student: vinay, Grades: [42, 50, 50]
Student: ravi, Grades: [37, 36, 45]
Student: alok, Grades: [45, 44, 50]

Time taken: 2407900 ns
Time Complexity: O(m) -> n = number of students
