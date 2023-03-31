class SavingsAccount{
    static double rate=0.05;
    double savingsbalance;
    int accountnumber;
    SavingsAccount(){
        savingsbalance=50000;
        accountnumber=1234;
    }
    void calculateMonthlyInterest(){
        double MonthlyInterest;
        MonthlyInterest=(savingsbalance*rate)/12;
        savingsbalance=savingsbalance+MonthlyInterest;
        System.out.println("Savings ="+savingsbalance);
        System.out.println( "Account number " +accountnumber);
    }
    static void modifyInterestRate(){
        rate=0.06;
    }
}
public class saving{
    public static void main(String args[]){
        SavingsAccount x=new SavingsAccount();
        x.calculateMonthlyInterest();
        SavingsAccount y=new SavingsAccount();
       // y.modifyInterestRate();
     y.calculateMonthlyInterest();
        SavingsAccount.modifyInterestRate();
        y.calculateMonthlyInterest();
    }
}