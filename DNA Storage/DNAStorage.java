import java.util.Scanner;

public class DNAStorage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            String newStr="";

            int start=0;
            int current=1;
            
            while(true)
            {
               if(current>=n)
               {
        
                   System.out.println(newStr);   
                   break;
               }
                
               if(s.charAt(start)=='0' && s.charAt(current)=='0')
               {
                   newStr=newStr+"A";
               }
               
               if(s.charAt(start)=='0' && s.charAt(current)=='1')
               {
                   newStr=newStr+"T";
               }
               
               if(s.charAt(start)=='1' && s.charAt(current)=='0')
               {
                   newStr=newStr+"C";
               }
               
               if(s.charAt(start)=='1' && s.charAt(current)=='1')
               {
                   newStr=newStr+"G";
               }
               start=current+1;
               current=start+1;
            }  
        }
    }
}
