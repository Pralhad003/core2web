import java.io.*;
class program6{
        public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
	int c=Integer.parseInt(br.readLine());
        if(a*a+b*b==c*c){
                
                System.out.println(" it is  the  pythagorean triplet");
     }
      
        else{

                System.out.println("Not a Pythagorean triplet");
        }
}
}
