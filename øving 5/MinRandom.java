import java.util.Random;
import java.util.Scanner;
public class MinRandom{
	private Random rand;

	public MinRandom() {
		this.rand = new Random();
	}
	public int nesteHeltall(int nedre, int ovre){
		return rand.nextInt(ovre-nedre+1)+nedre;
	}
	public double nesteDesimaltall(double nedre, double ovre){
		return rand.nextDouble()*(ovre-nedre)+nedre;
	}
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		MinRandom i = new MinRandom();
		boolean fortsett = true;
		
		while(fortsett){
			System.out.println("Velg:\n1: helttall\n2: desimaltall\n3: avslutt");
			int valg = in.nextInt();
			switch(valg) {
				case 1:
					System.out.println("Skriv inn nedre grense");
					int nGrense = in.nextInt();
					System.out.println("Skriv inn øvre grense");
					int oGrense = in.nextInt();
					System.out.println("Her er ditt heltall "+ i.nesteHeltall(nGrense, oGrense));
					break;
				case 2:
					System.out.println("Skriv inn nedre grense");
					double dnGrense = in.nextDouble();
					System.out.println("Skriv inn øvre grense");
					double doGrense = in.nextDouble();
					System.out.println("Her er ditt desimaltall "+ i.nesteDesimaltall(dnGrense, doGrense));
					break;
				case 3:
					fortsett = false;
				default:
					System.out.println("Ikke et gyldig valg");
			}
		}
	}
}