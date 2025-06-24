package infnet.selenium;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
                PriceCalculator calculator = new PriceCalculator();

                double basePrice = 100.0;
                int customerCode = 1;
                boolean isHoliday = true;

                CustomerType customerType = CustomerType.fromCode(customerCode);

                double finalPrice = calculator.calculatePrice(basePrice, customerType, isHoliday);

                System.out.println("Customer: " + customerType.name());
                System.out.println("Description: " + customerType.getDiscountRate() * 100 + "% discount");
                System.out.printf("Final price: R$ %.2f%n", finalPrice);
            }
        }


