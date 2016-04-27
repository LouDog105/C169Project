package c169project;
/**
 *
 * @author Ramon Vincent Porras
 */
public class C169Project {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59",
                              "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
			      "3,Jack,Napoli,The_lawyer99@yahoo.com,19,85,84,87",
			      "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
			      "5,Ramon,Porras,rporra1@wgu.edu,29,80,94,70"};        

        Roster roster = new Roster();

            for(int i=0; i < students.length; i++)
            {
                String characters = students[i];
                String[] variable = characters.split(",");
                String studentId = variable[0];
                String firstName = variable[1];
                String lastName = variable[2];
                String email = variable[3];
                int age = Integer.parseInt(variable[4]);
                int grade1 = Integer.parseInt(variable[5]);
                int grade2 = Integer.parseInt(variable[6]);
                int grade3 = Integer.parseInt(variable[7]);
                
                Roster.add(studentId, firstName, lastName, email, age, grade1, grade2, grade3);
            }
        
        Roster.print_all();
        Roster.print_invalid_emails();
        Roster.print_average_grade("1");
        Roster.remove("3");
        Roster.remove("3");
    };

    
}
    
    

    
