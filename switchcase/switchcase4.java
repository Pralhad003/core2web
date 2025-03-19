import java .util.*;
class switchcase4{

        public static void main(String[] args){

                Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
                String x=sc.next();
                switch(x){

                        case "+":
				//int a=n+m;
                                System.out.println(n+m);
                                break;
                        case "-":

                                System.out.println(n-m);
                               break;
                        case "*":
                                System.out.println(n*m);
                               break;
			case "/":
                                System.out.println(n*m);
                               break;
			case "%":
                                System.out.println(n*m);
                               break;

                       default :
                                System.out.println("not a size");
                }
        }
}
