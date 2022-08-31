package chapter09.good_life_foods;


/**
 * Escreva uma descrição da classe Customer aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Customer
{
    private String lastName;
    private String firstName;
    private String address;
    Order myOrder;
    
    public Customer(String lastName, String firstName, String address){
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        myOrder = new Order();
    }

    public void addItemToOrder(Item item){
        myOrder.addItem(item);
    }
    
    public void deleteItemFromOrder(int i){
        myOrder.deleteItem(i);
    }
    
    public void deleteItemFromName(String nameItem){
        myOrder.deleteItem(nameItem);
    }
    
    public void displayDetailsOfOrder(){
        System.out.println("----- Detalhe do pedido");
        cabecalhoCustomer();
        myOrder.detailsOrder();
        System.out.println("--------------------------");
    }
    
    private void cabecalhoCustomer(){
        System.out.println("Customer: "+ lastName +", "+ firstName 
            + address);
    }
    
    public Order getOrder(){
        return myOrder;
    }
    
    public void summariseOrder(){
        System.out.println("----- Resumo do pedido");
        cabecalhoCustomer();
        myOrder.summarise();
        System.out.println("--------------------------");
    }
    
    public double calculateTotalCost(){
        return myOrder.calculatetotalCost();
    }
}
