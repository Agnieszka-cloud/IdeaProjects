
public class instrukcjawarunkowaifelse {
    public static void main (String[] args){
        int points = 61;
        char grade = '0';
        //int grade = 0;
        if (points >= 60){
            grade = '5';
        /*} else if (points >= 50){
            grade = 4;*/
        }else if (points >= 40){
            grade = '3';
        }else if (points >= 30){
            grade = '2';
        /*}else {
            grade = 1;*/
        }
        System.out.println("Grade = " + grade);
    }
}
