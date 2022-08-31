package chapter09.good_life_foods;
import java.util.HashMap;

/**
 * Essa classe não teve uma boa especificação.
 * Não vou tentar implementá-la.
 * Obs.: Tive que fazer diversas alterações no projeto, pois foi
 * mal especificado. 
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class GoodLifeFoods
{
    private HashMap<String, Customer> allOrders;
    
    public GoodLifeFoods(){
        allOrders = new HashMap<>();
    }

    //o objeto customer já possui esses dados, então vou deixar private
    private void registerCustomer(String firstname
        , String lastname, String address){
    }
    
    public void placeOrderForCustomer(Customer c){
        if (c != null){
            String unique = c.getOrder().getUnique();
            allOrders.put(unique, c);
        }
    }
    
    public Customer recoverOrder(String uniqRef){
        if (uniqRef != null){
            if (allOrders.containsKey(uniqRef)){
                return (Customer) allOrders.get(uniqRef);
            }
        }
        return null;
    }
    
    /**
     * Aqui ficou estranho, pois cada ordem tem um uniqueRef.
     * Teria que retornar uma lista.
     * Vou deixar private esse método, na especificação do exercício
     * isso não ficou claro.
     */
    private String genUniqueReference(){
        if (allOrders.size() > 0){
            return String.valueOf(allOrders.hashCode());
        }
        return null;
    }
}
