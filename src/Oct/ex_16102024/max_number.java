package Oct.ex_16102024;

public class max_number {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 30;

        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);

        //int result = (a>=b && a>=c)? a: (b>=c ?b:c);
        //System.out.println("max number is:"+result);
    }
}
