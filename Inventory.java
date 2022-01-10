import java.util.Scanner;
public class Inventory {
    public static void main (String[] args) {
        GuitarFactory guitarFactory = new GuitarFactory();
Guitars cust1 = guitarFactory.getInstance("Flamenco");
cust1.price();
Guitars cust2 = guitarFactory.getInstance("Classic");
cust2.price();
Guitars cust3 = guitarFactory.getInstance("SingleCut");
cust3.price();
Guitars cust4 = guitarFactory.getInstance("Stratocaster");
cust4.price();
chargeCustomer();
shipGuitar();
satisfied();

}

public static String chargeCustomer() {

    return "You have been charged and a bill will be sent shortly.";
}
public static String shipGuitar() {

    return "Your guitar is being shipped and will arrive within the next 7 days.";
}

public static void satisfied() {
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Please type in your name: ");

    String userName = myObj.nextLine(); 
    myObj = new Scanner(System.in); 
    System.out.println("Did your guitar arrive on time?");
    String earlyOrLate = myObj.nextLine(); 
    System.out.println("Did you find your guitar to be satisfactory?");
    String guitarQuality = myObj.nextLine(); 
    System.out.println("Thank you for taking the time to fill out this brief survey.");  

    
  }
myObj.close();
}
