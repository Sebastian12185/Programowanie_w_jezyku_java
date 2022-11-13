package devices;

public class Car extends Device{
    Double Przebieg;
    Integer Rocznik;
    String Typ;
    public Double Ofkoz;
    public Car(String Producent, String Model,Double Przebieg, String Kolor, Integer Rocznik, String Typ, Double Ofkoz){
        super(Producent,Model,Kolor);
        this.Przebieg=Przebieg;
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

    @Override
    public void recharger(int percentage) {
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("ładuje");
        System.out.println("naładowane");
    }
}
