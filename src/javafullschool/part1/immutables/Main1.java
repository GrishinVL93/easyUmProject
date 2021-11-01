package javafullschool.part1.immutables;

public class Main1 {
    public static void main(String[] args) {

        String s = "ABC";
        String s2 = s.concat("DEF");

        System.out.println(s);
        System.out.println(s2);

        StringBuilder sb = new StringBuilder("ABC");
        sb.append("DEF");
        sb.append("HJI");

        System.out.println(sb);

        String sbs = sb.toString();
    }
}
