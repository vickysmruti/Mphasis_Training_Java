public class Stringex {
 
    public static void main(String[] args) {
        //string
        String str = "String example";
        System.out.println(str);
        
        //string buffer
        StringBuffer sb =new StringBuffer("one_");
        sb.append("two");
        System.out.println(sb);
        
        //string builder
        StringBuilder stb=new StringBuilder("first_");
        stb.append("second");
        System.out.println(stb);
    }
 
}
