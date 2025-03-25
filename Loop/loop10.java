import java.io.*;
public class loop10 {
      public static void main(String[] args) throws IOException{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
            System.out.println("enter the number");
            int n=Integer.parseInt(br.readLine());
            int count=0;
            for(int i=1;i<n+1;i++){
                if(i%2!=0){count++;
            }
            }
            System.out.println(count);
      }
}
