package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //k3
        Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //k3 -> model3
        Car model3 = new Model3Car();
        driver.setCar(model3);
        driver.drive();
    }
}
