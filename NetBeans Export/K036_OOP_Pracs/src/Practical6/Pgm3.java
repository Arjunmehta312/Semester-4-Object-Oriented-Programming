package Practical6;

class Shopkeeper {
    private class Rackets {
        private String name;
        private String origin;
        private int price;
        private String color;

        public Rackets(String name, String origin, int price, String color) {
            this.name = name;
            this.origin = origin;
            this.price = price;
            this.color = color;
        }

        public int getPrice() {
            return price;
        }

        public void display() {
            System.out.printf("%-10s %-15s %-7d %-10s\n", name, origin, price, color);
        }
    }

    public void manageRackets() {
        Rackets[] rackets = {
            new Rackets("Voltric", "Japan", 5000, "Red"),
            new Rackets("Nanoray", "China", 4500, "Blue"),
            new Rackets("Astrox", "Taiwan", 5500, "Black"),
            new Rackets("Carbonex", "India", 4000, "White")
        };

        System.out.println("Available Rackets:");
        System.out.println("**********************************");
        System.out.printf("%-10s %-15s %-7s %-10s\n", "Name", "Origin", "Price", "Color");
        System.out.println("-----------------------------------");

        for (Rackets racket : rackets) {
            racket.display();
        }

        Rackets cheapest = rackets[0];
        for (Rackets racket : rackets) {
            if (racket.getPrice() < cheapest.getPrice()) {
                cheapest = racket;
            }
        }

        System.out.println("\nRacket with the lowest cost:");
        System.out.println("-----------------------------------");
        cheapest.display();
    }

    public static void main(String[] args) {
        Shopkeeper shop = new Shopkeeper();
        shop.manageRackets();
    }
}
