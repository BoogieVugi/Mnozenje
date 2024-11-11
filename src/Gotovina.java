class Gotovina implements Placanje {
    private double iznos;

    public void platiti(double iznos) {
        this.iznos = iznos;
        System.out.println("Placanje u gotovini u iznosu od: " + iznos + " EUR.");
    }
    public String getDetalje() {
        return "Transakcija u Gotovini u iznosu od: " + iznos + " EUR.";
    }
}
