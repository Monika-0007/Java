public class loops {
    public static void main(String args[]) {
        int j;
        //prints number from 1 to 50
        for(int i=1;i<=50;i++){
            System.out.println(i);
        }
        //prints number from 1 to 5
        for(j=1;j<=5;j++){
            System.out.println(j);
        }
        System.out.println("\n"+j);//6
        //prints even numbers
        for(int i=2;i<=100;i+=2){
            System.out.println(i);
        }
        //prints odd numbers
         for(int i=1;i<=99;i+=2){
            System.out.println(i);
        }
        //prints numbers in reverse order
         for(int i=10;i>=1;i--){
            System.out.println(i);
        }
        //while loop
        int num=100;
        while(num>=1){
            System.out.println(num);
            num--;
        }
        //do while loop
        int num1=10;
        do
        {
          System.out.println(num1);
            num1--;
        }while(num1>=1);
    }
}
