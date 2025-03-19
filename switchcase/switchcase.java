import java .util.*;
class switchcase{

        public static void main(String[] args){

                Scanner sc= new Scanner(System.in);
                        String x=sc.next();
                switch(x){

                        case "RED":
                                System.out.println("stop");
                                break;
                        case "Yellow":
                                System.out.println("warning");
                               break;
                        case "green":
                                System.out.println("Go");
                               break;
                     
                       default :
                                System.out.println("no such colr is present in the traffic signal");
                }
        }
}
