import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.print("please enter number: ");
        byte number= scanner.nextByte();
        if(number % 5==0 && number% 3 ==0 ){
            System.out.println("fizzbuzz");
        }
        else if(number %5 ==0){
            System.out.println("fizz");
        }
        else if( number% 3 ==0){
            System.out.println("Buzz");
        }
      else{
            System.out.println(number);
        }
    }
}
