import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoops1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if (N < 2 || N > 20) {
            System.out.println("N must between 2 and 20");
            N = Integer.parseInt(bufferedReader.readLine().trim());
        }

        bufferedReader.close();
        
        for (int i = 1; i <= 10; i++) {
            Integer result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }
    }
    
}
