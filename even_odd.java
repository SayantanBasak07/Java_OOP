import java.util.Scanner;
public class even_odd{
    
    public static void main(String[] args){
        int x;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a nummber");
    x=s.nextInt();
    if(x%2==0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
}
}