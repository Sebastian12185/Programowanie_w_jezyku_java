import Creatures.Animal;
import devices.Car;
import devices.Phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main {
    public static void main(String[] args) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime localDateTime = LocalDateTime.now();
        String dateNow = date.format(localDateTime);
        String timeNow = time.format(localDateTime);

        Human me = new Human();
        me.firstName = "Sebastian";
        me.lastName = "Jakubek";
        me.setSalary(12000);
        Animal dog = new Animal("dog");
        System.out.println("Waga psa: "+dog.weight);
        dog.takeForWalk();
        System.out.println("Waga psa: "+dog.weight);
        dog.feed();
        System.out.println("Waga psa: "+dog.weight);
        me.pet = dog;
        System.out.println(me.pet);
        System.out.println(me);
        Car car = new Car("VW","GOLF",10.5,"Black",2007,"Sedan", 10000.0);
        Car car2 = new Car("VW","GOLF",10.5,"Black",2007,"Sedan", 10000.0);
        Phone phoneOne = new Phone("Honor","8X","blue");
        System.out.println(phoneOne);
        me.setCar(car);
        //System.out.println(me.getCar());
        System.out.println(car.equals(car2));
        System.out.println(me);
        System.out.println("Dnia: " + dateNow + " O godzinie: " + timeNow +" Pobrano inforamcje o wypłacie. Aktualna wypłata: " + me.getSalary());

    }
}