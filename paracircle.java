import java.util.Scanner;
public class paracircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x,parameter;
        System.out.print("Enter the radius of circle: ");
        x=sc.nextInt();
        parameter=2*(3.14)*x;
        System.out.println(parameter);

    }
    
}
