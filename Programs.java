import java.util.Scanner;
public class Programs
{
   public static void main(String args[]){

  Scanner scanner_obj=new Scanner(System.in);
  int number=scanner_obj.nextInt();
  int number_length=Integer.toString(number).length();
  System.out.printf("Length of %d is : %d",number,number_length);
}
}