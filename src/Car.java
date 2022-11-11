public class Car {
    final String Producent;
    final String Model;
    Double Przebieg;
    String Kolor;
    Integer Rocznik;
    String Typ;

    Double Ofkoz;
    Car(String Producent, String Model, Double Przebieg, String Kolor, Integer Rocznik, String Typ, Double Ofkoz){
        this.Producent = Producent;
        this.Model = Model;
        this.Przebieg=Przebieg;
        this.Kolor=Kolor;
        this.Rocznik=Rocznik;
        this.Typ=Typ;
        this.Ofkoz=Ofkoz;
    }
    public String toString(){
        return "Producent:"+ this.Producent + " Model: "+ this.Model;
    }
}
