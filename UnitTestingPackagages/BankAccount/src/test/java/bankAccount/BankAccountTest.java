package bankAccount;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class BankAccountTest {
    public BankAccount bankAccount;

    @Before
    public void setUp(){
        this.bankAccount = new BankAccount("John",new BigDecimal(78));
    }

    @Test
    public void testConstructor(){
        Assert.assertEquals("John",this.bankAccount.getName());
        Assert.assertEquals(new BigDecimal(78),this.bankAccount.getBalance());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNameIfLessThan3(){
        BankAccount testSet = new BankAccount("Jo", new BigDecimal(265));

    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNameIfMoreThan25(){
        BankAccount testSet2 = new BankAccount("Because of the fact, that the Module is not particular", new BigDecimal(265));
    }



    @Test(expected = IllegalArgumentException.class)
    public void testSetBalanceIfNegative(){
        BankAccount testSet2 = new BankAccount("Because", new BigDecimal(-265));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDepositIfNegative(){
        this.bankAccount.deposit(new BigDecimal(-25));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDepositIfZero(){
        this.bankAccount.deposit(new BigDecimal(0));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testWithdrawIfNegative(){

        this.bankAccount.withdraw(new BigDecimal(-25));
    }


    @Test(expected = UnsupportedOperationException.class)
    public void testWithdrawIfMoreThanBalance(){
        this.bankAccount.withdraw(new BigDecimal(100));

    }

    @Test
    public void testGetName(){
        Assert.assertEquals("John",this.bankAccount.getName());
    }

    @Test
    public void testGetBalance(){
        Assert.assertEquals(BigDecimal.valueOf(78),this.bankAccount.getBalance());
    }

    @Test
    public void testDepositWithPositiveAmount(){
        this.bankAccount.deposit(BigDecimal.valueOf(22));
        Assert.assertEquals(BigDecimal.valueOf(100),this.bankAccount.getBalance());
    }

    @Test
    public void testWithdrawOfPositiveAmount(){
        this.bankAccount.withdraw(new BigDecimal(18));
        Assert.assertEquals(new BigDecimal(60),this.bankAccount.getBalance());
    }
}