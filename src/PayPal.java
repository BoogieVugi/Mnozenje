class PayPal implements Placanje {
    private double iznos;

    public void platiti(double iznos) {
        this.iznos = iznos;
        System.out.println("Placanje putem PayPala u iznosu od: " + iznos + " EUR.");
    }

    public String getDetalje() {
        return "Transakcija putem PayPala u iznosu od: " + iznos + " EUR.";
    }
}
