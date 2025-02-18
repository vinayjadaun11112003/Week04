package com.reflections.invoke_private_method_03;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//InvokePrivateMethod --> class to invoke private method of the student class.
public class InvokePrivateMethod {
    //Main method to write execution flow of program.
     public static void main(String[] argss) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
         //Student class object.
         Student a = new Student();


         //Reflection of Method type.
         Method method = Student.class.getDeclaredMethod("setSalary",int.class);

         //Setting the accessablity to true.
         method.setAccessible(true);
         int ans = (int)method.invoke(a);
         System.out.println("Method invoked : " + ans);


     }
}
