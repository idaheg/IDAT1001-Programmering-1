import java.util.Arrays;

public class Oppgaveoversikt {
    private Student[] studenter; // tabellen opprettes i konstruktøren
    private int antStud; // økes med 1 for hver ny student

    public Oppgaveoversikt() {
        this.studenter = new Student[3];
        this.antStud = 0;
    }

    public Student[] getStudenter() {
        return studenter;
    }

    public int antStudReg() {
        return antStud;
    }

    private void okAntStud() {
        antStud++;
    }

    public int finnStudIndex(String navn) {
        for (int i = 0; i < antStud; i++) {
            if (navn.equals(studenter[i].getNavn())) {
                return i;
            }
        }
        return -1;
    }

    public boolean navnTest(String navn) {
        for (int i = 0; i < antStud; i++) {
            if (navn.equals(studenter[i].getNavn())) {
                return true;
            }
        }
        return false;
    }

    public int antOppgLost(String navn) {
        if (finnStudIndex(navn) == -1) {
            return -1;
        }
        return studenter[finnStudIndex(navn)].getAntOppg();
    }

    public void regNyStud(String navn, int antOppg) {
        if (!navnTest(navn)) {
            if (antStud == studenter.length) {
                utvidTabell();
            }
            studenter[antStud] = new Student(navn, antOppg);
            okAntStud();
        } else {
            throw new IllegalArgumentException("Studenten er allerede registrert.");
        }

    }

    public void utvidTabell() {
        Student[] tabell = new Student[antStud + 5];
        for (int i = 0; i < studenter.length; i++) {
            tabell[i] = studenter[i];
        }
        studenter = tabell;
    }

    @Override
    public String toString() {
        return "Oppgaveoversikt{" +
                "studenter=" + Arrays.toString(studenter) +
                ", antStud=" + antStud +
                '}';
    }
}