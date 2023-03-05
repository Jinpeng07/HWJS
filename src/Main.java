public class Main {
    public static void main(String[] args) {

        vParas(12,"aa", "bb", "cc");
    }

    public static void vParas(int age, String... names) {
        System.out.println(age);
        System.out.println(names[2]);
    }

}