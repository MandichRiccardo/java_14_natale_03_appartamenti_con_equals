public class Persona{
    private String nome;
    private String cognome;
    private String codiceFiscale;
    private int annoNascita;

    public Persona(String nome, String cognome, int annoNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public String getNome(){
        return nome;
    }

    public String toString(){
        String info = "";
        info += "\t\tnome:\t" + nome + "\n";
        info += "\t\tcognome:\t" + cognome + "\n";
        info += "\t\tcodice fiscale:\t" + codiceFiscale + "\n";
        info += "\t\tanno di nascita:\t" + annoNascita + "\n";
        return info;
    }
}