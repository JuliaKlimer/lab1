import java.util.Scanner;

public class mainn {
    public static void main (String [] args){
        square s1 = new square();//default square
        System.out.println("Perimetre: " + s1.perimetre());
        System.out.println("Area: " + s1.area());
        System.out.println("Radius of the circumscribed circle: " + s1.circimscribedradius());
        System.out.println("Radius of the inscribed circle: " + s1.inscribedcircleradius());
        System.out.println("Diagonal: " + s1.calculatediagonal());
        Scanner in = new Scanner(System.in);//console input
        System.out.println("Input n: ");
        int n = in.nextInt();
        System.out.println("Input m: ");
        int m = in.nextInt();
        System.out.println("Input k: ");
        int k = in.nextInt();
        square s2 = new square(n, m, k);//square with inputs
        System.out.println("Area: " + s2.area());
        System.out.println("Perimetre: " + s2.perimetre());
        System.out.println("Radius of the circumscribed circle: " + s2.circimscribedradius());
        System.out.println("Radius of the inscribed circle: " + s2.inscribedcircleradius());
        System.out.println("Diagonal: " + s2.calculatediagonal());
    }
}
