package infnet.selenium;


public enum CustomerType {
    REGULAR(0.10),
    PREMIUM(0.15),
    UNKNOWN(0.0);

    private final double discountRate;

    CustomerType(double discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public static CustomerType fromCode(int code) {
        switch (code) {
            case 1:
                return REGULAR;
            case 2:
                return PREMIUM;
            default:
                return UNKNOWN;
        }
    }
}


