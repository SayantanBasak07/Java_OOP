interface AREA{
    void find_area();
}
class Triangle implements AREA{
    double b,h;
    Triangle(double base,double height){
        b=base;
        h=height;
    }
    public void find_area(){
        double area;
        area=(b*h)/2;
        System.out.println("The area of the triangle is:"+area);
    }
}
class Rectangle implements AREA{
    double l,br;
    Rectangle(double length,double breadth){
        l=length;
        br=breadth;
    }
    public void find_area(){
        double area;
        area=l*br;
        System.out.println("The area of the rectangle is:"+area);
    }
}
public class Area_rec_tri{
    public static void main(String args[]){
        Triangle t=new Triangle(3,4);
        t.find_area();
        Rectangle r=new Rectangle(3,4);
        r.find_area();
    }
}
