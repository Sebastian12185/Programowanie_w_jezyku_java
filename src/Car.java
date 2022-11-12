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
        return "Producent:"+ this.Producent + " Model: "+ this.Model+ " Przebieg: "+ this.Przebieg+ " Kolor: "+ this.Kolor + " Rocznik: "+ this.Rocznik + " Typ: "+ this.Typ+ " Wartość: "+ this.Ofkoz;
    }

    public boolean equals(Object o) {
        Car car = (Car) o;
        if(Model.equals(car.Model) && Producent.equals(car.Producent) && Przebieg.equals(car.Przebieg) && Kolor.equals(car.Kolor) && Rocznik.equals(car.Rocznik) && Typ.equals(car.Typ) && Ofkoz.equals(car.Ofkoz)){
            System.out.println("Mamy dwa takie same samochody: "+toString());
            return true;
        }
        return false;
    }
}
