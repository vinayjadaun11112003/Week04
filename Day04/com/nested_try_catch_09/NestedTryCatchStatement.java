package com.nested_try_catch_09;
//NestedTryCatchStatement --> This class is created for the nested exception overview.
public class NestedTryCatchStatement {
    //method of division of array element other wise it will have a nested exception block
    public static void divisionOfArray(int[] arr, int divisor, int index){
        try{
            int value = arr[index];
            try{
                if(divisor<=0){
                    throw new ArithmeticException("Arithematic exception.. kindly check the divisior value");
                }
                System.out.println(value/divisor);
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    //Main method to control the flow of code.
    public static void main(String[] args){
        System.out.println("Nested Try Catch Block");
        int[] arr = new int[]{10,2,5,7};
        //run successfully
        NestedTryCatchStatement.divisionOfArray(arr,10,3);

        //throw arithematic exception
        NestedTryCatchStatement.divisionOfArray(arr,0,1);

        //throw index out of bound exception
        NestedTryCatchStatement.divisionOfArray(arr,10,10);
    }
}
