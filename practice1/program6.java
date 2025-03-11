import java.io.*;
class program6 {                                                                                                                                                                                                                                        public static void main(String[] args) throws IOException {
                                                                                                                                        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int num=Integer.parseInt(br.readLine()); 
		if (num % 3 == 0 && num % 7 == 0) {
            System.out.println(num + " is divisible by both 3 and 7.");
        } 
	else if (num % 3 == 0) {
            System.out.println(num + " is divisible by 3.");
        }
       	else if (num % 7 == 0) {
            System.out.println(num + " is divisible by 7.");
        
	}
       	else {
            System.out.println(num + " is neither divisible by 3 nor by 7.");
        
               }                                                                                                               }
}                                                                                                                       
