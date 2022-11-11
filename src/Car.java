public class Car {
    final String Producent;
    final String Model;
    Double Przebieg;
    String Kolor;
    Integer Rocznik;
    String Typ;
    Car(String Producent, String Model, Double Przebieg, String Kolor, Integer Rocznik, String Typ){
        this.Producent = Producent;
        this.Model = Model;
        this.Przebieg=Przebieg;
        this.Kolor=Kolor;
        this.Rocznik=Rocznik;
        this.Typ=Typ;
    }
    public String toString(){
        return "Producent:"+ this.Producent + " Model: "+ this.Model;
    }
}
