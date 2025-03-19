import java .util.*;
class switchcase7{

        public static void main(String[] args){

                Scanner sc= new Scanner(System.in);
		System.out.println("1.Platinum \n.2. Gold.\n 3. Silver \n4.broze. \n5.free");
                String n=sc.next();
                switch(n){

                        case "Platinum":
                                //int a=n+m;
                                System.out.println("for the Platinum Plan the price is 799");
                                break;
                        case "Gold":

                                System.out.println("for the gold Plan the price is 599");
                               break;
                        case "Silver":
                                System.out.println("for the silver Plan the price is 399");
                               break;
                        case "Bronze":
                                System.out.println("for the bronze Plan the price is 199");
                               break;
                        case "Free":
                                System.out.println("for than 199 the platfrom is free");
                               break;

                       default :
                                System.out.println("invalid input");
                }
        }
}
