class A{
    static int count=0;
    void increment(){
        count = count +1;
    }
    void show(){
        System.out.println(count);
    }
}
class demostatic{
    public static void main(String args[]){
        A x=new A();
        x.increment();
        x.show();
        A y=new A();
        y.increment();
        y.show();
    }
}