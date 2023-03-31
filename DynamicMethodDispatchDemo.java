class A{
    void msg(){
    System.out.println("Inside A’s msg method");
    }
    }
    class B extends A{
    void msg(){
    System.out.println("Inside B’s msg method");
    }
    }
    class C extends A{
    void msg(){
    System.out.println("Inside C’s msg method");
    }
    }
    class DynamicMethodDispatchDemo {
    public static void main(String args[]){
    A a = new A();
    B b = new B();
    C c = new C();
    A ref;
    ref = a;
    ref.msg();
    ref = b;
    ref.msg();
    ref = c;
    ref.msg();
    a.msg();
    b.msg();
    c.msg();
    }
    }
    