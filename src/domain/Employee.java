package domain;
/**
 * A class that represents an employee
 * @author someone
 */

public class Employee {

    /**
     * displaying basic information about a person in a string
     * @return string with basic information about a person
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }
    
    /**
    * name of employee
    */
    private String name;
    
    /**
    * job title
    */
    private String jobTitle;
    
    /**
    * ID of employee 
    */
    private int ID;
    
    /**
     * level of employee
     */
    private int level;
    
    /**
     * dept of employee
     */
    private String dept;

   // private static int employeesCount = 0;
    
    /**
     * constructor
     * @param name name of employee
     * @param jobTitle job title
     * @param level level of employee
     * @param dept dept of employee
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
     * default constructor
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Method by which you can change job title of employee
     * @param job job title
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Method by which you can get job title of employee
     * @return string value of job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Method by which you can get name of employee
     * @return string value of name of employee
     */
    public String getName() {
        return name;
    }

    /**
     * Method by which you can change level of employee
     * @param level The level at which the employee works
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
     * Method by which you can get level of employee
     * @return int value of level of employee
     */
    public int getLevel() {
        return level;
    }
    
    /**
     * Method by which you can get debt of employee
     * @return string value of dept of employee
     */
    public String getDept() {
        return dept;
    }

    /**
     * Method by which you can change dept of employee
     * @param dept of employee
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Method by which you can change name of employee
     * @param name of employee
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
