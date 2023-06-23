package lesson21;

public class StringApp {

    public static void main(String[] args) {
        String a1 = "A";
        String a2 = a1 + a1;
        String a3 = a1.concat(a1).concat(a1);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        StringBuilder sb = new StringBuilder()
                .append(1)
                .append("1")
                .append(true);
        System.out.println(sb);
        System.out.println(sb.reverse());
        String substring = sb.substring(1,4);
        System.out.println(substring);

        String sbf = new StringBuffer()
                .append(1)
                .append("1")
                .append(true)
                .toString();
        System.out.println(sbf);


    }

}
