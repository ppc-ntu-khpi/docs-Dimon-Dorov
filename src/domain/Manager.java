package domain;
public class Manager extends Employee {
    /**
     * 
     * @param employees The employees.
     * @param name The name.
     * @param jobTitle The job.
     * @param level The level.
     * @param dept The dept.
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
    /**
     * Returns a string representation object.
     * @return A string containing information.
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
    /**
     * Constructs a Manager object with the specified employees.
     * @param employees The employees.
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    /**
     * Constructs a manager object with default values.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    /**
     * Retrieves the managed employees.
     * @return A string representing.
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * Sets the employees managed.
     * @param employees The employees.
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * Retrieves the employees as an array.
     * @return The employees.
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
