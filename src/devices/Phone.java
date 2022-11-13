package devices;

public class Phone extends Device{
    public Phone(String Producent, String Model, String Kolor) {
        super(Producent, Model, Kolor);
    }

    public String toString(){
        return "Producent:"+ this.Producent + " Model: "+ this.Model+ " Kolor: "+ this.Kolor;
    }
    @Override
    void recharger(int percentage) {
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("naładowane");
    }
}
