public class BankAccount {
    private String accountHolder;
    private Integer dollars;
    private Integer cents;

    /**
     * Bank account that stores the name of the account holder, dollars, and cents. Only accepts valid cent values between 0 and 100
     * @param accountHolder The name of the account holder stored as a string
     * @param dollars an integer value representing the amount of whole dollars in the account
     * @param cents an integer value representing the amount of cents in the account
     */
    public BankAccount(String accountHolder, Integer dollars, Integer cents){
        this.accountHolder = accountHolder;
        this.dollars = dollars;
        this.cents = cents;
        if(cents >= 100){
            System.err.println("Please enter a valid cent value between 0 and 99.");
            System.exit(0);
        }
    }

    /**
     *  Returns the value of whole dollars in the account
     * @return integer number of dollars in the account
     */
    public Integer getDollars(){
        return this.dollars;
    }

    /**
     * Returns the value of cents in the account
     * @return integer number of cents in the account
     */
    public Integer getCents(){
        return this.cents;
    }

    /**
     * Returns the name of the account holder
     * @return name of the account holder
     */
    public String getAccountHolder(){
        return this.accountHolder;
    }

    /**
     * Simulates the event of a deposit into the account
     * @param dollarsAdded integer value of whole dollars added
     * @param centsAdded integer value of cents added
     * @return a new bank account with holding the new amount of money after the deposit
     */
    public BankAccount accountDeposit(Integer dollarsAdded, Integer centsAdded){
        this.dollars += dollarsAdded;
        this.cents += centsAdded;
        if(this.cents >= 100){
            this.dollars++;
            this.cents -= 100;
        }
        return this;
    }

    /**
     * Simulates the event of a withdrawal from the account
     * @param dollarsRemoved integer value of whole dollars removed
     * @param centsRemoved integer value of cents removed
     * @return a new bank account with holding the new amount of money after the withdrawal
     */
    public BankAccount accountWithdrawal(Integer dollarsRemoved, Integer centsRemoved){
        this.dollars -= dollarsRemoved;
        this.cents -= centsRemoved;
        return this;
    }
}