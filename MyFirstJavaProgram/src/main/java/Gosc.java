public class Gosc {

    // stwórz pola klasy gość

    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;

    public Gosc(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    public void displayInformationAboutGuest (){
        System.out.println("name: " + name);
        System.out.println("meal: " + meal);
        System.out.println("phone number: " + phoneNumber);
        System.out.println("Vegan ? : " + (isVegan ? "Y" : "N"));

    }
}
