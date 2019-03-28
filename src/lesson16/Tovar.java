package lesson16;

import java.util.Objects;

public class Tovar implements Comparable<Tovar> {
    private int buyCount;
    private int price;
    private String name;
    private int rate;
    private int view;
    private int review;

    public Tovar() {
    }

    public Tovar(int buyCount, int price, String name, int rate, int view, int review) {
        this.buyCount = buyCount;
        this.price = price;
        this.name = name;
        this.rate = rate;
        this.view = view;
        this.review = review;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getReview() {
        return review;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tovar tovar = (Tovar) o;
        return buyCount == tovar.buyCount &&
                price == tovar.price &&
                rate == tovar.rate &&
                view == tovar.view &&
                review == tovar.review &&
                Objects.equals(name, tovar.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(buyCount, price, name, rate, view, review);
    }

    public void setReview(int review) {
        this.review = review;


    }

    @Override
    public String toString() {
        return "Tovar{" +
                "buyCount = " + buyCount +
                ", price = " + price +
                ", name = " + name + '\'' +
                ", rate = " + rate +
                ", view = " + view +
                ", review = " + review +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {
        if (this.price != o.price) {
            return this.price - o.price;
        }
        if (this.buyCount != o.buyCount) {
            return this.buyCount - o.buyCount;

        }
        if (this.view != o.view) {
            return this.view - o.view;

        }
        if (this.review != o.review) {
            return this.review - o.review;
        }
        if (this.rate != o.rate){
            return this.rate - o.rate;
        }
        return this.name.compareTo(o.name);
    }

}
