import java.io.*;
public class loop8 {
      public static void main(String[] args) throws IOException{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            System.out.println("enter the number");
            int n=Integer.parseInt(br.readLine());
            for(int i=10;i>=1;i--){
                  System.out.println(i*n);
            }
      }
}