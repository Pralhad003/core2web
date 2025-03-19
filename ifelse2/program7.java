import java.io.*;
class program7{
        public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int abalance=Integer.parseInt(br.readLine());
        
        if(abalance>40000000){
                if(abalance*(10/100)>=2000000){
		  System.out.println(" i want to buy BMW");
		}else{
                System.out.println(" i want to buy Thar");
        }
	}

        else if(abalance<=1500000&&abalance>=1000000){
                
        System.out.println("i want to buy the fronx");
        }
        else{ 
		

                System.out.println("i want to buy the swift");
        }
}
}
