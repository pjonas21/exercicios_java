import java.util.Scanner;

public class JavaLoops2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        for(int i=0; i<q; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();

            for(int j=0; j<n; j++){
                a+=Math.pow(2,j)*b;
                System.out.print(a+ " ");
            }
            System.out.println();
        }

        scan.close();
    }
    
}
