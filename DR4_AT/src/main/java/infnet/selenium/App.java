package infnet.selenium;

/**
 * Hello world!
 *
 */
public class App 
{
            public static void main(String[] args) {
                NumberClassifier classifier = new NumberClassifier();

                System.out.println("Testando valor ALTO (15):");
                classifier.classifyAndPrint(15);

                System.out.println("\nTestando valor MÉDIO (10):");
                classifier.classifyAndPrint(10);

                System.out.println("\nTestando valor BAIXO (5):");
                classifier.classifyAndPrint(5);

                System.out.println("\nTestando CASO RARO (-9999):");
                classifier.classifyAndPrint(-9999);
            }
        }


