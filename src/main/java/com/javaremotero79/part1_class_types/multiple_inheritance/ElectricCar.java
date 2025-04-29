package com.javaremotero79.part1_class_types.multiple_inheritance;



/* ElectricCar se va comporta cu un dublu rol:
 * va fi o clasa de implementare pt cele 2 interfete, ElectrySystem si NavigationSystem
 * va fi o sub-clasa a clasei parinte GenericVehicle
 * */
public class ElectricCar extends GenericVehicle implements ElectricSystem, NavigationSystem {

    private int batteryLevel;
    private double range;

    // There is no parameterless constructor available
    public ElectricCar(
            String brand,
            String model,
            int yearOfFabrication,
            int batteryLevel,
            double range
    ) {
        super(brand, model, yearOfFabrication);
        this.batteryLevel = batteryLevel;
        this.range = range;
    }

    // metoda drive e vizibila public doar in interiorul pachetului de definitie
    // metoda drive nu e vizibila, fiind privata, in afara pachetului
    @Override
    void drive() {
        System.out.println(this.brand + " " + this.model + " is driving silently...");
    }

    @Override
    public void chargeBattery() {
        System.out.println("Battery charged to " + this.batteryLevel);
    }

    @Override
    public void navigateTo(String destination) {
        System.out.println("Navigating to " + destination + " using built-in GPS...");
    }

    public void displayStatus() {
        System.out.println("Car: " + this.brand + " " + this.model + " (" + this.yearOfFabrication + ")");
        System.out.println("Battery level: " + this.batteryLevel + "%");
        System.out.println("Estimated range: " + this.range + " km");
    }

    // todo: creati inca 2 clase DieselCar si BenzinaCar
}
