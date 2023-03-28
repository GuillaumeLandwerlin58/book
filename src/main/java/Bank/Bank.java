package Bank;

public class Bank {
    private Account[] accounts;

    public Bank() {
        this.accounts = new Account[0];
    }


    public Account[] getAccounts() {
        return accounts;
    }


    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        Account[] newAccounts = new Account[this.accounts.length + 1];
        for (int i = 0; i < this.accounts.length; i++) {
            newAccounts[i] = this.accounts[i];
        }
        newAccounts[this.accounts.length] = account;
        this.accounts = newAccounts;
    }

    public void removeAccount(Account account) {
        Account[] newAccounts = new Account[this.accounts.length - 1];
        int j = 0;
        for (int i = 0; i < this.accounts.length; i++) {
            if (this.accounts[i] != account) {
                newAccounts[j] = this.accounts[i];
                j++;
            }
        }
        this.accounts = newAccounts;
    }

    public void showAccounts() {
        for (Account account : this.accounts) {
            System.out.println(account.getId() + " " + account.getSolde());
        }
    }

    public void transfer(Account account1, Account account2, double montant) {
        account1.retrait(montant);
        account2.depot(montant);
    }
}
