import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Oppgaveoversikt oversikt = new Oppgaveoversikt();
        oversikt.regNyStud("Vilde Gylterund", 4);
        oversikt.regNyStud("Helena Gylterund", 4);
        oversikt.regNyStud("Henrik Gylterund", 4);
        System.out.println(oversikt.finnStudIndex("Vilde Gylterund"));
        oversikt.regNyStud("Ida Green Heglund", 2);
        //oversikt.regNyStud("Ida Green Heglund", 2);
        System.out.println(oversikt.antOppgLost("Vilde Gylterund"));
        System.out.println(oversikt.toString());
    }
}
