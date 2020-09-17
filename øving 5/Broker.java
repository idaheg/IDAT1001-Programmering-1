public class Broker {
    private int teller;
    private int nevner;

    public Broker(int teller, int nevner) {
        this.teller = teller;
        this.nevner = nevner;
        if(nevner == 0){
            throw new ArithmeticException("Du har skrevet inn en ugyldig verdi");
        }
    }
    public Broker(int teller) {
        this.teller = teller;
        this.nevner = 1;
        
    }
    public getTeller() {
        return teller;
    }
    public getNevner() {
        return nevner;
    }
    public void sum(int inpTeller, int inpNevner) {
        this.teller = (this.teller*inpNevner)+(inpTeller*this.nevner);
        this.nevner = this.nevner*inpNevner;
    }
    public void sub(int inpTeller, int inpNevner) {
        this.teller = (this.teller*inpNevner)-(inpTeller*this.nevner);
        this.nevner = this.nevner*inpNevner;
    }
    public void multi(int inpTeller, int inpNevner) {
        this.teller = this.teller*inpTeller;
        this.nevner = this.nevner*inpNevner;
    }
    public void div(int inpTeller, int inpNevner) {
        this.teller = this.teller*inpNevner;
        this.nevner = this.nevner*inpTeller;
    }
    public String toString() {
        return this.teller + "/" + this.nevner;
    }
}
