package lesson15;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("ololo");
        strings.add("privet");
        strings.add("qwerty");
        strings.add("MifitoS");
        strings.add("Ann");

        for(String s:strings){
            System.out.println(s);
        }
        for (Iterator<String> iterator = strings.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
