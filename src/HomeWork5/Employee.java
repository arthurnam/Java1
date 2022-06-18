package HomeWork5;

public class Employee {

   private String fio;
    String profession;
    int age;
   private double salary;
    String email;
   private String telNumber;

    public Employee(String fio, int age, String profession, double salary, String email, String telNumber) {

        this.fio = fio;
        this.age = age;
        this.profession = profession;
        this.salary = salary;
        this.email = email;
        this.telNumber = telNumber;
    }
    public void print() {
        System.out.println("[" + fio + ", " + age + ", " + profession + ", " + salary + ", " + email + ", " + telNumber + "]");
    }

}
