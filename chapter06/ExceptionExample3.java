package chapter06;
import java.util.ArrayList;


/**
 * Escreva uma descrição da classe ExceptionExample3 aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ExceptionExample3{
    private ArrayList<String> allNotes;
    
    public ExceptionExample3(){
        allNotes = new ArrayList<>();
    }
    
    public void addNote(String note){
        try{
            if (note.trim().compareTo("") == 0){
                throw new BlankNoteException("blank note");
            } else {
                allNotes.add(note);
            }
        }
        catch (BlankNoteException e){
            System.out.println("Try again!");
        }
    }
}
