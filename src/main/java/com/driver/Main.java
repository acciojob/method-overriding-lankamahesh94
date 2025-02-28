package com.driver;

class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object of class B
        B objB = new B();

        // Call the overridden method from class B
        System.out.println(objB.meth());  // Output: "Method is overridden in Extended class B"
    }
}
