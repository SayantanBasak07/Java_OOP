class even_odd{
    int x;
    void test(int a){
        x=a;
    
    //void test1(){
        if(x%2==0){
            System.out.println("even");
        }
        else{
                System.out.println("odd");
        }
    //}
}
}
public class test{
    public static void main(String[] args){
        even_odd obj1=new even_odd();
        obj1.test(4);
    }
}
