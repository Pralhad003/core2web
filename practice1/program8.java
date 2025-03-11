import java.io.*;
class program8{                                                                                                                                                                                                                                        public static void main(String[] args) throws IOException {

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int num1=Integer.parseInt(br.readLine());
                int num2=Integer.parseInt(br.readLine());
		if (num1>num2)
	       	{
            System.out.println(num1 + "is maximum of."+num2);
        }

        else {System.out.println(num2 + " is maximum of."+num1);

               }                                                                                                               }
}
