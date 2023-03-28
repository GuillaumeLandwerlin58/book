package TestBank;

import Bank.Account;
import Bank.Bank;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAccount {
    @Test
    public void testBankAcccount(){
        Account account = new Account("1", 100, 0.1);
        assertEquals("1", account.getId());
        assertEquals(100, account.getSolde());
        assertEquals(0.1, account.getInteret());

        Account account2 = new Account("2", 200, 0.2);
        assertEquals("2", account2.getId());
        assertEquals(200, account2.getSolde());
        assertEquals(0.2, account2.getInteret());

        Bank bank = new Bank();
        bank.addAccount(account);
        bank.addAccount(account2);

        bank.transfer(account, account2, 50);
        assertEquals(50, account.getSolde());
        assertEquals(250, account2.getSolde());

        bank.removeAccount(account);
        assertEquals(1, bank.getAccounts().length);
        assertEquals("2", bank.getAccounts()[0].getId());
    }
}
