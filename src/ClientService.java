public class ClientService {

    public void printSummary(Client client , double originalPrice , double discountPrice ) {
        printWelcomemassage(client);
        printPrices(originalPrice, discountPrice);



    }

    public void printWelcomemassage(Client client){
        String firstName = client.getFirstName();
        String lastName = client.getLastName();

        if (firstName != null && lastName == null)
            System.out.println("Witaj" + firstName);
        else if (firstName != null && lastName != null)
            System.out.println("Witaj" + " " + firstName + " " + lastName ) ;
        else if (firstName == null && lastName != null)
            System.out.println("Dzień dobry Panie " + lastName);
        else if ( firstName != null || lastName == null)
            System.out.println("Witamy prezesie" );
        else if (firstName == null && lastName == null)
            System.out.println("Witaj matole");

         else
            System.out.println("Witaj nieznajomy");


        }

        public  void printPrices(double originalPrice , double discountPrice){
            System.out.println("Oryginalna cena to :"+ " " + originalPrice);
            System.out.println("Cena po rabacie to :" + " " + discountPrice);
    }




    }



