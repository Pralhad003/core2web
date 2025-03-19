import java .util.*;
class switchcase3{

        public static void main(String[] args){

                Scanner sc= new Scanner(System.in);
                        String x=sc.next();
                switch(x){

                        case "XL":
                                System.out.println("Large");
                                break;
                        case "M":
                                System.out.println("Median");
                               break;
                        case "S":
                                System.out.println("small");
                               break;

                       default :
                                System.out.println("not a size");
                }
        }
}
