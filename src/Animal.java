public class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 12.3;
    private static final Double DEFAULT_CAT_WEIGHT = 5.0;
    private static final Double DEFAULT_MOUSE_WEIGHT = 1.5;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    String specie;
    Boolean isAlive;
    Double weight;
    Animal(String specie){
        this.specie =specie;
        this.isAlive = true;
        switch(specie){
            case "dog" -> this.weight = DEFAULT_DOG_WEIGHT;
            case "cat" -> this.weight = DEFAULT_CAT_WEIGHT;
            case "mouse" -> this.weight = DEFAULT_MOUSE_WEIGHT;
            default -> this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    void feed(){
        if(this.isAlive) {
            this.weight += 1;
            System.out.println("dzięki za żarcie");
        }
        else {
            System.out.println("Wszystko dobrze z głową?");
        }
    }
    void takeForWalk(){
        if(this.isAlive){
            this.weight-=1;
            System.out.println("Dzięki za spacer");
        }
        if(this.weight<=0) {
            this.isAlive = false;
            System.out.println("Zwierzę nie żyje");
        }

    }
    public String toString(){
        return "Rodzaj zwierzęcia: "+ this.specie + " Czy żyje: "+ this.isAlive+ " Waga: "+ this.weight;
    }
}
