
import java.util.Scanner;

public class Javascannertry {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Inserisci il tuo nome: " );
            String nome = scanner.nextLine();
            //is empty controlla se e stato inserito un valore
            if(nome.isEmpty()){
                throw new NullPointerException("");
            }else
            System.out.print("Ciao! " + nome.toLowerCase()); 
            //il catch permette di visuallizzare l'eccezione
        }catch(Exception e){
            
            System.out.print("Non puoi lasciare lo spazio vuoto!");
        }
        
    }
}
// fatto senza AI \°o°/
