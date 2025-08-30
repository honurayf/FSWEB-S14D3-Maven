package org.example.arge;

public class ElectricCar extends CarSkeleton{
    //avgKmPerCharge: double ve batterySize: int
        private double avgKmPerCharge;
        private int batterySize;

        public ElectricCar(String name, String description, double avgKmPerCharge ,int batterySize){
            super(name, description);
            this.avgKmPerCharge = avgKmPerCharge;
            this.batterySize = batterySize;
        }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public void setAvgKmPerCharge(double avgKmPerCharge) {
        this.avgKmPerCharge = avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    @Override
    public String drive(){
        return  "is driving ElectricCar";
    }

    @Override
    public String startEngine(){
            runEngine(this);
            return getName() + "is driving ElectricCar";
    }
}
