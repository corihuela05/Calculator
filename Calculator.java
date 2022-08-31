/*
Crystal Orihuela, Created on August 31, 2022

Basic Calculator to perform basic mathemetical functions such as add, subtract, mutiply, divide and modulo .
*/
public class Calculator{

  public Calculator() {

  }

public int add(int a, int b){
     return a+b;
   
}
public int subtract(int a, int b){
     return a-b;
    


  }
  public int mutiiply(int a, int b){
     return a*b;
  }
  public int divide(int a, int b){
     return a+b;
    

}
public int modulo(int a, int b){
     return a%b;
    

}
public static void main (String [] args){
Calculator myCalculator = new Calculator();
System.out.println(myCalculator.add(5,7));

System.out.println(myCalculator.subtract(45, 11));
}

}
