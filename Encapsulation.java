public class Employee {
    private int id;
    private String name; // Changed from int to String
    
    // Setter for id
    public void setId(int id) {
        this.id = id;
    }
    
    // Getter for id
    public int getId() {
        return id; // Corrected method to return the instance variable id
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter for name
    public String getName() {
        return name; // Corrected method to return the instance variable name
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Employee obj = new Employee(); // Corrected the class name from "Emplyee" to "Employee"
        obj.setId(90);
        obj.setName("Tathagata");

        // Corrected the syntax for calling methods and corrected the print statement
        System.out.println(obj.getName() + " is an Employee with ID: " + obj.getId());
    }
}
