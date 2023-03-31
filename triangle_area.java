class Triangle{
    float base,height;
    void find_area(){
        float area=0.5f*base*height;
        System.out.println("the area is"+area);
    }
}
class Demo{
    public static void main(String x[]){
        Triangle t=new Triangle();
        t.base=Float.parseFloat(x[0]);
        t.height=Float.parseFloat(x[1]);
        t.find_area();
    }
}