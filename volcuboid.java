import java.util.Scanner;
public class volcuboid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l,b,h,volume;
        System.out.print("Enter the value of length: ");
        l=sc.nextInt();
        System.out.print("Enter the value of width: ");
        b=sc.nextInt();
        System.out.print("Enter the value of height: ");
        h=sc.nextInt();
        volume=l*b*h;
        System.out.print(volume);
    }
    
}
