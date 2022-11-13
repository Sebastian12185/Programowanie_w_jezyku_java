import Creatures.Animal;
import Creatures.Pet;
import devices.Car;
import devices.Device;
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
        Pet dog = new Pet("dog");
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
        car.recharger(12);
        System.out.println("Dnia: " + dateNow + " O godzinie: " + timeNow +" Pobrano inforamcje o wypłacie. Aktualna wypłata: " + me.getSalary());

    }
}