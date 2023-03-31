class A{
    int x;
    static int y;
    static void f1(){
        y=5;
    }
}
    class staticmethod{
    public static void main(String args[]){
        f1(); 
        System.out.println(y);
        A p=new A();
        p.x=10;
    }
}