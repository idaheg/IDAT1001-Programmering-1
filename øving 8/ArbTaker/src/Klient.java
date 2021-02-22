import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Klient {
    public static void main(String[] args) {
        Person a = new Person("Anne", "Andersen", 1966);
        Person b = new Person("Berit", "Bertilson", 1978);
        Person c = new Person("Cecilie", "Hansen", 1954);
        ArbTaker AA = new ArbTaker(a, 1, 2003, 37500, 32);
        ArbTaker BB = new ArbTaker(b, 2, 2011, 40000, 32);
        ArbTaker CH = new ArbTaker(c, 3, 1999, 53000, 32);


        System.out.println(AA.skattekrPerMnd());
        System.out.println(AA.bruttolonnPerAar());
        System.out.println(AA.skattetrekkPerAar());
        System.out.println(AA.finnNavn());
        System.out.println(AA.finnAlder());
        System.out.println(AA.finnAntAar());
        System.out.println(AA.finnGittAntAar(10));

        while (true) {
            String ansattLest = showInputDialog("Velg ansatt:\n1: " + a.getFornavn() + " " + a.getEtternavn() + "\n2: " + b.getFornavn() + " " + b.getEtternavn() + "\n3: " + c.getFornavn() + " " + c.getEtternavn());
            int ansatt = Integer.parseInt(ansattLest);

            String mndLonnLest = showInputDialog("Skriv inn den nye månedslønnen til den ansatte");
            double mndLonn = Double.parseDouble(mndLonnLest);
            String skatteprosentLest = showInputDialog("Skriv inn den nye skatteprosenten til den ansatte");
            double skatteprosent = Double.parseDouble(skatteprosentLest);

            switch (ansatt) {
                case 1:
                    AA.setMaanedslonn(mndLonn);
                    AA.setSkatteprosent(skatteprosent);
                    showMessageDialog(null, AA.toString());
                    break;
                case 2:
                    BB.setMaanedslonn(mndLonn);
                    BB.setSkatteprosent(skatteprosent);
                    showMessageDialog(null, BB.toString());
                    break;
                case 3:
                    CH.setMaanedslonn(mndLonn);
                    CH.setSkatteprosent(skatteprosent);
                    showMessageDialog(null, CH.toString());
                    break;
                default:
                    showMessageDialog(null, "Ikke et gyldig valg");
            }
        }
    }
}
