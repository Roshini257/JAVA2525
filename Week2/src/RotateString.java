package Week2.src;

public class RotateString {
    String s1 = "JavaJ2eeStrutsHibernate";
    String s2 = "StrutsHibernateJavaJ2ee";


    public boolean rotate() {
        if (s1.length() != s2.length()) return false;
        String x = s1;
        for (int i = 0; i < s1.length(); i++) {
            x = s1.substring(i + 1, s1.length()) + s1.substring(0, i + 1);
            if (x.equals(s2)) {

                x = s1;
            }


        }
        return true;

    }
}