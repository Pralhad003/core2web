import java.io.*;
class program7 {                                                                                                                                                                                                                                        public static void main(String[] args) throws IOException {

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int num=Integer.parseInt(br.readLine());
                if (num % 2 == 0 && num % 5 == 0 && num % 10==0) {
            System.out.println(num + " is divisible by 2, 5 and 10.");
        }
        else {
            System.out.println(num + " Is not Divisible by 2,5 and 10.");

               }                                                                                                               }
}
