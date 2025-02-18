package com.reflections.invoke_private_method_03;

//Student --> class with private method set salary
class Student {
    int salary = 0;
    private int b = 1555;

    private int setSalary() {
        this.salary = 1000;
        return this.salary;
    }

}
