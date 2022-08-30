import java.util.Scanner;
import java.lang.Math;
public class volcube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,volume;
        System.out.println("Enter the side of cube: ");
        x=sc.nextInt();
        //volume=Math.pow((x),3);
        volume=x*x*x;
        System.out.print(volume);

    }
    
}
