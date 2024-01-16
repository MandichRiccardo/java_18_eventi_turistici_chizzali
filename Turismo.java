
/**
 * Aggiungi qui una descrizione della classe Main
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Turismo{
    protected Eventi[] eventiTotali;
    public Turismo(){
        eventiTotali = new Eventi[100];
    }
    public void addEvento(Eventi e){
        int i = 0;
        while(eventiTotali[i] != null) i++;
        eventiTotali[i] = e;
    }
    public String trovaEventi(String localita){
        String stringa = "";
        for(Eventi e:eventiTotali) stringa = stringa.concat(e.concatenaSeLocalita(localita) + "\n");
        return stringa;
    }
}