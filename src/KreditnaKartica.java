class KreditnaKartica implements Placanje {
    private double iznos;

    public void platiti(double iznos) {
        this.iznos = iznos;
        System.out.println("Placanje putem kreditne kartice u iznosu od: " + iznos + " EUR.");
    }

    public String getDetalje() {
        return "Transakcija putem Kreditne Kartice u iznosu od: " + iznos + " EUR.";
    }
}
