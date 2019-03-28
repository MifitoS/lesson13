package lesson17;



import java.util.HashMap;
import java.util.Set;

public class Holodilnik {
    private HashMap<String, Integer> products = new HashMap<>();
    private int capasity = 50; //обьъем холодильника

    public void addProduct(String product, int value) throws NullPointerException{
        if(product==null){
            throw new NullPointerException("Product is null");
        }
        if(products.containsKey(product)){
            int currentValue = products.get(product);
            int newValue = value + currentValue;
            products.put(product,newValue);

        }else{
            products.put(product,value);
        }
    }

    public void deleteProduct(String product, int value) {
        if (!products.containsKey(product)) {
            System.out.println("Такого продукта в холодильнике нет!!!");
            return;
        }
        int carrentValue = products.get(product);
        if (value > carrentValue) {
            System.out.println("Вы запрашиваете больше, чем у нас есть в холодильнике!!!");
            return;
        }

        int newValue = carrentValue - value;
        if (newValue == 0) {
            products.remove(product);
        } else {
            products.put(product, newValue);

        }
    }

    public void printListProducts(){

       Set<String> productsName =  products.keySet();
       for(String name: productsName){
           System.out.printf("%s - %d кг",name, products.get(name));
           System.out.println();
       }

    }

}
