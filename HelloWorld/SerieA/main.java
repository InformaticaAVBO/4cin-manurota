package SerieA;
import java.io.*;
public class main{

    public static void main(String[] args){

        File f1 = new File("serieA.csv");
        Campionato c1 = new Campionato(f1);
        c1.controllaPunteggio("Napoli");
        System.out.println(c1.ricerca("napoli"));
        

            

        
    }


}



