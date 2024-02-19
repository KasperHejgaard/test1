public class BilletAutomat {

    int pris;
    int saldo;
    int total;

    //Constructor
    public BilletAutomat(int billetPris) {
        saldo = 0;
        total = 0;
        pris = billetPris;
    }

    //metode
    public int getPris() {
        return pris;
    }

    //metode
    public int getSaldo() {
        return saldo;
    }

    //void fordi vi ikke vil have at den skal returnere noget
    public void indbetal(int kroner) {
        if (kroner > 0) {
            saldo += kroner;
        } else {
            System.out.println("Indbetalte beløb skal være over 0DKK.");
        }
    }

    //Laver if checks inde i koden, så den sikrer at vi ikke kan indbetale for lidt og stadig få en billet.
    public void printBillet() {
        if (saldo >= pris) {
            int positivDifference = saldo - pris;
            System.out.println("########################");
            System.out.println("### Linje F(antasi) ###");
            System.out.println("########################");
            System.out.println("## Billet: " + pris + " kr. ##");
            System.out.println();
            System.out.println("Du har indbetalt " + saldo + "DKK. Billetten koster " + pris +
                    "DKK, og du skal derfor have " + positivDifference + "DKK tilbage.");
            total += saldo;
            saldo = 0;
        } else {
            int difference = pris - saldo;
            System.out.println("Du skal indbetale " + difference + " kroner mere for at købe billetten.");
        }
    }

}
