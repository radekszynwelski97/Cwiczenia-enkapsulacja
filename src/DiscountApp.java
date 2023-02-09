public class DiscountApp { // aplikacja do obniżek
    public static void main(String[] args) {
        Client client1 = new Client(null, "null", true);
        double price1 = 1100 ;
        Client client2 = new Client("Karol" , "Waka" , false);
        double price2 = 1500;

        DiscountService discountService = new DiscountService();
        double discountPrice1 = discountService.calculateDiscountPrice(client1 , price1);
        double discountPrice2 = discountService.calculateDiscountPrice(client2 , price2);
        ClientService clientService = new ClientService();
        clientService.printSummary(client1 , price1 , discountPrice1);
        clientService.printSummary(client2 , price2 , discountPrice2);




    }}

