public class WhileEsercizi {
   
    public static void main(String[] args) {
        // int stamina=10;
        //while fa un loop finche la condizione non si verifichi vera
        //in questo caso continua finche la stamina scende a zero
    //     while(stamina >=0){
    //     if(stamina >0){
    //         System.out.println("il personaggio attacca!");
    //     }
    //     else{
    //         System.out.println("hai finito la stamina!");
    //     }
    //     stamina = stamina-1;
    //    }

    //calcolo attacco
        int danno = 10;
       int stamina1 = 10;
       String nomePersonaggio = "Gaglio";
       //stessa cosa ma con il break!
        while (stamina1 > 0) {
        System.out.println(nomePersonaggio+" attacca facendo " + danno+" di danno!");
        stamina1--;
        if (stamina1 == 0) {
            System.out.println(nomePersonaggio+" ha finito la stamina!");
            break;
            }
        }
        //calcolo durabilita armatura
        int durabilitaArmatura = 10;
        int dannoArmatura =1;
        while(durabilitaArmatura >0){
            durabilitaArmatura-= dannoArmatura;
            if (durabilitaArmatura ==0){
                System.out.println("L'armatura si è rotta!");
                break;
            }
        }
        //calcolo schivata 
        int destrezza = 10;
        int staminaSchivata = stamina1;
        if(destrezza >5 && stamina1 >0){
            System.out.println(nomePersonaggio+" schiva!");
            staminaSchivata--;
        }else{
            System.out.println(nomePersonaggio+" non può schivare!");
        }
        //calcolo vita personaggio
        int pfPersonaggio = 20;
        int dannoNemico1 = 3;
        while(pfPersonaggio >0){
        if(pfPersonaggio >0){
            System.out.println(nomePersonaggio +" prende "+ dannoNemico1 +" di danno!");
            int vitaRimanente =pfPersonaggio - dannoNemico1;
            System.out.println(vitaRimanente + " punti vita rimanenti!");
        }
            System.out.println(nomePersonaggio +" e stato sconfitto!");
            break;
       }
    } 
}
// fatto senza AI \°o°/
