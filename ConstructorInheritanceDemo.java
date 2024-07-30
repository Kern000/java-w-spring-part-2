class A extends Object {

    // every class in Java extends the Object class
    // so the parent class's super() in its constr is calling the constr of Object
    // This is multi-level inheritance

    String name;
    int age;

    public A(){
        System.out.println("In A default constructor");
    }

    public A(String name, int age){
        this.name = name;
        this.age = age;
    }
    //parameterized constructor

    public void printOne(){
        System.out.println("I am in A's method");
    }

    public void printTwo(){
        System.out.println("I am printTwo of A");
    }
}

class B extends A{

    String smile;

    public B(){
        System.out.println("In B default constructor");
    }

    public B(String name){
        this(); //calls constructor of same class
        this.name = name;
    }

    public B(String name, int age, String smile){
        super(name,age); //by default every constructor, the first statement is super even if it is not there, it will call a default if there is no parameterized super
        // cannot super() then this();
        this.smile = smile;   
    }

    @Override
    public void printOne(){
        System.out.println("I am B's method");
    }

}

// Will call constr of both parent and child when instantiate a child

public class ConstructorInheritanceDemo{

    public static void main(String[] args){
        B obj = new B("Hello", 10, "Smile 1");
        System.out.println(obj.name + " " + obj.age + " " + obj.smile);

        B obj1 = new B("Hello 2"); // This will show super() will be called by default even if not specified
        System.out.println(obj1.name);

        B obj2 = new B("meow");
        System.out.println(obj2.name);
        // so yes, the constructor of B default (this()) will happen first, then the 2nd constructor in B executes

        A obj3 = new A();

        obj2.printOne();
        obj2.printTwo();

        obj3.printOne();

    }
}

// EVERY CONSTRUCTOR HAS SUPER EVEN IF NOT MENTIONED;
// Super means call the constr of a super class;
