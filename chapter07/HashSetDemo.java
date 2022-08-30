package chapter07;
import java.util.HashSet;

/**
 * Escreva uma descrição da classe HashSetDemo aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class HashSetDemo
{
    private HashSet<Card> cardPack;
    
    public HashSetDemo(){
        //we happen to know there are at most exactly 52 max cards.
        cardPack = new HashSet<>(52);
        //Seria melhor fazer um array com as cartas e um com as manilhas
        //percorre esses arrays adicionando: todo
        Card c1 = new Card('A',"Spades");
        Card c2 = new Card('2',"Spades");
        Card c3 = new Card('3',"Spades");
        
        //could just keep on adding cards ...
        cardPack.add(c1);   //ignoring returned value
        cardPack.add(c2);
        cardPack.add(c3);
        
        //now the size is 3
        showSize();
        
        //now try to add c1 again 
        cardPack.add(c1);
        
        //size remains the same
        showSize();
        
        //but we can create another distinct object
        //with the same internal data ...
        Card c4 = new Card('A', "Spades");
        cardPack.add(c4);
        
        //size is now 4
        showSize();
        
        /*
         * O que tem que cuidar é que, objetos iguais (repetidos) não 
         * são inseridos, mas objetos distintos com conteúdos iguals sim.
         * Pensando em algumas formas.
         * -Transformar valores e manilhas em interfaces ou abstract;
         * -Transformar em enum;
         * -Fixar em arrays distintos os valores de cartas e manilhas.
         * O padrão de cartas é o mesmo, mas jogos difentes usam combinações
         * diferentes. Tem que ter uma forma de configurar o tipo do jogo e
         * quais cartas utiliza. Pensando se for fazer algo mais amplo.
         */
    }
    
    public void showSize(){
        System.out.println("Number of elements: "+ cardPack.size());
    }
}
