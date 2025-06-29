package infnet.selenium;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
        Invoice nota1 = new Invoice("Alice", "alice@email.com", 200.0, InvoiceType.SIMPLE);
        nota1.process();

        System.out.println();

        Invoice nota2 = new Invoice("Daniel", "daniel@email.com", 350.0, InvoiceType.TAXED);
        nota2.process();

        System.out.println();

        Invoice nota3 = new Invoice("Raquel", "email_invalido", 150.0, InvoiceType.UNKNOWN);
        nota3.process();
            }
        }
