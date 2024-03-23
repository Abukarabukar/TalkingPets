package io.zipcoder.polymorphism;

interface  arithmetic_operation {
     void printInfo();
}

// Class add
class add implements arithmetic_operation {
    // class add must override printInfo() method
    // otherwise, compile-time
    // exception will be thrown
    public void printInfo()
    {
        int a = 3;
        int b = 4;
        System.out.println(a + b);
    }
}

// Class sub
class sub implements arithmetic_operation {
    // class sub must override printInfo() method
    // otherwise, compile-time
    // exception will be thrown
    public void printInfo()
    {
        int c = 4;
        int d = 5;
        System.out.println(c - d);
    }
}

// Driver Class
class abstraction {
    // Main Function
    public static void main(String args[])
    {
        arithmetic_operation n = new add();
        n.printInfo();
        arithmetic_operation y = new sub();
        y.printInfo();
    }
}