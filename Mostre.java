public class Mostre extends Eventi{
    private int inizio;
    private int fine;
    public Mostre(){
        super();
        codiceUnivoco = codiceUnivoco.toUpperCase();
        codiceUnivoco = codiceUnivoco.replace('E', 'M');
    }

    @Override
    public boolean ControllaDisponibilita(String data, int postiRichiesti, String meteo) {
        int mesePassato = Integer.parseInt(data.substring(5, 7));
        return inizio <= mesePassato && mesePassato <= fine;
    }

    @Override
    public String toString() {
        String info = super.toString();
        return info;
    }
}
