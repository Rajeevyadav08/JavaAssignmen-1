import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,area;
        System.out.print("Enter the radius of circle: ");
        r=sc.nextInt();
        area=(3.14)*r*r;
        System.out.print(area);
    }
    
}
