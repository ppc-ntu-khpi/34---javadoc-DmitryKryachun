package domain;
/**
 * subclass of Employee that represents an artist
 * @see Employee
 * @author someone
 */
public class Artist extends Employee {

    /**
     * constructor
     * @param skiils skills of artist
     * @param name name of artist
     * @param jobTitle job title
     * @param level level of artist
     * @param dept dept of artist
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skills = skiils;
    }

    /**
     * constructor with one argument
     * @param skiils skills of artist
     */
    public Artist(String[] skiils) {
        super();
        this.skills = skiils;
    }
    
    /**
     * default constructor
     */
    public Artist() {
        super();
        this.skills = new String[10];
    }

    /**
     * Basic information about a person with informaton about skills
     * Method override method toString()
     * @return string with basic information about a person with informaton about skills
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skills;

    /**
     * Method by which you can get skills of artist in string value
     * @return  string of skills
     */
    public String getSkills() {
        String s = "";
        for (String e : skills) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Method by which you can change skills of artist
     * @param skills skills of artist
     */
    public void setSkills(String[] skills) {
        this.skills=skills;
    }

    /**
     * Method by which you can get list of skills of artist
     * @return string list of skills
     */
    public String[] getSkillsLSist() {
        return skills;
    }
}
