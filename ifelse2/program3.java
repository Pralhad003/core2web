import java.io.*;
class program3{
        public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char n=br.readLine().charAt(0);
        if(n=='a'||n=='A'||n=='i'||n=='I'||n=='e'||n=='E'||n=='o'||n=='O'||n=='u'||n=='U'){
                System.out.println(n+" is vowel");
        }
      
        else{

                System.out.println(n+" is consonant");
        }
}
}
