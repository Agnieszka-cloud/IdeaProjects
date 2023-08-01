public class metodaVoidNieZwracaWywołaj {
    public static void main(String[] args){
        String name = "Agnieszka";
        //System.out.println(name);
        //sayHello(new String("Alexandra"));
        //System.out.println(method(name));
        sayHello(method(name));

    }
    static void sayHello(String str){

        System.out.println("Hello " + str);
    }
    static String method(String str){
        String surname = " Doberska";
        String statement = str + surname;
        //sayHello(statement);
        return statement;
    }
}
