import java.io.*;
class program4{
        public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        float n=Float.parseFloat(br.readLine());
        if(n>85.00){
                System.out.println(" medical");
        }
        else if(n<=85.00 && n>75.00){
	System.out.println("enginerring");
	}
	else if(n<=75.00 && n>=65.00){
	System.out.println("Pharmacy or Bachelor Science");
	}
        else{

                System.out.println("Agri");
        }
}
}
