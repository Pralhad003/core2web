import java.io.*;
class program1{
	public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	if(n>1000){
		System.out.println(n+" is out of the range 1 to 1000");
	}	
	else if(n<1000&& n!=0){
                System.out.println(n+" is  range 1 to 1000");
	}
	else{

                System.out.println(n+" is not in the range 1 to 1000");                                               
	}
}
}
