import java.util.Scanner;  

public class areaofrect {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x,y,area;
        System.out.print("Enter the length of rectangle : ");
        x=sc.nextInt();
        System.out.print("Enter the width of rectangle : ");
        y=sc.nextInt();
        area=x*y;
        System.out.println(area);     
    }
}

