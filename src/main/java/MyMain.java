import java.util.Scanner;

public class MyMain {

    public static int someMethod() {
        

        return -1;
    }

    public static void main(String[] args) {
        int a = (int) (11 * Math.random() + 10);
        int b = (int) (11 * Math.random() + 10);
        int c = (int) (11 * Math.random() + 10);
        int qwe = Math.max(a, Math.max(b,c));
        int ynk = Math.min(a, Math.min(b,c));
        String d = ""+a;
        String e = ""+b;
        String f = ""+c;
        String tou = ""+qwe;
        String jkl = ""+ynk;
        
        System.out.println("The three integers are: "+d+e+f);
        System.out.println("The largest integer is: "+tou);
        System.out.println("The smallest integer is: "+jkl);
    }

}


