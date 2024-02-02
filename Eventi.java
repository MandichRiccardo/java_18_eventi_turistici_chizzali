public abstract class Eventi
{
    protected String localita;
    protected String descrizione;
    protected boolean[] feedback;
    protected int partecipanti;
    protected String codiceUnivoco;
    protected static int indice;

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
    public abstract boolean ControllaDisponibilita(String data, int postiRichiesti, String meteo);
    public String concatenaSeLocalita(String localita){
        if(this.localita.equals(localita)) return this + "";
        else return "";
    }
    public String toString(){
        String info = "";
        info += "\tLocalità:\t" + localita + "\n";
        info += "\tdescrizione:\t" + descrizione + "\n";
        for(int i=0;i<feedback.length;i++){
            info = info.concat("\t\tconsigliato " + (i + 1) + ":\t" + feedback[i] + "\n");
        }
        info += "\tCodice Univoco:\t" + codiceUnivoco + "\n";
        return info;
    }
    public boolean getBoolean(String stringa){
        return getInt(stringa + "\ninserisci 0 per no e qualsiasi altro valore per sì") != 0;
    }

    public int getInt(String stringa){
        System.out.println(stringa);
        return new java.util.Scanner(System.in).nextInt();
    }

    public String getString(String stringa){
        System.out.println(stringa);
        return new java.util.Scanner(System.in).nextLine();
    }

    public int quantiConsigliato(){
        int quanti = 0;
        for(boolean n:feedback){
            if(n) quanti++;
        }
        return quanti;
    }
}
