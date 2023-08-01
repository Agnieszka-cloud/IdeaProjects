import java.util.Locale;

public class NapisyKlasaString {
        public static void main(String[] args) {
            String zmiennaTypuStringOWartościCiąguZnaków = "ale ma kota ";
            System.out.println(zmiennaTypuStringOWartościCiąguZnaków);
            String kolejnaZmiennaTypuString = "Ala ma kota";
            System.out.println(kolejnaZmiennaTypuString);
            System.out.println(zmiennaTypuStringOWartościCiąguZnaków + kolejnaZmiennaTypuString);
            String polaczoneStringi1i2 = zmiennaTypuStringOWartościCiąguZnaków + kolejnaZmiennaTypuString;
            System.out.println("nadal mozna wpisywac w ten sposob tekst " +
                    "ale rowniez za pomoca zmiennych typu String " + polaczoneStringi1i2);

            // jakiej długości jest string czyli ciąg znaków?

            String ZmiennaBędącaCiągiemZnaków = "tu (czyli ta zmienna okresla) jest okreslana zawartość stringa";
            System.out.println(ZmiennaBędącaCiągiemZnaków);

            ZmiennaBędącaCiągiemZnaków.length(); //metoda: lenght informująca jakiej długości jest string obliczone za
            // pomoca metody length
            System.out.println(ZmiennaBędącaCiągiemZnaków.length());

            // metoda: isEmpty sprawdza czy string jest pusty czy nie boolean true faulse
            ZmiennaBędącaCiągiemZnaków.isEmpty();
            System.out.println(ZmiennaBędącaCiągiemZnaków.isEmpty());

            // jaki znak znajduje sie na danym indeksie? metoda: charAt informuje o tym i zwraca char'a czyli pojedynczy znak

            ZmiennaBędącaCiągiemZnaków.charAt(7); // czytaj znajdz mi charat na 7 indeksie w stringu o nazwie zmiennaBę...
            char pojedynczyZnakNaIndexie = ZmiennaBędącaCiągiemZnaków.charAt(zmiennaTypuStringOWartościCiąguZnaków.length() - 1);
            // jesli szukamy jednego indeksu to musimy
            // dla niego utworzyć nową zmienną i ją wpisać do sout czyli wyświetl
            System.out.println(pojedynczyZnakNaIndexie);
            // wyświetl ostatni index w ciągu znaków
            System.out.println(pojedynczyZnakNaIndexie - 1);




            ZmiennaBędącaCiągiemZnaków.substring(28); // metoda wydzielajaca fragment tekstu
            System.out.println(ZmiennaBędącaCiągiemZnaków.substring(30));
                    // wycinanie tekstu od okreslonego miejsca/ ucinasz w jego miejscu a nie po nim/ liczysz indexy od 0
            String wycinekTekstuOdDo = ZmiennaBędącaCiągiemZnaków.substring(3, 29);// String wycinek Tekstuoddo reprezentuje zmienną
            // bedaca wynikiem metody substring

            System.out.println(ZmiennaBędącaCiągiemZnaków.substring(3, 29));
            System.out.println(wycinekTekstuOdDo);

            String nowyCiągZnaków = "   jojojoj   HHHHHH  joo ";
            // metoda trim: jak pozbyć się spacji na obu brzegach stringa
            System.out.println(nowyCiągZnaków);
            nowyCiągZnaków.trim(); // metoda trim zastosowana dla stringa o nazwie nowyCiągZnaków
            System.out.println(nowyCiągZnaków.trim());

            nowyCiągZnaków.toLowerCase(); //metoda zamieniająca wielkie litery na małe

            System.out.println(nowyCiągZnaków.toLowerCase());

            System.out.println(nowyCiągZnaków.toUpperCase());

            // startsWith: metoda która sprawdza czy dany tekst jest zawarty na początku w podanym stringu
            System.out.println(nowyCiągZnaków.startsWith("   jo"));

            ZmiennaBędącaCiągiemZnaków.endsWith("");
            ZmiennaBędącaCiągiemZnaków.isEmpty();

            System.out.println(nowyCiągZnaków.endsWith("joo "));

            System.out.println(nowyCiągZnaków.trim().toLowerCase().startsWith("joj"));

            nowyCiągZnaków.contains("");
            ZmiennaBędącaCiągiemZnaków.contains("");
            System.out.println(nowyCiągZnaków.contains("HHHH"));
            System.out.println(nowyCiągZnaków.contains(" jojo"));

            System.out.println(nowyCiągZnaków.replace('j', 't' ));

            // tworzenie stringów literał (w tm samym miejscu w pamięci jeśli o tej samej treści)
            // i za pomocą new to wtedy w oddzielnych miejscach w pamięci pomimo tej samej treści

            String kolejnaZmienna = " cos tam cos tam";
            String kolejnaZmienna1 = " cos tam cos tam";
            String iKolejnaZmienna = new String("bla bla bla bla");
            String iKolejnaZmienna1 = new String("bla bla bla bla");

            // porównywanie equal dla Stringów, nie używać ==
            boolean result = kolejnaZmienna == kolejnaZmienna1;
            System.out.println(result);
            boolean result2 = iKolejnaZmienna == iKolejnaZmienna1;
            System.out.println(result2);

            // equals
            boolean resultOfComperisonEquals;

            resultOfComperisonEquals = iKolejnaZmienna.equals(iKolejnaZmienna1);
            System.out.println(resultOfComperisonEquals);

        }
}

