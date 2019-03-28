package lesson16;

import java.util.HashSet;
import java.util.TreeSet;

public class SortingTovars {
    public static void sortByPrice(HashSet<Tovar> tovars) {
        TreeSet<Tovar> result = new TreeSet<>();
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);

        }

    }

    public static void sortByPriceReverse(HashSet<Tovar> tovars) {
        TreeSet<Tovar> result = new TreeSet<>(new PriceReverse());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);


        }
    }

    public static void sortByCountReverse(HashSet<Tovar> tovars) {
        TreeSet<Tovar> result = new TreeSet<>(new CountReverse());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

    public static void sortByNameReverse(HashSet<Tovar> tovars) {
        TreeSet<Tovar> result = new TreeSet<>(new NameReverse());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }

    public static void sortByViewReverse(HashSet<Tovar> tovars) {
        TreeSet<Tovar> result = new TreeSet<>(new ViewReverse());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);

        }
    }

    public static void sortByReviewReverse(HashSet<Tovar> tovars) {
        TreeSet<Tovar> result = new TreeSet<>(new ReviewReverse());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);

        }
    }

    public static void sortByRateReverse(HashSet<Tovar> tovars) {
        TreeSet<Tovar> result = new TreeSet<>(new RateReverse());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }
    public static void sortByCount(HashSet<Tovar> tovars) {
        TreeSet<Tovar> result = new TreeSet<>(new Count());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }
    public static void sortByName(HashSet<Tovar> tovars) {
        TreeSet<Tovar> result = new TreeSet<>(new Name());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }
    public static void sortByView(HashSet<Tovar> tovars) {
        TreeSet<Tovar> result = new TreeSet<>(new View());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }
    public static void sortByReview(HashSet<Tovar> tovars) {
        TreeSet<Tovar> result = new TreeSet<>(new Review());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }
    public static void sortByRate(HashSet<Tovar> tovars) {
        TreeSet<Tovar> result = new TreeSet<>(new Rate());
        result.addAll(tovars);

        for (Tovar t : result) {
            System.out.println(t);
        }
    }
}