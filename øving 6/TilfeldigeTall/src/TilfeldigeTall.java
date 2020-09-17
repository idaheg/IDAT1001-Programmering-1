import java.util.Random;
public class TilfeldigeTall {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        //array som oppbevarer antall treff på tallene
        int[] antall = new int[10];

        for(int i = 0; i < 1000; i++) {
            //plusser på en til i plassen på arrayet
            antall[random.nextInt(10)]++;
        }

        for(int i = 0; i < 10; i++) {
            System.out.print(i + ": " + antall[i] + "\n");
        }
    }
}
