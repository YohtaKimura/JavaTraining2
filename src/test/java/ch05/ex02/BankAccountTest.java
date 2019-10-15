package ch05.ex02;

import org.junit.Assert;
import org.junit.Test;

public class BankAccountTest {
    @Test
    public void bankAccountTest() throws Exception {
        final BankAccount b = new BankAccount(1);
        b.deposit(1000);
        b.withdraw(100);
        b.withdraw(100);

        Assert.assertEquals("1: withdraw 100", b.history().next().toString());
    }
}