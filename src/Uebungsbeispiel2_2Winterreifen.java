import org.w3c.dom.ls.LSOutput;

public class Uebungsbeispiel2_2Winterreifen {
    public static void main(String[] args) {
       boolean winterreifenPflicht = isWinterreifenPflicht(9, true);
       printResult(winterreifenPflicht);

       printResult(isWinterreifenPflicht(9, false));
       printResult(isWinterreifenPflicht(11, true));
       printResult(isWinterreifenPflicht(3, false));
       printResult(isWinterreifenPflicht(5, true));
       printResult(isWinterreifenPflicht(2, true));
       printResult(isWinterreifenPflicht(2, false));
        System.out.println(isWinterreifenPflicht(2, false));

    }
    public static boolean isWinterreifenPflicht(int temperatur, boolean rutschigeFahrbahn) {

        if(temperatur <10 && rutschigeFahrbahn)
            return true;
        else if(temperatur <4)
            return true;
        else
           return false;
    }
    public static void printResult(boolean winterreifenPflicht) {
    if(winterreifenPflicht) {
        System.out.println("Bitte Winterreifen verwenden.");
    } else {
        System.out.println("Winterreifen sind nicht erforderlich.");
    }
    }
}
