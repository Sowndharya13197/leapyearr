import java.io.*;
import java.util.*;
public class leapyearr {
    public static void main(String args[])
          {
              Scanner s=new Scanner(System.in);
             
              for(int i=2017;i<=2037;i++)
               {
                   if(i%4==0)
                   {
                       System.out.println(i);
                   }    
               }   
                  
          }  
    
}
