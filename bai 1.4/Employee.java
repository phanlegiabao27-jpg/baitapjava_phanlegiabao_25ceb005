public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private int salary;
    public Employee(int id, String firstname, String lastname, int salary) {

    }
    public int getId() {
        return this.id;
    }
    public String getFirstName() {
        return this.firstname;
    }
    public String getLastName() {
        return this.lastname;
    }
    public String getName(){
        return this.firstname + this.lastname;
    }
    public int getsalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualsalary() {
        this.salary = this.salary *12;
        return 0;
    }
    public int raiseSalary(int percent) {
        return this.salary =+ (this.salary*percent)/100;
    }
    public String toString() {
        return "Employee [id=" + this.id + ", name" + this.getName()+ ", salary=" + this.salary + "]";
    }


}


