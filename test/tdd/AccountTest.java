package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void depositMoneyTest() {
        //given i have an account
        Account amirahTeensAccount = new Account();
        //when i deposit 3000
        amirahTeensAccount.deposit(3000);
        //check my balance increase 3000
        int balance = amirahTeensAccount.getbalance();


    }

    @Test
    public void negativeDepositShouldNotWorkTest() {

        Account amirahTeensAccount = new Account();
        amirahTeensAccount.deposit(10000);
        assertEquals(10000, amirahTeensAccount.getbalance());
        amirahTeensAccount.deposit(-5000);
    }

}

