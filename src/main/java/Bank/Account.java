package Bank;

public class Account {
    private String id;
    private double solde;
    private double interet;

    public Account(String id, double solde, double interet) {
        this.id = id;
        this.solde = solde;
        this.interet = interet;
    }

    public String getId() {
        return id;
    }

    public double getSolde() {
        return solde;
    }

    public double getInteret() {
        return interet;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setInteret(double interet) {
        this.interet = interet;
    }

    public void depot(double montant) {
        this.solde += montant;
    }

    public void retrait(double montant) {
        this.solde -= montant;
    }

    public void transfer(Account account, double montant) {
        this.retrait(montant);
        account.depot(montant);
    }

    public void calculInteret() {
        this.solde += this.solde * this.interet;
    }
}
