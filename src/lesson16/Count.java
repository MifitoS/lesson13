package lesson16;

import java.util.Comparator;

public class Count implements Comparator<Tovar> {

    @Override
    public int compare(Tovar o1, Tovar o2) {

        if (o1.getBuyCount() != o2.getBuyCount()) {
            return o1.getBuyCount() - o2.getBuyCount();
        }
        if (o1.getRate() != o2.getRate()) {
            return o2.getRate() - o1.getRate();
        }
        if (o1.getPrice() != o2.getPrice()) {
            return o2.getPrice() - o1.getPrice();
        }

        if (o1.getView() != o2.getView()) {
            return o2.getView() - o1.getView();

        }
        if (o1.getReview() != o2.getReview()) {
            return o2.getReview() - o1.getReview();
        }

        return o2.getName().compareTo(o1.getName());
    }
}
