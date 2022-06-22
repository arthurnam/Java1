package HomeWork5;

public class Main {
    public static void main(String[] args) {

       Employee employee1= new Employee("АЛЕКСАНДР СЕРГЕЕВИЧ ПУШКИН", 25, "QA Engineer", 2500, "abc@gmail.com", "123456789");
       Employee employee2= new Employee("ЛЕВ НИКОЛАЕВИЧ ТОЛСТОЙ", 30, "QA Engineer", 2800, "123@gmail.com", "987654321");
       Employee employee3= new Employee("НИКОЛАЙ ВАСИЛЬЕВИЧ ГОГОЛЬ", 23, "QA Engineer", 3000, "ght@gmail.com", "131242575");
       Employee employee4= new Employee("ФЕДОР МИХАЙЛОВИЧ ДОСТОЕВСКИЙ", 35, "QA Engineer", 4000, "ab567@gmail.com", "98653212");
       Employee employee5= new Employee("ИВАН СЕРГЕЕВИЧ ТУРГЕНЕВ", 41, "QA Engineer", 5500, "uou789@gmail.com", "777777777");

       Employee[] employees = {employee1, employee2, employee3, employee4, employee5};
       for(int i = 0; i < employees.length; i++) {
           employees[i].print();
       }
    }
}
