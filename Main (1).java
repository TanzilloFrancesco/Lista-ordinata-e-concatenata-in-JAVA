
public class Main{
    
    public static void main(String[] args){
        
        lista l = new lista();

        l.stampa();

        l.inserisci_nodo(12);
        l.stampa();

        l.inserisci_nodo(33);
        l.stampa();

        l.inserisci_nodo(1);
        l.stampa();

        l.inserisci_nodo(6);
        l.stampa();

        l.inserisci_nodo(2);
        l.stampa();

        l.rimuovi_nodo(33);
        l.stampa();

        l.rimuovi_nodo(12);
        l.stampa();

        l.rimuovi_nodo(10);

        l.rimuovi_nodo(15);
        l.stampa();
    }

}
