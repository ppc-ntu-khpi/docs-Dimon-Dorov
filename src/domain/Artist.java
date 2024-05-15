package domain;
/**
 * The Artist class represents an artist within the organization, inheriting from Employee.
 */
public class Artist extends Employee {
    /**
     * Constructs an Artist object.
     * @param skills The skills.
     * @param name The name.
     * @param jobTitle The job title.
     * @param level The level.
     * @param dept The dept.
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    /**
     * Constructs an Artist object with the specified skills.
     * @param skills The skills.
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    /**
     * Constructs an Artist object with default values.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /**
     * Returns a string representation of the Artist object.
     * @return A string containing of the information and skills.
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    /**
     * Retrieves the skills.
     * @return A string representing the skills.
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * Sets the skills.
     * @param skills The skills.
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /**
     * Retrieves the skills as an array.
     * @return The skills.
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
