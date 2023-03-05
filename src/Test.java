public class Test {
    public static void main(String[] args) {
        String s = "abc";
//        StringBuilder sb = new StringBuilder(s);
        StringBuffer sf = new StringBuffer(s);
        testString(sf);
        System.out.println(sf);
    }

    public static void testString(StringBuffer s) {
        s.append(10);
    }
}
