import java .util.*;
class switchcase8{

        public static void main(String[] args){

                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the number");
                int n=sc.nextInt();
		if(n<0){
			System.out.println("sorry negative number are not allowed");
		}
		else{
                switch(n%2){

                        case 0:
                                //int a=n+m;
                                System.out.println("Even");
                                break;
                        case 1:

                                System.out.println("Odd");
                               break;
                        

                       default :
                                System.out.println("invalid number");
                }
		}
        }
}
