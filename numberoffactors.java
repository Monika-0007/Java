public class no_of_factors {
    public static void main(String args[]) {
       int num=100,count=0;
       for(int i=1;i<=num;i++)
       if(num%i==0){
           count++;
       }
      System.out.println(count);
    }
}
