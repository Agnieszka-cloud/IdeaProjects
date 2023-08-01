public class switchInstrukcjaWarunkowa {
    public static void main(String[] args){
        int dayOfWeek = 7;
        String dayOfWeekString = "";
        // który to dzień tygodnia, rozpoznaj po numerze int
        switch (dayOfWeek){
            case 1: dayOfWeekString = "Monday";
                break;
            case 2: dayOfWeekString = "Tuesday";
                break;
            case 3: dayOfWeekString = "Wednesday";
                break;
            case 4: dayOfWeekString = "Thursday";
                break;
            case 5: dayOfWeekString = "Fridays";
                break;
            case 6: dayOfWeekString = "Saturday";
                break;
            case 7: dayOfWeekString = "Sunday";
                break;
            default:dayOfWeekString = "Invalid";
                break;
        }
        System.out.println(dayOfWeekString);
    }
}
