package domain;
public class Employee {
    /**
     * Returns a string representation of the Employee object.
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
   /**
    * The constructor that uses another constructor 
    * to create an Employee object with 
    * the specified information.
    * @param name The name.
    * @param jobTitle The job.
    * @param level The level.
    * @param dept The dept.
    */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    /**
     * Constructs an Employee object with values.
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    /**
     * Sets the job title of the employee.
     * @param job The job.
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    /**
     * Retrieves the job title of the employee.
     * @return The job.
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * Retrieves the name of the employee.
     * @return The name.
     */
    public String getName() {
        return name;
    }
    /**
     * Sets the level of the employee.
     * @param level The level.
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    /**
     * Retrieves the level of the employee.
     * @return The level.
     */
    public int getLevel() {
        return level;
    }
    /**
     * Retrieves the dept of the employee.
     * @return The dept.
     */
    public String getDept() {
        return dept;
    }
    /**
     * Sets the dept of the employee.
     * @param dept The dept.
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    /**
     * Sets the name of the employee.
     * If the provided name does not match the specified pattern, 
     * sets the name to "John Doe".
     * @param name The name.
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
