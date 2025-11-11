package SerieA;
import java.io.*;
import java.util.Scanner;

public class Campionato {

    private Squadra[] campionato; 

    public Campionato(){

    }

    public Campionato(File f){

            Scanner fileReader;
            try {
                fileReader = new Scanner(f);
                campionato = new Squadra[20];
                for(int i=0; i<20; i++){
                    if (fileReader.hasNextLine()) {
                        String[] array = fileReader.nextLine().split(";");
                        String nome = array[0]; 
                        int pv = Integer.valueOf(array[1]);
                        int ppa = Integer.valueOf(array[2]);
                        int ppe = Integer.valueOf(array[3]); 
                        int ptot = Integer.valueOf(array[4]); 
                        campionato[i] = new Squadra(nome, pv, ppa, ppe, ptot);
                    }
                }
            fileReader.close();
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
    }

    public void stampa(){
        for (Squadra squadra : campionato) {
            System.out.println(squadra);
        }
    }

    public Squadra ricerca(String nome){
        for (Squadra s : campionato) {
            if (s.getNome().equalsIgnoreCase(nome)) {
                return s;
            } else {}
        }
        return null;
    }

    public void controllaPunteggio(String squadra){
        for (Squadra s : campionato) {
            if (s.getNome().equalsIgnoreCase(squadra)) {
                Squadra s1 = s;
                int pv = s.getPv(); 
                int ppa = s.getPpa();
                if (s.getPtot() != (pv * 3 + ppa)) {
                    System.out.println("I punti non sono assegnati correttamente, ricalcolo");
                    s.setPtot(pv * 3 + ppa);
                }
            } else {
                
            }
        }
    }







    
}
