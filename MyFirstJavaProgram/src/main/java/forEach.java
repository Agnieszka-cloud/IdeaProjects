public class forEach {
    public static void main (String[] args){
        String[] tab = {"hj","jiji","ii","jiji"};
        for (String single:tab) {
            System.out.print(single + ",");
        };
        System.out.println();
        System.out.println();
        String[] titles = new String[4];
        System.out.println(titles[1]);
        System.out.println();

        //System.out.println(titles);
        for (String title:titles
        ) {
            System.out.println("foreach: " + title);
        }

        String ciąg = "abcdefghijkl";
        for (int i = 0; i < ciąg.length(); i++) {
            System.out.print(ciąg.charAt(i));
        }
        for (String a:tab
        ) {
            System.out.println(a + ",");
        }
    }
}
