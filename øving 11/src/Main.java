public class Main {
    public static void main(String[] args) {
        /**
         * Alle de gitte eiendommene
         */
        LotRegister tomtreg = new LotRegister();

        tomtreg.addLot(new Lot(1445, "Gloppen", 77, 631,  1017.6, "Jens Olsen"));
        tomtreg.addLot(new Lot(1445, "Gloppen", 77, 131, "Syninom", 661.3, "Nicolay Madsen"));
        tomtreg.addLot(new Lot(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen"));
        tomtreg.addLot(new Lot(1445, "Gloppen", 74, 1800, 1457.2, "Karl Ove Bråten"));
        tomtreg.addLot(new Lot(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård"));

        Bgs brukergrens = new Bgs(tomtreg);

        brukergrens.start();
    }
}
