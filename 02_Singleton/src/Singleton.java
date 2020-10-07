/**
 * @author yoon
 */
public class Singleton {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("We Are the World! ");
        String s = replaceSpace(sb);
        System.out.println(s);
    }


        public static String replaceSpace(StringBuffer str) {
            String s = str.toString();
            StringBuffer sb = new StringBuffer();
            char[] c = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {
                if (c[i]==' '){
                    sb.append("%20");
                    continue;
                }
                sb.append(c[i]);
            }

            return sb.toString();
        }
}
