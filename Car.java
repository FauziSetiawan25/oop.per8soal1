package pertemuan8.soal1;

public class Car extends Vehicle{
    enum CarTpype{
        PREMIUM_CAR,
        FAMILY_CAR,
        CITY_CAR
    }
    private CarTpype CarType;

    public Car(String brand, int year, double rentalPrice, CarTpype CarType){
        super(brand, year, rentalPrice);
        this.CarType = CarType;
    }
    public void cekType(){
        switch (CarType){
            case PREMIUM_CAR :
                plusDisc(0.10);
                break;
            case CITY_CAR:
                break;
            case FAMILY_CAR:
                plusDisc(0.05);
                break;
        }
    }
    public void displayInfo(){
        System.out.println("Detail Mobil : ");
        super.displayInfo();
        System.out.println("Tipe Mobil : " + CarType);
        cekType();
        super.displayDisc();
    }
}
