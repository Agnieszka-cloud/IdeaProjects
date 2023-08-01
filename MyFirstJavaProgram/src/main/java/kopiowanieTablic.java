import java.util.Arrays;

public class kopiowanieTablic {
    public static void main(String[] args){
        System.out.println("========================");
        String[] tab = {"Alicja w krainie czarów","Piotruś Pan"};
        System.out.println(tab); // tak sie nie da!!!!
        System.out.println(Arrays.toString(tab));
        System.out.println("========================================");

        String[] copyTab = tab;

        System.out.println(copyTab[0]);
        System.out.println(copyTab[1]);
        tab[1] = "Kubuś Puchatek";
        System.out.println(copyTab[1]);
        System.out.println(Arrays.toString(tab));
        System.out.println(Arrays.toString(copyTab));

        String [] copyTabPowiększenie = new String[tab.length * 3];
        copyTabPowiększenie[2] = "Kubuś Puchatek";
        copyTabPowiększenie[0] = "Alicja w krainie czarów";
        copyTabPowiększenie[1] = "Piotruś Pan";
        System.out.println(Arrays.toString(copyTabPowiększenie));

        System.out.println("========================================");

        int[] iTab = {1,2,3,4,5};
        int[] copyITab  = new int[iTab.length * 2];
        System.out.println("Arrays.toString: " + Arrays.toString(copyITab));

        for (int i = 0; i < iTab.length; i++) {
            copyITab[i] = iTab[i];
            System.out.println(copyITab[i]);
        }
        System.out.println("===================================");
        copyITab[5]= 5;
        copyITab[6]= 4;
        copyITab[7]= 3;
        copyITab[8]= 2;
        copyITab[9]= 1;

        System.out.println(copyITab.length);
        System.out.println("===================================");
        for (int single:copyITab
        ) {
            System.out.print(single);
        }
        System.out.println();
        System.out.println("===================================");

        int[] cloneiTab = iTab.clone();
        System.out.println("iTab.clone(); :" + Arrays.toString(cloneiTab));

        int[] copyiTab = Arrays.copyOf(copyITab,iTab.length*2);
        System.out.println("===================================");
        System.out.println("Arrays.copyOf: " + Arrays.toString(copyiTab));
        System.out.println("=====================================================");
        String[] a = {"ala","ana","aga"};
        String[] copya = Arrays.copyOf(a,8);
        System.out.println("Arrays.toString: " + Arrays.toString(copya));
        System.out.println("=====================================================");

    }
}
