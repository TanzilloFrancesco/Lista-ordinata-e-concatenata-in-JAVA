public class lista{
    private nodo head;
    private int counter;
    
    public lista(){
        
        this.head = null;
        this.counter = 0;
        
    }
    
    public void stampa(){
        
        nodo corrente = this.head;
        
        System.out.printf("\n[%d]", this.counter);
        
        while(corrente != null){
            System.out.printf(" %d -->", corrente.val);
            corrente = corrente.next;
        }
        
        System.out.print(" NULL\n");
    }
    
    public void inserisci_nodo(int val){
        
        nodo corrente = this.head;
        nodo prev = null;
        nodo temp = new nodo(val);
        
        while(corrente != null && corrente.val <= temp.val){
            
            prev = corrente;
            corrente = corrente.next;
            
        }
        
        if(prev == null){
            temp.next = this.head;
            this.head = temp;
        }else{
            prev.next = temp;
            temp.next = corrente;
        }
        
        this.counter++;
        
    }
    
    public void rimuovi_nodo(int val){
        
        nodo corrente = this.head;
        nodo prev = null;
        nodo temp = null;
        while(corrente != null && corrente.val != val){
            
            prev = corrente;
            corrente = corrente.next;
            
        }
        
        if(corrente == null){
            
            System.out.println("Elemento non trovato nella lista, non faccio nulla\n");
            return;
            
        }    
        
        System.out.printf("Elemento %d trovato, vediamo cosa fare\n", val);
        this.counter--;
        
        if (prev == null){
            
            System.out.printf("L'elemento da eliminare e' in testa, elimina\n");
            this.head = this.head.next;  
            return;
            
        }
        
        System.out.printf("L'elemento da eliminare non e' in testa, elimina\n");
        prev.next = prev.next.next;
    }
}