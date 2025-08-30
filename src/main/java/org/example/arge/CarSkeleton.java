package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {

    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        System.out.println("Starting engine " + getClass().getSimpleName());
        return getName() + "starting engine";
    }

    public String drive(){
        runEngine(this);
        return getName() + "is driving ";
    }

    protected void runEngine(CarSkeleton carSkeleton) {
        System.out.println( carSkeleton.getClass().getSimpleName());
        if(carSkeleton instanceof ElectricCar){
            double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("Electric car started" +  "batterySize: " + batterySize + "avgKmPerCharge: " + avgKmPerCharge);
        }else if(carSkeleton instanceof HybridCar){
            HybridCar hybridCar = (HybridCar) carSkeleton;
            System.out.println("Hybrid car started" + hybridCar.getAvgKmPerLitre() + " batterySize: " + hybridCar.getBatterySize() + "cyclinders :" + hybridCar.getCylinders() );
        }else if(carSkeleton instanceof GasPoweredCar){
            GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
            System.out.println("gas power car started" + "averageKmPerLiter: "+ gasPoweredCar.getAvgKmPerLitre() + "cylinders : " +gasPoweredCar.getCylinders());
        } else {
            System.out.println("CarSkeleton is not a valid car skeleton");
        }
    }
}
