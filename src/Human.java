import Creatures.Animal;
import devices.Car;

public class Human  extends Animal {
    String firstName, lastName;
    Animal pet;
    private Car car;
    private double salary;

    Human() {
        super("homo sapiens");
        salary = 0.0;
        System.out.println("Witaj człowieku!");
    }

    public String toString(){
        return "Imię: "+ this.firstName
                +" Nazwisko: "+ this.lastName+ " "+ this.pet+" Samochód: "+this.car ;
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

    public Car getCar(){

        return this.car;
    }
    public void setCar(Car car){
        if(this.salary>=car.Ofkoz)
        {
            this.car = car;
            System.out.println("Udało się zakupić samochód za gotówkę");
        }
        else if(this.salary>car.Ofkoz/12){
            this.car = car;
            System.out.println("Udało się zakupić samochód na kredyt");
        }
        else {
            System.out.println("Zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }
    public void beEaten() throws Exception{
        throw new Exception("Halo Policja");
    }
}
