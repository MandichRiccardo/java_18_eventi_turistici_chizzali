public class Spettacoli extends Eventi{

    private boolean aperto;
    public Spettacoli() {
        super();
        codiceUnivoco = codiceUnivoco.toUpperCase();
        codiceUnivoco = codiceUnivoco.replace('E', 'S');
        this.aperto = getBoolean("lo spettacolo è all'aperto?");

    }

    @Override
    public boolean ControllaDisponibilita(String data, int postiRichiesti, String meteo) {
        int mese = Integer.parseInt(data.substring(5,7));
        if(aperto){
            if(6>mese || mese > 8) return false;
            else if (meteo!="sereno"){
                return false;
            }
            return true;
        }else return true;
    }

    @Override
    public String toString(){
        String info = super.toString();
        info += "\taperto:\t" + aperto + "\n";
        return info;
    }
}