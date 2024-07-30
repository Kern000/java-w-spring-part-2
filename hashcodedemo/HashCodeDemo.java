package hashcodedemo;

public class HashCodeDemo {
    public static void main(String a[]){

        A obj1 = new A();
        int hashCode1 = obj1.hashCode();
    
        System.out.println(hashCode1 + " hashcode of obj1 here");

        // hash code is used to arrive at integer representation of object
        // thus can quickly locate the bucket in a hash-based collection
        // comes from HashCodeDemo extends Object;

        System.out.println(obj1 + " obj1 pure print here");
        System.out.println(obj1.toString() + " obj1.toString here");
        // every time print an obj, by default it will call toString();
        // basically: getClass().getName() + '@' + Integer.toHexString(hashCode())
        // hash code is related to the memory address of the obj, but it is not the memory address itself

        A obj2 = new A();
        A obj3 = new A();

        obj2.model = "Lenovo";
        obj2.price = 1000;

        obj3.model = "Lenovo";
        obj3.price = 1000;

        System.out.println(obj2.hashCode() + " hashcode of obj2 here");
        System.out.println(obj3.hashCode() + " hashcode of obj3 here");

        System.out.println(obj2.toString() + " String repre of obj2 here");
        System.out.println(obj3.toString() + " String repre of obj3 here");
        
        boolean result = obj2.equals(obj3); //equals come from Object and it compares their hexdecimal value
        boolean result2 = obj2.hashCode() == obj3.hashCode();
        boolean result3 = obj2.model.equals(obj3.model); //Compare string objects of the variables on ea
        boolean result4 = obj2.equals(obj2);
        // hashcode can be different even if the 2 objects are identical in contents
        // "Same" usually means, literally, one object. Here what you have are equivalent objects.

        System.out.println(result + " equals method on obj2 and obj3"); //returns false; hashcode is diff though obj 2 and 3 have same variable values
        System.out.println(result2 + " hashcode obj2 == hashcode obj3"); //returns false because they return the object's memory address
        System.out.println(result3 + " internal variable values comparison");
        System.out.println(result4 + " obj2 .equals obj2 itself");

        // Java abstracts away the direct memory address, so hashcode which is derived from it is way to somewhat see it

    }
}

class A{
    String model;
    int price;
}