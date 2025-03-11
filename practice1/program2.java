import java.io.*;
class program2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		if(n%2==0){
                   System.out.println(n+" is even number");
		}
		else {
		System.out.println(n+" is odd number");
		}
	}
}
