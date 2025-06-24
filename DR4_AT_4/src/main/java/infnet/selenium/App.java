package infnet.selenium;

public class App 
{
        public static void main(String[] args) {
            Address address = new Address("Av. Paulista, 1000", "São Paulo", "01310-100");

            System.out.println("Endereço cadastrado:");
            System.out.println("Rua: " + address.getStreet());
            System.out.println("Cidade: " + address.getCity());
            System.out.println("CEP: " + address.getZipCode());

            address.setStreet("Rua Augusta, 1500");
            address.setCity("São Paulo");
            address.setZipCode("01305-100");

            System.out.println("\nEndereço atualizado:");
            System.out.println("Rua: " + address.getStreet());
            System.out.println("Cidade: " + address.getCity());
            System.out.println("CEP: " + address.getZipCode());
        }
    }

