package c169project;

/**
 *
 * @author Ramon Vincent Porras
 */
    public class Student
    {
    //Student class which includes student ID, first name, last name, e-mail address, age, and array of grades.
            private String studentId, firstName, lastName, email; 
            private int age, grade1, grade2, grade3;
            private final int MAX_AMOUNT_GRADES = 3; 
            int[] grades = new int[MAX_AMOUNT_GRADES]; 

    //Student Constructor 
            public Student(String studentId, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3)
            {
                    this.studentId = studentId;
                    this.firstName = firstName;
                    this.lastName = lastName;
                    this.email = email;
                    this.age = age;
                    setGrade1(grade1);
                    setGrade2(grade2);
                    setGrade3(grade3);
                        
            }
    //accessors and mutators for student data
            public void setStudentId(String studentId)
            {
                    this.studentId = studentId;
            }

            public String getStudentId()
            {
                    return studentId;
            }

            public void setFirstName(String firstName)
            {
                    this.firstName = firstName;
            }

            public String getFirstName()
            {
                    return firstName;
            }

            public void setLastName(String lastName)
            {
                    this.lastName = lastName;
            }

            public String getLastName()
            {
                    return lastName;
            }

            public void setEmail(String eMail)
            {
                    this.email = eMail;
            }

            public String getEmail()
            {
                    return email;
            }

            public void setAge(int age)
            {
                    this.age = age;
            }

            public int getAge()
            {
                    return age;
            }

            public void setGrade1(int grade1)
            {
                    this.grades[0] = grade1;
            }

            public int getGrade1()
            {
                    return grades[0];
            }

            public void setGrade2(int grade2)
            {
                    this.grades[1] = grade2;
            }

            public int getGrade2()
            {
                    return grades[1];
            }

            public void setGrade3(int grade3)
            {
                    this.grades[2] = grade3;
            }

            public int getGrade3()
            {
                    return grades[2];
            }


            public void print()
            {
                    String studentId = getStudentId();
                    String firstName = getFirstName();
                    String lastName = getLastName();
                    String email = getEmail();
                    int age = getAge();
                    int grade1 = getGrade1();
                    int grade2 = getGrade2();
                    int grade3 = getGrade3();

                    System.out.println("Student ID: " +studentId+ " Student Firstname: " +firstName+ " Student Lastname: " +lastName+ " Student Email: " +email+ " Student Age: " +age+ " Student Grades: " + "{"+grade1+ "," +grade2+ "," +grade3 + "}");
            }


    }