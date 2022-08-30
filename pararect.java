import java.util.Scanner;
public class pararect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,parameter;
        System.out.print("Enter the length of rectangle: ");
        x=sc.nextInt();
        System.out.print("Enter the width of rectangle: ");
        y=sc.nextInt();
        parameter=2*(x+y);
        System.out.println(parameter);

        
    }
    
}

