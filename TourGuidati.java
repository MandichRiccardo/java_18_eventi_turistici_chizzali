public class TourGuidati extends Eventi{

    public TourGuidati() {
        super();
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
        return info;
    }
}