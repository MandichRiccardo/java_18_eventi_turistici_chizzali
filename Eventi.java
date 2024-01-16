
/**
 * Aggiungi qui una descrizione della classe Eventi
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Eventi
{
    protected String localita;
    protected String descrizione;
    protected boolean[] feedback;
    protected String codiceunivoco;
    public Eventi(String localita, String descrizione)
    {
        this.localita = localita;
        this.descrizione = descrizione;
        this.feedback = new boolean[20];
        for(int i = 0;i<feedback.length;i++){
            feedback[i] = getBoolean("al " + (i+1) + "° partecipante è piaciuto l'evento?");
        }
    }
    public void Consigliato(){
        int positivi = 0;
        int negativi = 0;
        for(boolean i:feedback){
            if(i) positivi++;
            else negativi++;
        }
        System.out.println("i feedback positivi su questo evento sono: " + positivi + "\n");
        System.out.println("i feedback negativi su questo evento sono: " + negativi + "\n");
    }
    public boolean ControllaDisponibilita(String data, String meteo)
    {
        return true;
    }
    public String concatenaSeLocalita(String localita){
        if(this.localita == localita) return this + "";
        else return "";
    }
    public String toString(){
        String info = "";
        info += "\tLocalità:\t" + localita + "\n";
        info += "\tdescrizione:\t" + descrizione + "\n";
        for(int i=0;i<feedback.length;i++){
            info = info.concat("\t\tconsigliato " + (i + 1) + ":\t" + feedback[i] + "\n");
        }
        info += "\tCodice Univoco:\t" + codiceunivoco + "\n"; 
        return info;
    }
    public boolean getBoolean(String stringa){
        return getInt(stringa + "\ninserisci 0 per no e qualsiasi altro valore per sì") != 0;
    }
    public int getInt(String stringa){
        System.out.println(stringa);
        return new java.util.Scanner(System.in).nextInt();
    }
}
