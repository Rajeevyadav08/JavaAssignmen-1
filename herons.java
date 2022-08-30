import java.util.Scanner;
import java.lang.Math;
public class herons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,s,area;
        System.out.print("Enter the value of a: ");
        a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        b=sc.nextInt();
        System.out.print("Enter the value of c: ");
        c=sc.nextInt();
        s=(a+b+c)/2;
        area=Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
        System.out.println(area);

    }
    
}
