

class A{
    
    public void showA(){
        System.out.println("Showing A");
    }
}

class B extends A{

    public void showB(){
        System.out.println("Showing B");
    }

}

public class DemoCast2 {

    public static void main(String a[]){
        A obj = new B();
        obj.showA();
        System.out.println(obj.getClass() + " polymorphism B as A");

        B obj2 = (B) obj;
        System.out.println(obj2.getClass() + " after downcasting to B");
        obj2.showB();       //This is throwing except A cannot cast to B

        // "downcasting" from A (though class actually alr is B) to B


        B obj3 = new B();
        A obj4 = (A) obj3;
        System.out.println(obj4.getClass() + " after upcasting to A");               //still shows it is class B
        obj4.showA();       //Child can upcast to parent
        
        // B obj5 = new A();    //This doesn't work as well - hierarchy

    }

}
