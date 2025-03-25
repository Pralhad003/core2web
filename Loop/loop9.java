import java.io.*;
public class loop9 {
      public static void main(String[] args) throws IOException{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            System.out.println("enter the number");
            int n=Integer.parseInt(br.readLine());
            int sum=0;
            for(int i=1;i<n+1;i++){
                  sum=sum+i;
            }
            System.out.println(sum);
      }
}