import java.io.*;
public class loop5 {
      public static void main(String[] args) throws IOException{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            System.out.println("enter the number");
            int n=Integer.parseInt(br.readLine());
            for(int i=0;i<n;i++){
                  if(i%2!=0)
                  System.out.println(i);
            }
      }
}