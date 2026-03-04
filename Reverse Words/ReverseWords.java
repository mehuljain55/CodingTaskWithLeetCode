public static String reverseWords(String s) {
    String newStr="";
     s=s.trim();
     int n=s.length();    
     int lastCharPosition=n-1;
     int spacePostition=1;
 
     if(!s.contains(" "))
     {
         return s;
      }
    
     for(int i=n-1;i>=0;i--)
     {
         
         if(i==0)
         {
             for(int j=i;j<=lastCharPosition;j++)
             {
                 newStr=newStr+s.charAt(j);
             }
         }
  
         
         if(s.charAt(i)==' ')
         {
             spacePostition=i;
             for(int j=i+1;j<=lastCharPosition;j++)
             {
                 newStr=newStr+s.charAt(j);
             }
             newStr=newStr+" ";
             while(s.charAt(i)==' ')
             {
                 i=i-1;
                 spacePostition=i;
                 lastCharPosition=i;
             }
         }
     }
     return newStr;
}