package upcastdowncast;

public class CastDemo1 {
        
    public static void main(String a[]){
        double d = 4.5;
        
        System.out.println(d);
        
        int i = (int) d;

        System.out.println(i);

        double d2 = (double) i;

        System.out.println(d2);
        // loss of data accuracy

    }

}
