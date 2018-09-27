/**
 * Denver Wolfe
 * CH3PC1
 * Programming III - AP CS
 * 9/25/18
 */
public class EmployeeRunner {
    /**
     * Instantiate 3 Employee objects w/ the appropriate arguments
     * Use Employee class methods (accessor) to print out the table
     */
    
    //Declare variables
    private String name;
    private int idNumber;
    private String department;
    private String position;
    
    //Initializes the name, idNumber, department, and position
    public EmployeeRunner(String n, int i, String d, String p){
        name = n;
        idNumber = i;
        department = d;
        position = p;
    }
    
    //Set the name
    public void setName(String n){
        name = n;
    }
    
    //Set the number
    public void setNumber(int i){
        idNumber = i;
    }
    
    //Set the department
    public void setDepartment(String d){
        department = d;
    }
    
    //Set the position
    public void setPosition(String p){
        position = p;
    }
    
    //Return the name
    public String getName(){
        return name;
    }
    
    //Return the ID number
    public int getNumber(){
        return idNumber;
    }
    
    //Return the department
    public String getDepartment(){
        return department;
    }
    
    //Return the position
    public String getPosition(){
        return position;
    }
}
