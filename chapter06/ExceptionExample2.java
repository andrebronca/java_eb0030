package chapter06;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * Escreva uma descrição da classe ExceptionExample2 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ExceptionExample2{
    
    /**
     * Here we deal with the IOException locally.
     */
    public void openFileAndReadLinesV1(){
        try{
            FileReader f = new FileReader("c:\\test.txt");
            BufferedReader r = new BufferedReader(f);
            String line;
            line = r.readLine();
            while (line != null){
                System.out.println(line);
                line = r.readLine();
            }
            r.close();
            f.close();
            
        }
        catch (IOException e){
            System.out.println("Problem opening file");
        }
    }
    
    /**
     * Here we rely on something else to catch our exception
     */
    public void openFileAndReadLinesV2() throws IOException {
        FileReader f = new FileReader("c:\\test.txt");
        BufferedReader r = new BufferedReader(f);
        
        String line;
        line = r.readLine();
        while (line != null){
            System.out.println(line);
            line = r.readLine();
        }
        r.close();
        f.close();
    }
}
