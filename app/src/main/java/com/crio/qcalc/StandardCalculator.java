package com.crio.qcalc;

public class StandardCalculator {

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }

   private int result;
public void add(int num1, int num2)
{
    
    int result = 0;
    result =  num1+num2;
    setResult(result);
}

public void subtract(int num1, int num2){
    
    int result = 0;
    result =  num1-num2;
    setResult(result);
}


public void multiply(int num1, int num2)
{
    int result = 0;
    result =  num1 * num2;
    setResult(result);
}

public void divide(int num1, int num2)
{
     int result = 0;
     result =  num1/num2;
     setResult(result);

}



public int getResult() 
{
   return result;
}


private void setResult(int value){
  this.result = value;
}


public void clearResult() {

    result = 0;

}


public void printResult(){

    System.out.println("Standard Calculator Result:"+ getResult());

}






}
