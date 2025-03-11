import java.io.*;
class program3 {

        public static void main(String[] args) throws IOException {

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int n=Integer.parseInt(br.readLine());
                if(n>10){
                   System.out.println(n+" is greater than 10");
                }
                else if(n==10){
                System.out.println(n+" is equal to 10");
                }
                else {
                System.out.println(n+" is less than 10");
                }
        }
}    
