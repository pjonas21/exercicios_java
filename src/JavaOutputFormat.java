import java.util.Scanner;

public class JavaOutputFormat {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                String number_in = String.valueOf(x);
                
                Integer MAX_TEXT = 15;
                Integer MAX_NUMBER_LENGTH = 3;
                
                Integer number_len = number_in.length();
                Integer text_len = s1.length();
                                
                if ( number_len < MAX_NUMBER_LENGTH) {
                                        
                    if (number_len == 2) {
                        number_in = "0"+number_in;
                    }
                    if (number_len == 1) {
                        number_in = "00"+number_in;
                    }
                    
                }
                
                if ( text_len < MAX_TEXT) {
                    Integer dif = MAX_TEXT - text_len;
                    String espaco = "";
                    for (int j = 0; j < dif; j++) {
                        espaco+=" ";
                    }
                    s1+=espaco;
                }
                
                System.out.println(s1 + number_in);
            }
            System.out.println("================================");
            
            sc.close();

    }
}



