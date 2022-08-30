import java.util.Scanner;
public class volcyl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r,h,volume;
        System.out.print("Enter the radius of cylinder: ");
        r=sc.nextInt();
        System.out.print("Enter the height of cylinder: ");
        h=sc.nextInt();
        volume=3.14*r*r*h;
        System.out.print(volume);
    }
    
}
