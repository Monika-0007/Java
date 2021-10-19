public class Prime
{
   public static void main (String args[])
   {		
       int i,num;
       System.out.println("Prime numbers from 1 to 100 are :");
       for (i = 1; i <= 100; i++)         
       { 		  	  
          int count=0; 	  
          for(num =1; num<=i; num++)
	      {
             if(i%num==0)
	         {
 		      count++;
	         }
	      }
	      if (count ==2)
	       {
	        System.out.print(i+" ");
         }      
       }      
   }
}

  
    
    
   
      
      
