package polymorphism;

public class PolyA {

    final int num = 8; // cannot reassign to num
    // final int num2; // this will not work;

    public void show(){
        System.out.println("In PolyA");
    }

    public final void show2(){  //no one can inherit it
        System.out.println("Final show2 in PolyA");
    }

    public static void main(String a[]){

        final int num = 10;
        PolyA obj1 = new PolyA();
        obj1.show();
        obj1 = new PolyB();
        obj1.show();
        obj1 = new PolyC();
        obj1.show();
        // This is dynamic method dispatch
        obj1.show2();

        System.out.println(obj1.num);
        System.out.println(num);
    }
    
}

class PolyB extends PolyA{

    @Override
    public void show(){
        System.out.println("In PolyB");
    }

    // public void show2(){
    // }
    // Cannot override because of final

}

class PolyC extends PolyA{

    @Override
    public void show(){
        System.out.println("In PolyC");
    }

}