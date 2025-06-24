package infnet.selenium;

public class PriceCalculator {

    public double calculatePrice(double basePrice, CustomerType customerType, boolean isHoliday) {
        double customerDiscount = customerType.getDiscountRate();
        double holidayBonus = isHoliday ? 0.05 : 0.0;
        double totalDiscount = customerDiscount + holidayBonus;

        return basePrice * (1 - totalDiscount);
    }
}
