public class Uebungsbeispiel1_3Zinsberechnung {
    public static void main(String[] args) {
        double kontostand = 1000;
        double zinsen = 2.25;
        double erhalteneZinsen = kontostand/ 100 * zinsen;
        System.out.println("Am Ende der Laufzeit sind " + erhalteneZinsen + "€ als Zinsen erwirtschaftet " +
                "worden.");

    }
}
