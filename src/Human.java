public class Human {
    String firstName, lastName;
    Animal pet;
    Car car;
    private double salary;
    public String toString(){
        return "First Name: "+ this.firstName
                +" Last Name: "+ this.lastName;
    }
    public double getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        if(salary <= 0){
            System.out.println("Wypłata nie może zawierać ujemną wartość.");
        }
        else {
            this.salary = salary;
            System.out.println("Informacja o wypłacie zotsała wysłana do systemu księgowego.\n" +
                    "Proszę o odebranie aneksu do umowy od pani Hani z kadry.\n" +
                    "Informacje zostały również wysłane do ZUS oraz US");

        }
    }
}
