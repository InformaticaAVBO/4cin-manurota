import java.io.FileWriter;
public class App {
    public static void main(String[] args) throws Exception {
        
        FileWriter writer = new FileWriter("output.txt");
        writer.write("CIAO questa è una prova");
        writer.write("questa è la seconda riga");
        writer.close();
        
    
    
    
    }
}
