import org.junit.Assert;

public class BankAccountTest {
    private BankAccount testAccount;
    private static final int TEST_DOLLAR_VALUE = 92;
    private static final int TEST_CENT_VALUE = 87;
    private static final String TEST_NAME = "Test";

    /**
     * Creates a new bank account for the purpose of testing
     */
    public BankAccountTest(){
        testAccount = new BankAccount(TEST_NAME,TEST_DOLLAR_VALUE,TEST_CENT_VALUE);
    }

    /**
     * Tests the new bank account's getDollars method by comparing it to input value
     */
    @org.junit.Test
    public void getDollars() {
        Assert.assertEquals(TEST_DOLLAR_VALUE,(int)this.testAccount.getDollars());
    }

    /**
     * Tests the new bank account's getCents method by comparing it to input value
     */
    @org.junit.Test
    public void getCents() {
        Assert.assertEquals(TEST_CENT_VALUE,(int)this.testAccount.getCents());
    }

    /**
     * Tests the new bank account's getAccountHolder method by comparing it to input value
     */
    @org.junit.Test
    public void getAccountHolder() {
        Assert.assertEquals(TEST_NAME,this.testAccount.getAccountHolder());
    }

    /**
     *  Tests the new bank account's ability to deposit money by comparing it to manually done math
     */
    @org.junit.Test
    public void accountDeposit() {
        this.testAccount.accountDeposit(TEST_DOLLAR_VALUE,TEST_CENT_VALUE);
        Assert.assertEquals(185,(int)this.testAccount.getDollars());
        Assert.assertEquals(74,(int)this.testAccount.getCents());
    }

    /**
     * Tests the new bank account's ability to withdrawal money by comparing it to manually done math
     */
    @org.junit.Test
    public void accountWithdrawal() {
        this.testAccount.accountWithdrawal(TEST_DOLLAR_VALUE,TEST_CENT_VALUE);
        Assert.assertEquals(0,(int)this.testAccount.getDollars());
        Assert.assertEquals(0,(int)this.testAccount.getCents());
    }
}