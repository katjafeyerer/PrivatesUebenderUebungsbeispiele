public class Uebungsbeispiel2_1Notenermittlung {
    public static void main(String[] args) {
        int punkte = 71;
        System.out.println(getNotentext(punkte));

        punkte = 92;
        System.out.println(getNotentext(punkte));

        punkte = 78;
        System.out.println(getNotentext(punkte));
    }

    public static String getNotentext(int punkte) {
        String notenText;

        if (punkte >= 90)
            notenText = "Sehr Gut";
        else if (punkte >= 78 && punkte <= 89)
            notenText = "Gut";
        else if (punkte >= 65 && punkte <= 77)
            notenText = "Befriedigend";
        else if (punkte >= 51 && punkte <= 64)
            notenText = "Genügend";
        else
            notenText = "Nicht Genügend";

        return notenText;
    }

}
