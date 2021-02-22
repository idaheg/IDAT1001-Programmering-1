public class Student {
    private final String navn;
    private int antOppg;

    public Student(String navn, int antOppg) {
        this.navn = navn;
        this.antOppg = antOppg;
    }

    public String getNavn() {
        return navn;
    }
    public int getAntOppg() {
        return antOppg;
    }
    public void okAntOppg(int okning) {
        antOppg += okning;
    }
    //returnerer true hvis navnet allerede eksisterer i tabellen
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(!(o instanceof Student)){
            return false;
        }

        Student nyStudent = (Student)o;

        if(navn.equals(nyStudent.getNavn())){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Navn = " + navn + "\n" +
                "Antall oppgaver = " + antOppg;
    }
}
