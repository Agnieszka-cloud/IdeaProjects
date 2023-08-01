public class metodaReturnZwracaTyp {
    public static void main (String[] args){
        int c = 3;
        int d = 8;
        System.out.println(calculation(c,d));
        System.out.println(calculation(2,4));
        System.out.println(method1());
        System.out.println(method2());
        method3();
        int resultSum = calculation(c,d);
        System.out.println(resultSum);
    }
    static int calculation (int a,int b){
        //int sume;
        int sume = 0;
        sume = a + b;
        return sume;
    }
    static int method1 (){
        return 123;
    }
    static String method2(){
        return "abc";
    }
    static void method3(){
        System.out.println("Nic nie zwraca");
    }
}