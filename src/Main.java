public class Main {
    public static void main(String[] args) {
        Roman roman = new Roman("Ana Karenjina", "Lav Tolstoj", 1878, 864);
        System.out.println("Naslov romana: " + roman.getNaslov());
        System.out.println("Stanje prije posudbe: " + roman.getStanje());
        roman.posudi();
        System.out.println("Stanje nakon posudbe: " + roman.getStanje());
        roman.vrati();
        System.out.println("Stanje nakon vraćanja: " + roman.getStanje());

        Strip strip = new Strip("Spider-Man", "Stan Lee", 1963, 32);
        System.out.println("\nNaslov stripa: " + strip.getNaslov());
        System.out.println("Stanje prije posudbe: " + strip.getStanje());
        strip.posudi();
        System.out.println("Stanje nakon posudbe: " + strip.getStanje());
        strip.vrati();
        System.out.println("Stanje nakon vraćanja: " + strip.getStanje());
    }
}