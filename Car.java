public class Car extends Vehicle{
    enum CarType{
        PREMIUM_CAR,
        FAMILY_CAR,
        CITY_CAR
    }
    private CarType CarType;

    public Car(String brand, int year, double rentalPrice, CarType CarType){
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
