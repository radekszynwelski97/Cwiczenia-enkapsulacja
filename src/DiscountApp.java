public class DiscountApp { // aplikacja do obniżek
    public static void main(String[] args) {
        Client client1 = new Client("Jan" , "Kowalski" , true);
        double price = 1100; // kwota jaka klient bedzię miał do zapłaty w zł
        DiscountService discountService = new DiscountService();
        double discountPrice = discountService.calculateDiscountPrice(client1,price);


        System.out.println("Witaj" + " " + client1.getFirstName() + " " + client1.getLastName());
        System.out.println("Kwota przed rabatem to : " + price);
        System.out.println("Cena do zapłaty to : " + discountPrice);


        Client client2 = new Client("Karol" , "Nowak" , false);
        double price2 = 1100; // kwota jaka klient bedzię miał do zapłaty w zł
        double discountPrice2 = discountService.calculateDiscountPrice(client2,price2);

        System.out.println("Witaj" + " " + client2.getFirstName() + " " + client2.getLastName());
        System.out.println("Kwota przed rabatem to : " + price2);
        System.out.println("Cena do zapłaty to : " + discountPrice2);


    }}

