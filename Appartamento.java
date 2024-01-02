public class Appartamento{
    private double mq;
    private String citta;
    private String indirizzo;
    private String classeEnergetica;
    private boolean pregiato;
    private Persona proprietario;
    private double prezzoMq;
    private int piano;
    private double valore;

    public Appartamento(Persona proprietario) {
        this.proprietario = proprietario;
    }

    public Appartamento(double mq, String citta, String indirizzo, String classeEnergetica, boolean pregiato, Persona proprietario, double prezzoMq, int piano){
        this.mq = mq;
        this.citta = citta;
        this.indirizzo = indirizzo;
        this.classeEnergetica = classeEnergetica;
        this.pregiato = pregiato;
        this.proprietario = proprietario;
        this.prezzoMq = prezzoMq;
        this.piano = piano;
    }

    public Appartamento(Appartamento a, int piano) {
        this.mq = a.mq;
        this.citta = a.citta;
        this.indirizzo = a.indirizzo;
        this.classeEnergetica = a.classeEnergetica;
        this.pregiato = a.pregiato;
        this.proprietario = a.proprietario;
        this.prezzoMq = a.prezzoMq;
        this.piano = piano;
        this.valore = a.valore;
    }

    public void setMq(double mq) {
        this.mq = mq;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public void setClasseEnergetica(String classeEnergetica) {
        this.classeEnergetica = classeEnergetica;
    }

    public void setPregiato(boolean pregiato) {
        this.pregiato = pregiato;
    }

    public void setCodiceFiscaleProprietario(String codiceFiscale){
        proprietario.setCodiceFiscale(codiceFiscale);
    }

    public String getNomeProprietario(){
        return proprietario.getNome();
    }

    public void setPrezzoMq(double prezzoMq) {
        this.prezzoMq = prezzoMq;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public void setValore() {
        double valore;
        if((2023 - proprietario.getAnnoNascita())>17) {
            if (pregiato) {
                valore = prezzoMq + (prezzoMq / 100) * 15;
            } else {
                valore = prezzoMq;
            }
            this.valore = mq * valore;
            System.out.println("il valore è " + valore);
        }else{
            System.out.println("sei minorenne per cui non puoi comprare una casa");
        }
    }

    public String toString() {
        String info = "";
        info += "\tmetri quadrati:\t" + mq + "\n";
        info += "\tcittà:\t" + citta + "\n";
        info += "\tindirizzo:\t" + indirizzo + "\n";
        info += "\tclasse energetica:\t" + classeEnergetica + "\n";
        info += "\tpregiato:\t" + pregiato + "\n";
        info += "\tproprietario:\n" + proprietario + "\n";
        info += "\tprezzo al metro quadrato:\t" + prezzoMq + "\n";
        info += "\tpiano:\t" + piano + "\n";
        info += "\tvalore:\t" + valore + "\n";
        return info;
    }

    public boolean equals(Appartamento a) {
        if(a == null) return false;
        if(this.mq != a.mq) return false;
        if(this.classeEnergetica != a.classeEnergetica) return false;
        if(this.pregiato != a.pregiato) return false;
        return true;
    }
}