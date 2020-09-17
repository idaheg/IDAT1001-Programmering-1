import java.util.Random;

public class Terning {
    private int sumPoeng;
    private int antKast;
    private Random terning;

    public Terning(int sumPoeng, int antKast){
        this.sumPoeng = sumPoeng;
        this.antKast = antKast;
        this.terning = new Random();
    }

    public int getSumPoeng() {
        return sumPoeng;
    }
    public int getAntKast() {
        return antKast;
    }
    public int kastTerningen(){
        int terningkast = terning.nextInt(6)+1;
        sumPoeng += terningkast;
        antKast++;
        if (terningkast == 1) {
			sumPoeng = 0;
		}
		return sumPoeng;
    }
    public boolean erFerdig(){
        if (sumPoeng >= 100) {
            return true;
        } else {
            return false;
        }
    }
}
