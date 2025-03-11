import java.io.*;
class program4 {

        public static void main(String[] args) throws IOException {

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                char n=br.readLine().charAt(0);
                if(n=='a'){
                   System.out.println(n+"is a lowercase character");
                }
                else if(n=='A'){
                System.out.println(n+" is an uppercase character");
                }
                else {
                System.out.println(n+" is symbol");
                }
        }
}
