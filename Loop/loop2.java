import java.io.*;
public class loop2 {
      public static void main(String[] args) throws IOException{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            System.out.println("enter the number");
            int n=Integer.parseInt(br.readLine());
            for(int i=0;i<=n;i++){
                  System.out.println(i);
            }
      }
}
