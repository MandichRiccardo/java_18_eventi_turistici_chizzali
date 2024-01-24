public class Test{
    public static void main(String[] args) {
        System.out.println("inserisci il numero massimo di eventi inseribili");
        Turismo t = new Turismo(new java.util.Scanner(System.in).nextInt());
        System.out.println(esecuzione(t));
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
            case 1 -> t.addEvento(new Mostre());
            case 2 -> t.addEvento(new TourGuidati());
            case 3 -> t.addEvento(new Spettacoli());
            case 4 -> {
                System.out.println("inserisci la località in cui vuoi cercare eventi");
                System.out.println(t.trovaEventi(new java.util.Scanner(System.in).nextLine()));
            }
            case 5 -> {
                boolean disponibile = t.piuConsigliato().ControllaDisponibilita("2024/01/235",7, "nuvoloso");
                System.out.println("questo evento ");
                if(!disponibile) System.out.println("non ");
                System.out.println("è disponibile");
            }
            case 6 -> {
                return t;
            }
            default -> System.out.println("ATTENZIONE:\nnon esiste un'operazione relativa al numero inserito");
        }
        return esecuzione(t);
    }
}