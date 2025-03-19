import java.io.*;
class program2{
        public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        if(n%13==0){
                System.out.println(n+" is  in the table of 13");
        }
       
        else{

                System.out.println(n+" is not in the table of 13");
        }
}
}
