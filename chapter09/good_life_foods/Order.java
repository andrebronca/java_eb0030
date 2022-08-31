package chapter09.good_life_foods;
import java.util.ArrayList;


/**
 * Escreva uma descrição da classe Order aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Order
{
    /*
     * Esse uniqueReference, pode ser feito de diversas formas.
     * a mais simples seria pegar o total de segundos no 
     * momento que o pedido foi feito, tem que pensar como
     * lidar caso ocorra números iguais.
     */
    private String uniqueReference;
    private ArrayList<Item> allItems;
    private double costOfItems;     //mínimo 10 no total
    private double deliveryCharge = 5.0;  //de 10 a 30 + 5, > 30 é free
    public static int numOrder;
    private boolean calculado;
    
    public Order(){
        allItems = new ArrayList<>();
        ++numOrder;
    }
    
    public void addItem(Item item){
        if (item != null){
            allItems.add(item);
        }
    }
    
    public void summarise(){
        System.out.println("Nr pedido: "+ numOrder +"\n"
            + "Total: R$"+ String.format("%.2f", (costOfItems + deliveryCharge))
        );
    }
    
    public void detailsOrder(){
        calcularTotal();
        System.out.println("Nr do pedido: "+ numOrder +"\n"
            + "ID Pedido: "+ getUnique() +"\n" 
            + "Itens: R$"+ String.format("%.2f", costOfItems) +"\n"
            + "Frete: R$"+ String.format("%.2f", deliveryCharge) +"\n"
            + "Total: R$"+ String.format("%.2f", calculatetotalCost())
        );
        System.out.println("--- Lista dos itens ----");
        for(Item i : allItems){
            i.describeItem();
        }
    }
    
    /**
     * Uma das formas para exibir um id único para
     * o pedido.
     */
    public String getUnique(){
        return String.valueOf(allItems.hashCode());
    }
    
    /**
     * O flag calculado evita que a cada chamada (relatório do pedido)
     * ocorra o recálculo, aumentando o valor do pedido erroneamente.
     * O flag calculado será alterado caso ocorra a remoção de algum item
     * pois haverá alteração no valor total do pedido.
     * Se ocorrer a adição de: 3 itens, e solicitar o calculo total
     * haverá um valor para: costOfItems.
     * Se houver remoção de um item, é necessário zerar o costOfItems
     * para que não ocorra soma de valores anteriores.
     * Esse método é privado, pois o método público já faz a chamada.
     */
    private void calcularTotal(){
        if (!calculado){
            costOfItems = 0.0;
            for(Item i : allItems){
                costOfItems += i.calculateCost();
            }
            if (costOfItems > 30){
                deliveryCharge = 0.0;
            }
            calculado = true;
        }
    }
    
    public double calculatetotalCost(){
        calcularTotal();
        return costOfItems + deliveryCharge;
    }
    
    public int getNumberOfItems(){
        return allItems.size();    
    }
    
    /**
     * Está sendo tratada a situação de informar um
     * índice fora da faixa da lista.
     * Após a remoção do item, é necessário mudar o flag
     * que permite o recalculo.
     */
    public void deleteItem(int idx){
        if (idx >= 0 && idx < allItems.size()){
            allItems.remove(idx);
            calculado = false;
        }
    }
    
    /**
     * Permitindo a remoção pelo nome do produto
     */
    public void deleteItem(String itemName){
        for(Item i : allItems){
            if (i.getName().equalsIgnoreCase(itemName.trim())){
                allItems.remove(i);
                calculado = false;
                return;
            }
        }
    }
}
