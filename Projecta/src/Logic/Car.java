package Logic;

public class Car {
    private int mileage;
    private int actualSpeed;

    public Car(int mileage, int actualSpeed) {
        this.mileage = mileage;
        this.actualSpeed = actualSpeed;
    }
    public void accelerate(){
        this.actualSpeed += 5;
    }
}
