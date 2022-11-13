package Creatures;

public class Pet extends Animal {
    public Pet(String specie) {
        super(specie);
    }
    public void beEaten() throws Exception{
        throw new Exception("Halo Policja");
    }
}
