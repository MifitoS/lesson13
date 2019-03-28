package lesson16;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Tovar> tovars = new HashSet<>();

        Tovar tovar1 = new Tovar(12,1110,"Мышка", 5, 101, 10);
        Tovar tovar2 = new Tovar(4,500,"Клавиатура", 4, 79, 200);
        Tovar tovar3 = new Tovar(2,2000,"Мышка 123456", 5, 28, 56);
        Tovar tovar4 = new Tovar(1,3000,"Мышка", 3, 34, 3);
        Tovar tovar5 = new Tovar(8,100,"Переходник", 3, 304, 1);
        Tovar tovar6 = new Tovar(12,1100,"Мышка", 5, 101, 10);

        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);
        tovars.add(tovar6);

        SortingTovars.sortByPriceReverse(tovars);
        System.out.println("--------------------------------------------");
        SortingTovars.sortByCountReverse(tovars);
        System.out.println("--------------------------------------------");
        SortingTovars.sortByNameReverse(tovars);
        System.out.println("--------------------------------------------");
        SortingTovars.sortByViewReverse(tovars);
        System.out.println("--------------------------------------------");
        SortingTovars.sortByReviewReverse(tovars);
        System.out.println("--------------------------------------------");
        SortingTovars.sortByRateReverse(tovars);
        System.out.println("--------------------------------------------");
        SortingTovars.sortByPrice(tovars);
        System.out.println("--------------------------------------------");
        SortingTovars.sortByCount(tovars);
        System.out.println("--------------------------------------------");
        SortingTovars.sortByName(tovars);
        System.out.println("--------------------------------------------");
        SortingTovars.sortByView(tovars);
        System.out.println("--------------------------------------------");
        SortingTovars.sortByReview(tovars);
        System.out.println("--------------------------------------------");
        SortingTovars.sortByRate(tovars);
        System.out.println("--------------------------------------------");




    }
}
