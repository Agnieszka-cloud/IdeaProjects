public class metodyStaticWywoływanie {
    public static void main(String[] args){
        method1();
        int variable = method3();
        System.out.println(variable);
    }
    static void method1(){
        System.out.println("Metoda nic " + "nie zwraca");
    }
    static String method2(){
        method1();
        return  "Coderslab";
    }
    static int method3(){
        return 123;
    }
    public static void method4(){
        System.out.println("Metoda void nic nie zwraca");
    }
}