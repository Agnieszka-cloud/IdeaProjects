public class exception3 {
    public static void main(String [] args){
        try{
            int num = Integer.parseInt("abc");

        }catch (NumberFormatException e){
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();

        }
    }
}
