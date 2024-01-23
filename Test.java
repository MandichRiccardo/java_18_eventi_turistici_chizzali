public class Test{
    public static void main(String[] args) {
        Turismo t = new Turismo(100);
        t = esecuzione(t);
    }
    public static Turismo esecuzione(Turismo t){
        System.out.println("cosa vuoi fare?");
        System.out.println("1)\tinserire una mostra");
        System.out.println("2)\tinserire un tour guidato");
        System.out.println("3)\tinserire uno spettacolo");
        System.out.println("4)\tcercare gli eventi di una determinata località");
        System.out.println("5)\ttrovare l'evento più consigliato e controllarne la disponibilità");
        System.out.println("6)\tuscire dall'esecuzione del programma");
        switch (new java.util.Scanner(System.in).nextInt()) {
            case 1 -> {
                t.addEvento(new Mostre());
            }
            case 2 -> {
                t.addEvento(new TourGuidati());
            }
            case 3 -> {
                t.addEvento(new Spettacoli());
            }
            case 4 -> {
                System.out.println("inserisci la località in cui vuoi cercare eventi");
                System.out.println(t.trovaEventi(new java.util.Scanner(System.in).nextLine()));
            }
            case 5 -> {
                t.piuConsigliato().ControllaDisponibilita("22/01/2024",7, "nuvoloso");
            }
            default ->{
                return t;
            }
        }
        return esecuzione(t);
    }
}