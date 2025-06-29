package infnet.selenium;

public class App
{
    public static void main(String[] args) {
        Address address = new Address("Av. Presidente Vargas, 1000", "Rio de Janeiro", "20071-000");


        System.out.println("\nEndereço cadastrado:");
        System.out.println("Rua: " + address.getStreet());
        System.out.println("Cidade: " + address.getCity());
        System.out.println("CEP: " + address.getZipCode());

    }
}
