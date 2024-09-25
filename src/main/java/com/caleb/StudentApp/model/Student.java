public class Student {

    
    private String firstName;
    private String lastName;
    private String regNo;
    private String yearOfStudy;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Student(String firstName, String lastName, String regNo, String yearOfStudy) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.regNo = regNo;
        this.yearOfStudy = yearOfStudy;
    }

}