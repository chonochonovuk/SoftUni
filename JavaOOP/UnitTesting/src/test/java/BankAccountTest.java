import org.junit.Assert;
import org.junit.Test;


public class BankAccountTest {

    @Test
    public void testSumOf(){

        //GIVEN (ARRANGE)
        BankAccount bankAccount = new BankAccount();


        // WHEN/THEN (ACT/ASSERT)
        Assert.assertEquals(11,bankAccount.sumOf(6,5));
    }

    @Test(expected = NullPointerException.class)
    public void testNPE() {
        //GIVEN (ARRANGE)
        BankAccount bankAccount = new BankAccount();

        // WHEN (ACT)

        bankAccount.throwNPE();

        // THEN (ASSERT) NPE is thrown


    }
}