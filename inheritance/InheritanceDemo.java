package inheritance;

// import java.lang.*;  // alr imported by default, gives use of System
// import tools.*;      // * refers to all file, NOT all folders (nested means need to go in further)

import tools.VeryAdvCalc;

// practice of reversing domain name to name the package to get a unique name for package;
// e.g. package com.google.calculation;

public class InheritanceDemo {
    
    public static void main (String a[]){
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.multi(4,5);
        int r3 = obj.div(5,6);
        int r4 = obj.subtract(10, 5);
        int r5 = (int) obj.power(2, 4);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }

}

// Multi-level inheritance;
// Reflection: the inheritance doesnt seem to work with just the class file though lecturer says it does; But doesnt matter;

// Multiple Inheritance in Java doesnt work
// Cannot inherit from 2 same level parent class simultaneously - aka cannot class A extends B extends C
// child class call method - search own, then search one level up first, then another level up if dun hv in tt level
// Ambiguity problem -> e.g. both A and B (parents) have same name method, if child call that method (wun noe which one is being called) - Java does not support multiple inheritance (later on use interface)

// When the java file is in other package, need to import
// What ever class u use in java, belongs to a package
// System belongs to a package too; Every java file will have java.lang.* imported by default;













