class Parent {
    void show(){
    System.out.println("Parent's show()");
    }
    }
    class Child extends Parent {
    @Override
    void show(){
    System.out.println("Child's show()");
    }
    }
    class MethodOverrideDemo {
    public static void main(String[] args){
    Child obj1 = new Child();
    obj1.show();
    Child obj2 = new Child();
    obj2.show();
    }
    }