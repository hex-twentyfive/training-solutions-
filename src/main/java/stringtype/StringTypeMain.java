package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {

        String prefix = "Hello ";

        String name = "John Doe";

        String message = prefix + name;

        message = message + (int) 444;

        boolean b = message.equals("Hello John Doe");

        boolean c = message.equals("Hello John Doe444");

        System.out.println(("" + "").length());

        String world = "Abcde";

        System.out.println(world.length());

        System.out.println(world.substring(0,1) + ", " + world.substring(2,3));

        System.out.println(world.substring(0,3));

    }
}

