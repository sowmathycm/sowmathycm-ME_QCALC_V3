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

/* -------------------------------- */


/*package com.crio.qcalc;

public class ScientificCalculator {


    public static double squareOf(double num) {

        return num * num;

    }


    public static double cubeOf(double num) {

        return num * num * num;

    }

     public static double powerOf(double base) {

         return Math.pow(base, exponent);

     }


     public static double squareRoot(double num) {

         return Math.sqrt(num);

     }


     public static int modulo(int dividend, int divisor) {

         return dividend / divisor;

     }


     public static double divide(int dividend, int divisor) {

         return dividend % divisor;

     }

}

*/
