public class exception1 {
    public static void main(String []args ){
        int a = 1, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez 0!");
        } catch (Exception e){
            System.out.println("Exception");
        }
    }
}
