package pertemuan8.soal1;

public class Vehicle {
    private String brand;
    private int year;
    private double rentalPrice;
    private double disc;

    public Vehicle(String brand, int year, double rentalPrice){
        this.brand = brand;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }
    public double getDisc() {
        return disc;
    }
    public void plusDisc(double plus) {
        this.disc = disc + plus;
    }
    public void cekTahun(){
        if (getYear() < 2010){
            plusDisc(0.10);
        }
    }
    public void displayInfo(){
        System.out.println("Merk : " + getBrand());
        System.out.println("Tahun : " + getYear());
        System.out.println("Harga Sewa : " + getRentalPrice());
        cekTahun();
    }
    public void displayDisc(){
        System.out.print("Total Diskon : ");
        System.out.printf("%.1f", (getRentalPrice() * getDisc()));
        System.out.println();
        System.out.println("Harga sewa setelah diskon : " + (getRentalPrice() - (getRentalPrice() * getDisc())));
        System.out.println("-----------------------------------");
    }
}
