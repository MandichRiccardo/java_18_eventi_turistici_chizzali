public class TourGuidati extends Eventi{

    private int postiDisponibili;
    private String orario;
    private int[] giorni;
    public TourGuidati() {
        super();
        codiceUnivoco = codiceUnivoco.toUpperCase();
        codiceUnivoco = codiceUnivoco.replace('E', 'T');
        giorni = new int[getInt("quanti giorni in un mese è presente questo tour?")];
        for(int i=0;i<giorni.length;i++) giorni[i]=getInt("inserisci il " + (i+1) + "° giorno di mostra");
        orario = getString("Inserisci l'orario del tour: ");
        postiDisponibili = getInt("Inserisci il numero di posti disponibili del tour.");
    }

    @Override
    public boolean ControllaDisponibilita(String data, int postiRichiesti, String meteo) {
        if(postiRichiesti>postiDisponibili) return false;
        return contains(Integer.parseInt(data.substring(1, 3)), giorni);
    }

    private boolean contains(int o, int[] a){
        for(int i:a){
            if(i==o) return true;
        }
        return false;
    }

    @Override
    public String toString(){
        String info = super.toString();
        info += "\tOrario:\t" + orario + "\n";
        info += "\tPostiDisponibili\t" + postiDisponibili + "\n";
        for(int i = 0; i<giorni.length; i++) System.out.println("\t\tGiorno " + (i+1) + ":\t" + giorni[i] + "\n");
        return info;
    }
}