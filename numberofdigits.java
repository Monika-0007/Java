public class number_of_digits {
  public static void main(String[] args) {
    int count = 0, num = 0025641;
    while (num != 0) {
      num =num /10;
      count++;
    }
    System.out.println("Number of digits: "+count);
  }
}
