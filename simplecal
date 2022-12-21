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
    System.out.println("What operation do you want to perform ? ie. sum, subtract,multiply,divide");
    String operation=sc.nextLine();
    if(operation.equals("sum")){
      System.out.printf("%f + %f = %f",n1,n2,n1+n2);
    }
      else if(operation.equals("subtract")){
      System.out.printf("%f - %f = %f",n1,n2,n1-n2);
    }
        else if(operation.equals("multiply")){
      System.out.printf("%f * %f = %f",n1,n2,n1*n2);
    }
          else if(operation.equals("divide")){
            if(n2==0){
              System.out.println("Can not divide by zero");
            }
      else{System.out.printf("%f / %f = %f",n1,n2,n1/n2);}
    }
    else{
      System.out.printf("%s is not a supported operation",operation);
    }
    sc.close();
  }
}
