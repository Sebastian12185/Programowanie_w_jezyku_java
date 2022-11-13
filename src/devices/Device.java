package devices;

public abstract class Device {
    final String Producent;
    final String Model;
    String Kolor;
    public Device(String Producent, String Model, String Kolor){
        this.Producent = Producent;
        this.Model = Model;
        this.Kolor=Kolor;
    }

    abstract void recharger (int percentage);
}
