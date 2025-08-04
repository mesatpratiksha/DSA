public class swap{
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("Before swap: a = " + a + ", b = " + b);

        int temp=b;
        b=a;
        a=temp;
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}