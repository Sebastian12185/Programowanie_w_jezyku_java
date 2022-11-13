package Creatures;

public interface Edible {
    void beEaten() throws Exception;
    boolean isPoisoned();
    Double getNutriscore();
}
