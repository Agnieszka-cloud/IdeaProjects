public class Guest {

    // definiujemy co gość będzie miał
    private String name;
    private String meal;
    private int phoneNumber;
    private boolean isVegan;

    // to są 4 pola klasy: name, meal, phoneNumber, isVegan


    // TWORZYMY KONSTRUKTOR ZA POMOCĄ GENERATE ALL PRAWY PRZYCISK MYSZY
    public Guest(String name, String meal, int phoneNumber, boolean isVegan) {
        this.name = name;
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.isVegan = isVegan;
    }

    // TWORZYMY GETTERY GENERATE GETER ALL
    public String getName() {

        return name;
    }

    public String getMeal() {

        return meal;
    }

    public int getPhoneNumber() {

        return phoneNumber;
    }

    public boolean isVegan() {

        return isVegan;
    }

    public void displayGuestInformation() {
        System.out.println("Name: " + name);
        System.out.println("Meal: " + meal);
        System.out.println("PhoneNumber: " + phoneNumber);
        System.out.println("Vegan: " + isVegan);
        //String isVeganString = isVegan ? "Yes":"No"; // prosty if else ( ... ? " " : " " )
        //System.out.println("Vegan? : " + isVeganString);
        String isVeganString = isVegan ? "Yes" : "No"; // pole typu booleen
        System.out.println("Weganin? " + isVeganString);
    }
}