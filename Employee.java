/**
 * Denver Wolfe
 * CH3PC1
 * Programming III - AP CS
 * 9/25/18
 */
public class Employee {

    public static void main(String[] args) {
        
        //Employee and EmployeeRunner are backwards
        
        /**
         * Write accessor and mutator methods for each field
         * Provide documentation comment for each method
         * Write a constructor that accepts arguments for all 4 fields
         */
        
        //Declare the fields
        //Create the constructor
        //Create something
        
        //Create employee things
        EmployeeRunner e1 = new EmployeeRunner("Susan Meyers", 47899, 
                "Accounting", "Vice President");
        EmployeeRunner e2 = new EmployeeRunner("Mark Jones", 39119, 
                "IT", "Programmer");
        EmployeeRunner e3 = new EmployeeRunner("Joy Rogers", 81774, 
                "Manufacturing", "Engineer");
        
        //Declare variables
        String n, d, p;
        int i;
        
        //Print Header thing
        System.out.println("Name" + "\t\t" + "ID Number" + "\t" + "Department" +
                "\t" + "Position");
        
        //Get information and print it
        n = e1.getName();
        i = e1.getNumber();
        d = e1.getDepartment();
        p = e1.getPosition();
        System.out.println(n + "\t" + i + "\t\t" + d + "\t" + p);
        
        //Repeat
        n = e2.getName();
        i = e2.getNumber();
        d = e2.getDepartment();
        p = e2.getPosition();
        System.out.println(n + "\t" + i + "\t\t" + d + "\t\t" + p);
        
        //Repeat
        n = e3.getName();
        i = e3.getNumber();
        d = e3.getDepartment();
        p = e3.getPosition();
        System.out.println(n + "\t" + i + "\t\t" + d + "\t" + p);
    }

}
