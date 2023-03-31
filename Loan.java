interface PersonalLoan{
    double findsimpleinterest(float principle,int year);
}
class bank1 implements PersonalLoan{
    static double interest_rate=0.1;
    public double findsimpleinterest(float principle,int year){
        double amount;
        amount=((principle*year*interest_rate)/100) + principle;
        return amount;
    }
}
class bank2 implements PersonalLoan{
    static double interest_rate=0.15;
    public double findsimpleinterest(float principle,int year){
        double amount;
        amount=((principle*year*interest_rate)/100) + principle;
        return amount;
    }
}
public class Loan{
    public static void main(String args[]){
        bank1 obj1=new bank1();
        bank2 obj2=new bank2();
        System.out.println("Amount from bank 1:");
        System.out.println(obj1.findsimpleinterest(1000,1));
        System.out.println("Amount from bank 2:");
        System.out.println(obj2.findsimpleinterest(1000,1));
    }
}