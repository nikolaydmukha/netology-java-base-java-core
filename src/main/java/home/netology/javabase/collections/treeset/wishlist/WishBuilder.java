package main.java.home.netology.javabase.collections.treeset.wishlist;

public class WishBuilder {
    private Wish newWish;

    public WishBuilder() {
        this.newWish = new Wish();
    }

    public WishBuilder withName(String name) {
        newWish.setName(name);
        return this;
    }

    public WishBuilder withDescription(String description) {
        newWish.setDescription(description);
        return this;
    }

    public WishBuilder withPrice(double price) {
        newWish.setPrice(price);
        return this;
    }

    public WishBuilder withURL(String url) {
        newWish.setUrl(url);
        return this;
    }

    public WishBuilder withPriority(int priority) {
        newWish.setPriority(priority);
        return this;
    }

    public Wish build(){
        return newWish;
    }
}
