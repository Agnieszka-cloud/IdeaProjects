import java.util.*;

public class Impreza {


     private ArrayList<Gosc> guests = new ArrayList<>();

     private Set<String> meals = new HashSet();

     private Map <Integer,Gosc> guestByPhoneNumber = new HashMap();

     Scanner scanner = new Scanner(System.in);

     public void addGuest() {
          System.out.println("Give guest name");

          String name = scanner.nextLine();
          //guests.add(name);

          System.out.println("Give prefered meal");
          String meal = scanner.nextLine();
          //guests.add(meal);

          System.out.println("Give guest's phone number");
          int phoneNumber = Integer.valueOf(scanner.nextLine());

          System.out.println("Is Vegan? Y/N");
          String isVeganString = scanner.nextLine();

          boolean isVegan = isVeganString.equals("Y");
          Gosc gosc = new Gosc( name, meal, phoneNumber, isVegan);
          guests.add(gosc);
          meals.add(meal);
          guestByPhoneNumber.put(phoneNumber, gosc);
     }

     public void displayGuest(){
          for (Gosc gosc:guests
               ) {
               //System.out.println(gosc);
               gosc.displayInformationAboutGuest();
          }
     }

     public void displayMeals(){
          for (String meal:meals
               ) {
               System.out.println(meal);
          }
     }
     public void displayGuestByPhoneNumber(){
          System.out.println("Give phone number");
          Integer phoneNumber = Integer.valueOf(scanner.nextLine());
          Gosc gosc = guestByPhoneNumber.get(phoneNumber);
          gosc.displayInformationAboutGuest();

          }
}
