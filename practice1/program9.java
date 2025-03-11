import java.io.*;
class program9 {                                                                                                                                                                                                                                        public static void main(String[] args) throws IOException {

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int num=Integer.parseInt(br.readLine());
                switch(num) {
                  case 1:
			  System.out.println("Monday");
			  break;
                 case 2:
                          System.out.println("Tuseday");
                          break; 
	        case 3:
                          System.out.println("wednesday");
                          break; 
                case 4:
                          System.out.println("Thuseay");
                
			  break;
		case 5:
                          System.out.println("friday");
                          break; 
                case 6:
                          System.out.println("saturday");
                          break; 
                case 7:
                          System.out.println("sunday");
                          break; 
	        default:
			  System.out.println(" day number must be 1 to 7");
		}		
}
}
