public class Turismo{
    protected Eventi[] eventiTotali;
    public Turismo(int numeroEventi){
        if (numeroEventi<=100) eventiTotali = new Eventi[numeroEventi];
        else {
            eventiTotali = new Eventi[100];
            System.out.println("ho messo un massimo di 100 eventi come da indicazioni");
        }
    }
    public void addEvento(Eventi e){
        int i = 0;
        while(eventiTotali[i] != null) i++;
        eventiTotali[i] = e;
    }
    public String trovaEventi(String localita){
        String stringa = "ho trovato i seguenti eventi:\n";
        for(Eventi e:eventiTotali){
            try{
                stringa = stringa.concat(e.concatenaSeLocalita(localita) + "\n");
            }
            catch (NullPointerException exception){

            }
        }
        return stringa;
    }
    public Eventi piuConsigliato(){
        Eventi piuConsigliato = eventiTotali[0];
        for(Eventi e:eventiTotali){
            try {
                if (e.quantiConsigliato() > piuConsigliato.quantiConsigliato()) piuConsigliato = e;
            } catch (NullPointerException exception) {

            }
        }
        return piuConsigliato;
    }
}