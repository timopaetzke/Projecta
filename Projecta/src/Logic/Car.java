package Logic;

public class Car {
    private int mileage;
    private int actualSpeed;

    public Car(int mileage, int actualSpeed) {
        this.mileage = mileage;
        this.actualSpeed = actualSpeed;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public int getMileage() {
        return mileage;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed = actualSpeed;
    }

    public void setMileage(int mileage) {
    }
}
