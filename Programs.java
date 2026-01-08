//this program to find length of number in one line
import java.util.Scanner;
public class Programs
{
   public static void main(String args[]){
//reading data from keybord
  Scanner scanner_obj=new Scanner(System.in);
  int number=scanner_obj.nextInt();
      //converting number into String and using length() we can get length of number 
  int number_length=Integer.toString(number).length();
  System.out.printf("Length of %d is : %d",number,number_length);
}

}
