/*
(The Person, Student, Employee, Faculty, and Staff classes) Design a class named Person and its two
subclasses named Student and Employee. Make Faculty and Staff subclasses of Employee. A person has
a name, address, phone number, and email address. A student has a class status (freshman, sophomore,
junior, or senior). Define the status as a constant. An employee has an office, salary, and date hired. Use
the Date class for date hired. A faculty member has office hours and a rank. A staff member has a title.
Override the toString method in each class to display the class name and the person’s name. Draw the
UML diagram for the classes and implement them. Write a test program that creates a Person, Student,
Employee, Faculty, and Staff, and invokes their toString() methods
*/

package CP2;

class Person {

    private String name;
    private String address;
    private int phone;
    private String email_address;
    Person(){};
    Person(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public String getEmail_address() {
        return email_address;
    }
    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }
    public String toString() {
        return "Class name: Person " + "person: " + getName();
    }
}   //END OF PERSON CLASS

class Student extends Person {
    private final String status="";
    
    Student(){};
    Student(String name){
        super(name);
        status = "faculty";
    }
    Student( String name, String status){
        super(name);
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
    public String toString() {
        return "Class name: Student " + "person: " + getName();
    }
}   //END OF STUDENT CLASS

class Employee extends Person {
    private String office;
    private int salary;
    private java.util.Date date_hired;
    Employee(){};
    Employee(String name){
        super(name);
    }
    public String getOffice() {
        return office;
    }
    public void setOffice(String office) {
        this.office = office;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public java.util.Date getDate_hired() {
        return date_hired;
    }
    public void setDate_hired(java.util.Date date_hired) {
        this.date_hired = date_hired;
    }
    public String toString() {
        return "Class name: Employee " +"person: " + getName();
    }
}   //END OF EMPLOYEE CLASS

class Faculty extends Employee {
    private String office_hours;
    private int rank;
    
    public String getOffice_hours() {
        return office_hours;
    }
    public void setOffice_hours(String office_hours) {
        this.office_hours = office_hours;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public String toString() {
        return "Class name: Employee " + "person: " + getName();
    }
}   //END OF FACULTY CLASS

class Staff extends Employee {
    private String title;
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String toString() {
        return "Class name: Staff " + "person: " + getName();
    }
}   //END OF STAFF CLASS


public class Homework5 {
    public static void main(String[] args) {
        
    }
}
