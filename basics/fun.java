public class fun{
    public static void main(String[] args) {
        String name="pratiksha";
        String abc=myGreet(name);
        System.out.println(abc);
       
    }

    static String myGreet(String naam) {
        System.out.println("hello "+naam);
        naam="riya";
        System.out.println(naam+ " how are you?");
        return naam;
    }
}