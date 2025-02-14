package com.nested_try_catch_04;
//NestedTryCatch --> This class is created to check nested try catch block.
public class NestedTryCatch {
    //Method to get the value of array at given index.
    public static void arrayValue(int[] arr,int index){
        try{
           if(arr==null) throw new NullPointerException("NullPointerException... Array is NULL");
           else{
               try{
                   System.out.println(arr[index]);
               }catch(ArrayIndexOutOfBoundsException e){
                   System.out.println("ArrayOutOfBoundException... The Index is not available");
               }
           }
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    //Main method to control the flow of code.
    public static void main(String[] args){
        int[] arr = new int[]{1,2,5,6,5,4,5,8};
        int[] arr2 = null;
        int index = 10;
        NestedTryCatch.arrayValue(arr,index);
        NestedTryCatch.arrayValue(arr2,index);
    }
}
