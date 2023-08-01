public class string {
    public static void main(String[] args ){
        String a = "Przemek";
        String b = new String("Przemek" + "Aga"+ "Ola");
        String c = "Przemek";
        String d = " Ala Ola Ela Iga Ana ";
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        String aLowerCase = a.toLowerCase();
        System.out.println(aLowerCase);
        System.out.println(a);
        char charAt = a.charAt(0);
        System.out.println(charAt);
        char[] array = b.toCharArray();
        char[] arraySingle = a.toCharArray();

        System.out.println(array);
        System.out.println(arraySingle);
        String concat = a.concat("xyz"); // dodaj
        System.out.println(concat);
        System.out.println(d);
        System.out.println(d.toCharArray());
        String trimed = d.trim();
        System.out.println(d.trim());
        System.out.println(trimed);
        System.out.println("da się? nie " + String.join("+",b));
        System.out.println("=============================================");
        System.out.println(String.join("",b));
        System.out.println(String.join("+", "Ola", "Ala"));
        System.out.println(String.join("--","Przemo","Ola","Ala"));

        // klasa Character zwraca boolean
        char ch = 'a';
        Character.isUpperCase(ch);
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isLetter(ch));
        System.out.println(Character.toUpperCase(ch));

    }
}
