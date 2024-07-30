package other;



public class AccessModifierPractice {
    
    int packageVariable = 3;                // without access modifier the default is package access
    public String publicVariable = "Hello";     // fully accessible across packages and classes
    private String privateVariable = "meow";    // only accessible in own class, not even those in same package or is a child (subclass);
    protected String protectedVariable = "This is the protected variable"; //protected can be access in same package or diff package subclass, as well as within same package even if not in a subclass

    AccessModifierPractice(){
        System.out.println("Access modifier practice constructor here");
    }

    public static void main(String a[]){

        AccessingClass obj2 = new AccessingClass();
        AccessModifierPractice obj4 = new AccessModifierPractice();
        System.out.println("private variable only own class can access: " + obj4.privateVariable);

        Child1 obj5 = new Child1();
        System.out.println("note cannot do obj5.protectedVariable because that variable doesnt exist in child: " + obj5.childVariable1);
    }

}

class Child1 extends AccessModifierPractice {
 
    public int childVariable1 = 5;

    Child1(){
        AccessModifierPractice obj3 = new AccessModifierPractice();
        System.out.println("This is in Child1");
        System.out.println(obj3.protectedVariable);
    }
}


class AccessingClass {

    public AccessingClass(){

        System.out.println("accessing class constructor entered");
        AccessModifierPractice obj1 = new AccessModifierPractice();
        System.out.println(obj1.packageVariable);
        System.out.println(obj1.publicVariable);
        // System.out.println(obj1.privateVariable);  // Private variable cannot be accessed outside class

    }

}

// good to compile with the folder and file path of the package, if not may not be able to properly access
