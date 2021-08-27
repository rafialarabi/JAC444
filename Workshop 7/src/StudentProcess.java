/*
 * Name: Md Rafi Al Arabi Bhuiyan
 * Student Id: 147307193
 * Section: NAA
 * Workshop 7
 * Date: 2021-07-20
 */

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StudentProcess {

	//task1
    public static void task1(List<Student> st){
        System.out.println("\nTask 1\n");
        System.out.println("Complete Student list:");
        st.forEach(System.out::println);
    }
    
    
    //task2
    public static void task2(List<Student> st) {
        System.out.println("\n\nTask 2\n");
        System.out.println("Students who got 50.0-100.0 sorted by grade:");
        //sorting the list based on the grades
        st.sort(StudentProcess.compareGrade);
        //displaying the list with grade criteria
        StudentProcess.gradeRange(st, 50, 100).forEach(str -> System.out.println(str.toString()));
    }

    
    //task3
    public static void task3(List<Student> s) {
        System.out.println("\n\nTask 3\n");
        System.out.println("First Student who got 50.0-100.0:");
        //display the first student from previous task
        System.out.println(StudentProcess.gradeRange(s, 50, 100).get(0));
    }
    
    
    //task4
    public static void task4(List<Student> s) {
        System.out.println("\n\nTask 4\n");
        System.out.println("Students in ascending order by last name then first:");
      
        Stream<Student> studentStream = s.stream();
        //display all sorted students
        studentStream.sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName)).
                forEach(System.out::println);
        studentStream = s.stream();
        System.out.println("\nStudents in descending order by last name then first:");
        
        studentStream.sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName).reversed()).
                forEach(System.out::println);
    }
    
    
    //task5
    public static void task5(List<Student> s) {
        System.out.println("\n\nTask 5\n");
        System.out.println("Unique Student last names:");
        //to get the unique last name
        s.stream().map(Student::getName).distinct().sorted();
        //display student based on unique last name
        StudentProcess.uniqueLname(s).forEach(System.out::println);
    }
    
    
    public static List<Student> gradeRange(List<Student> stdList, double lowGrade, double highGrade){
        return stdList.stream().filter(s -> s.getGrade() >= lowGrade && s.getGrade()
                <= highGrade).collect(Collectors.toList());
    }

    
    public static Comparator<Student> compareGrade = (std1, std2) -> (int)(std1.getGrade() - std2.getGrade());
    
    
    public static List<String> uniqueLname(List<Student> sList){
        return sList.stream().map(stu -> stu.getName().split(" ")).map(stdName -> stdName[1])
                .distinct().collect(Collectors.toList());
    }
}
