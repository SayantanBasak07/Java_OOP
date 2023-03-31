class shape{
    int dim1;
    int dim2;
    shape(){
        dim1=3;
        dim2=4;
    }
}
class rectangle extends shape{
    double findarea(){
        double area=dim1*dim2;
        return area;
    }
}
class triangle extends shape{
    double findarea(){
        double area=0.5*dim1*dim2;
        return area;
    }
}
public class shapes{
    public static void main(String args[]){
        rectangle x=new rectangle();
        System.out.println("the area of the rectangle "+x.findarea());
        triangle y=new triangle();
        System.out.println("the area of the triangle "+y.findarea());
    }
}