import java.util.*;

public class AreaCircle {
    double pi =3.14;
    public static void main(String[] args) {
        AreaofCircle();
    }
    public static void AreaofCircle(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Tell me the radius");
        int radius =sc.nextInt();
        double Area =3.14* (radius * radius);
        System.out.println("Area of circle "+ Area);
    }
}
