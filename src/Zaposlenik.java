public class Zaposlenik {

    private String ime;
    private String prezime;
    private double placa;

    public Zaposlenik(String ime, String prezime, double placa) throws InvalidInputException {
        if (ime == null || ime.trim().isEmpty()) {
            throw new InvalidInputException("Ime ne smije biti prazno.");
        }
        if (prezime == null || prezime.trim().isEmpty()) {
            throw new InvalidInputException("Prezime ne smije biti prazno.");
        }
        if (placa <= 0) {
            try {
                throw new InvalidSalaryException("Plaća mora biti veća od 0.");
            } catch (InvalidSalaryException e) {
                throw new RuntimeException(e);
            }
        }
        this.ime = ime;
        this.prezime = prezime;
        this.placa = placa;
    }

    public double getPlaca() {
        return placa;
    }

    public String toString() {
        return "Zaposlenik: " + ime + " " + prezime + ", Plaća: " + placa;
    }
}

