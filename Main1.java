abstract class x{
    void f1(){
        System.out.println("A");
    }
    void f2(){
        System.out.println("B");
    }
}
class y extends x{
    void f1(){
        super.f1();
        System.out.println("C");
    }
    void f2(){
        super.f2();
        System.out.println("D");
    }
}
public class Main1{
    public static void main(String[] args){
        x r;
        y y1=new y();
        r=y1;
        r.f1();
        r.f2();
    }
}