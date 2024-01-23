public class Turismo{
    protected Eventi[] eventiTotali;
    public Turismo(int numeroEventi){
        eventiTotali = new Eventi[numeroEventi];
    }
    public void addEvento(Eventi e){
        int i = 0;
        while(eventiTotali[i] != null) i++;
        eventiTotali[i] = e;
    }
    public String trovaEventi(String localita){
        String stringa = "ho trovato i seguenti eventi:\n";
        for(Eventi e:eventiTotali) stringa = stringa.concat(e.concatenaSeLocalita(localita) + "\n");
        return stringa;
    }
    public Eventi piuConsigliato(){
        Eventi piuConsigliato = eventiTotali[0];
        for(Eventi e:eventiTotali){
            if(e.quantiConsigliato()>piuConsigliato.quantiConsigliato()) piuConsigliato = e;
        }
        return piuConsigliato;
    }
}