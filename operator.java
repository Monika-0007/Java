public class operator {
    public static void main(String args[]) {
        int a=500,b=1000,c=1500;
        //AND Operator
        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>a && b>c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }
        //OR Operator
        if(b>0 || b<0){
            System.out.println("Not Zero");
        }
        else {
            System.out.println("Zero");
        }
        //NOT Operator
        System.out.println(!false);
    }
}
