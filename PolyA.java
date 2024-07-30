public class PolyA {

    public void show(){
        System.out.println("In PolyA");
    }

    public static void main(String a[]){

        PolyA obj1 = new PolyA();
        obj1.show();
        obj1 = new PolyB();
        obj1.show();
        obj1 = new PolyC();
        obj1.show();
    }
    
}

class PolyB extends PolyA{

    @Override
    public void show(){
        System.out.println("In PolyB");
    }

}

class PolyC extends PolyA{

    @Override
    public void show(){
        System.out.println("In PolyC");
    }

}