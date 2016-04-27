package c169project;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ramon Vincent Porras
 */
    public class Roster
    {
        static String invalidEmailPrompt = "Invalid email address: ";
        
        private static List<Student> students = new ArrayList<Student>();
        
        public static void add(String studentId, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3)
        {
            Student student = new Student(studentId, firstName, lastName, email, age, grade1, grade2, grade3);//industry declare final where possible
            students.add(student);
        }
        
        
        public static void print_all()
        {
            for (Student student : students)
            {
                student.print();
            }
        }
        
        
        public static void print_invalid_emails()
        {   
            for(Student aStudent : students)
            {
                String emailsInRoster = aStudent.getEmail();
                    if (!emailsInRoster.contains("@"))
                    {
                        System.out.println(invalidEmailPrompt + emailsInRoster);
                    }
                    
                    else if (emailsInRoster.contains(" "))
                    {
                        System.out.println(invalidEmailPrompt + emailsInRoster);
                    }
                    else if (!emailsInRoster.contains("."))
                    {
                        System.out.println(invalidEmailPrompt + emailsInRoster);
                    }             
            }
        }
        
        
        public static void remove(String studentId)
        {
            for (int i = 0; i < students.size(); i++)
            {
                if (students.get(i).getStudentId().equals(studentId))
                {
                    students.remove(i);
                    System.out.println("Student with the id of " + studentId + " has been removed.");
                    return;
                }
            }
            
            System.out.println("Student ID " + studentId + " can not be found.");
        }
        
        
        public static void print_average_grade(String studentId)
        {
            for (Student student : students)
            {
                if(student.getStudentId().equals(studentId))
                {
                    double totalGradeAmount = student.getGrade1() + student.getGrade2() + student.getGrade3();
                    double gradeAverage = totalGradeAmount / 3;
                                       
                    System.out.println(gradeAverage + " is the average grade for the Student Id of " + studentId);
                    
                    

                }
            }
        }    
}

