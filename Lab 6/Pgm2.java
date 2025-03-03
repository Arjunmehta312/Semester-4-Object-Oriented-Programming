package Practical6;

class Aircraft {
    private String name;
    private int speed;

    public Aircraft(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void display() {
        System.out.printf("%-25s %d\n", name, speed);
    }

    public static Aircraft findFastest(Aircraft[] aircrafts) {
        Aircraft fastest = aircrafts[0];
        for (Aircraft aircraft : aircrafts) {
            if (aircraft.getSpeed() > fastest.getSpeed()) {
                fastest = aircraft;
            }
        }
        return fastest;
    }
}

public class Pgm2 {
    public static void main(String[] args) {
        Aircraft[] aircrafts = {
            new Aircraft("Gulf Stream Private Jet", 673),
            new Aircraft("F-16 Fighter Jet", 1500),
            new Aircraft("Cessna Sea Plane", 1100),
            new Aircraft("Bell 407 Helicopter", 160),
            new Aircraft("Boeing 777", 644),
            new Aircraft("Glider", 150)
        };

        System.out.println("Aircrafts In Array");
        System.out.println("*******************************");
        System.out.printf("%-25s %s\n", "Aircraft", "Top Speed");
        System.out.println("-------------------------------------");

        for (Aircraft aircraft : aircrafts) {
            aircraft.display();
        }

        Aircraft fastest = Aircraft.findFastest(aircrafts);
        System.out.println("\nAircraft with fastest top speed in the array of aircraft");
        System.out.println("-------------------------------------");
        System.out.println("Aircraft: " + fastest.getName());
        System.out.println("Top Speed: " + fastest.getSpeed());
    }
}
