public class Truck extends Vehicle{
    private int cargoCapacity;
    public int getCargoCapacity() {
        return cargoCapacity;
    }
    public Truck(String brand, int year, double rentalPrice, int cargoCapacity){
        super(brand, year, rentalPrice);
        this.cargoCapacity = cargoCapacity;
    }
    public void cekCargo(){
        if(getCargoCapacity() > 2000){
            plusDisc(0.10);
        }
    }
    public void displayInfo(){
        System.out.println("Detail Truk : ");
        super.displayInfo();
        System.out.println("Kapasitas Kargo : " + getCargoCapacity());
        cekCargo();
        super.displayDisc();
    }
}
