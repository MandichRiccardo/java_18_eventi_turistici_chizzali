public class Turismo{
    protected Eventi[] eventiTotali;
    public Turismo(){
        eventiTotali = new Eventi[3];
        for(int i=0;i<eventiTotali.length;i++) eventiTotali[i] = new Eventi();
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
    public Eventi piuConsigliato(){
        Eventi piuConsigliato = eventiTotali[0];
        for(Eventi e:eventiTotali){
            if(e.quantiConsigliato()>piuConsigliato.quantiConsigliato()) piuConsigliato = e;
        }
        return piuConsigliato;
    }
}