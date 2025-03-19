import java .util.*;
class switchcase2{

        public static void main(String[] args){

                Scanner sc= new Scanner(System.in);
                        char x=sc.next().charAt(0);
                switch(x){

                        case 'O':
                                System.out.println("outstanding");
                                break;
                        case 'E':
                                System.out.println("excellent");
                               break;
                        case 'A':
                                System.out.println("Average");
                               break;
			case 'F':
			       System.out.println("Fail");

                       default :
                                System.out.println("invalid grade");
                }
        }
}
