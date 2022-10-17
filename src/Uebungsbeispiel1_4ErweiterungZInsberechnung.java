public class Uebungsbeispiel1_4ErweiterungZInsberechnung {
    public static void main(String[] args) {
            double kontostand = 1000;
            double zinsen = 2.25;

        System.out.println(erhalteneZinsen(500, 2.25));
        System.out.println(erhalteneZinsen(2000, 2.25));

    }
    public static double erhalteneZinsen(double kontostand, double zinsen) {
        return kontostand * zinsen / 100;
    }


}

