import java.io.*;
class program5{
        public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
	int m=Integer.parseInt(br.readLine());
        if(n>m){
		int profit=n-m;
                System.out.println(profit+" is  the profit");
        }

	else if(n<m){
		int loss=-(n-m);
	System.out.println(loss+"is the loss");
	}
        else{

                System.out.println("No progit and NO Loss");
        }
}
}
