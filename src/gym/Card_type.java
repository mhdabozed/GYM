package gym;

public enum Card_type {
    normal(0),silver(0.1),gold(0.15);
   private double discount;

    Card_type(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
