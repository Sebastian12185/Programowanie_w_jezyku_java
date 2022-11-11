public class Main {
    public static void main(String[] args) {
        Human me = new Human();
        me.firstName = "Sebastian";
        me.lastName = "Jakubek";
        Animal dog = new Animal("dog");
        System.out.println("Waga psa: "+dog.weight);
        dog.takeForWalk();
        System.out.println("Waga psa: "+dog.weight);
        dog.feed();
        System.out.println("Waga psa: "+dog.weight);
        me.pet = dog;
        System.out.println(me.pet.specie);
        System.out.println(me);
        Car car = new Car("VW","GOLF",10.5,"Black",2007,"Sedan");
        me.car = car;
        System.out.println(car);
    }
}