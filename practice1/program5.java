import java.io.*;
class program5 {                                                                                                                                                                                                                                        public static void main(String[] args) throws IOException {
                                                                                                                                        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int n=Integer.parseInt(br.readLine());
                if(n%7==0){
                   System.out.println("Divisible by 7");
                }
                //else if(n%7==0||n%3==0){
                //Syatem.out.println(n+" is an uppercase character");
                //}
		else {                               
		
			System.out.println(" Not Divisible by 7");
                }                                                                                                               }
}                                                                                                                       
