package NewPapka;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(5);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(1);
        num2.add(7);
        num2.add(6);
        num2.add(5);

        CollectionUtilsImpl utils = new CollectionUtilsImpl();
        Collection<Integer> result1 = utils.union(num1,num2);
        System.out.println(result1);

        CollectionUtilsImpl utils1 = new CollectionUtilsImpl();
        Collection<Integer> result2 = utils1.intersection(num1,num2);
        System.out.println(result2);


        CollectionUtilsImpl utils3 = new CollectionUtilsImpl();
        Collection<Integer> result4 = utils3.unionWithoutDuplicate(num1,num2);
        System.out.println(result4);


        CollectionUtilsImpl utils2 = new CollectionUtilsImpl();
        Collection<Integer> result3 = utils2.intersectionWithoutDuplicate(num1,num2);
        System.out.println(result3);

        CollectionUtilsImpl utils4 = new CollectionUtilsImpl();
        Collection<Integer> result5 = utils4.difference(num1,num2);
        System.out.println(result5);
    }

}
