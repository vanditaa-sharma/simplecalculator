//this is a calculator using switch statements in java
import java.util.*;
public class Main{
  public static void main(String args[]){
    System.out.println("This is a Calculator.");
    System.out.println("Enter 2 numbers: ");
    Scanner sc=new Scanner(System.in);
    double n1=sc.nextDouble();
    sc.nextLine();
    double n2=sc.nextDouble();
    sc.nextLine();
    System.out.println("What operation do you want to perform ? ie. sum, sub,mul,div");
    String operation=sc.nextLine();
    switch(operation){
      case "sum":
        System.out.printf("%f + %f = %f",n1,n2,n1+n2);
        break;
        case "sub":
        System.out.printf("%f - %f = %f",n1,n2,n1-n2);
        break;
        case "mul":
        System.out.printf("%f * %f = %f",n1,n2,n1*n2);
        break;
        case "div":
        if(n2==0){
          System.out.println("Can not divide by zero");
          
        }
        else{
          System.out.printf("%f / %f = %f",n1,n2,n1/n2);
        }
        break;
        default:
        System.out.printf("%s is not a supported operation",operation);
        break;
    }
    sc.close();
  }
}
