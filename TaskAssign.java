package Task.demo.model;

import java.util.ArrayList;
import java.util.List;

class Employee {
    private final String id;       // Unique Key (e.g., EMP001)
    private String name;
    private String department;
    private String email;
    private String address;

    public Employee(String id, String name, String department, String email, String address) {
        if (id == null || id.isEmpty()) throw new IllegalArgumentException("Employee id cannot be null/empty");
        this.id = id;
        this.name = name;
        this.department = department;
        this.email = email;
        this.address=address;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getId() {
		return id;
	}
	

public class EmployeeListDemo {

    public static void main(String[] args) {
        // Create a List to store employees
        List<Employee> employees = new ArrayList<>();
        

employees.add(new Employee("EMP001", "Aisha Khan", "Engineering", "aisha.khan@example.com", "Bengaluru"));
        employees.add(new Employee("EMP002", "Ravi Iyer", "QA", "ravi.iyer@example.com", "Chennai"));
        employees.add(new Employee("EMP003", "Meera Roy", "DevOps", "meera.roy@example.com", "Pune"));
        employees.add(new Employee("EMP004", "Sanjay Patel", "Support", "sanjay.patel@example.com", "Hyderabad"));

        

for (Employee e : employees) {
            System.out.println(e.getId() + " - " + e.getName() + " - " + e.getDepartment());
        }
    }
}
}


        

    
    
