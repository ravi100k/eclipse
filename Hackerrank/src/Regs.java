import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regs {
  
public static void main(String[] args) {
  
    // TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);

    String s=in.nextLine();
    Pattern pat;
    Matcher mat;
     //String ip="\\b(25[0-5]| 2[0-4][0-9]|[01]?[0-9][0-9]?)\\.b(25[0-5]| 2[0-4][0-9]|[01]?[0-9][0-9]?)\\.b(25[0-5]| 2[0-4][0-9]|[01]?[0-9][0-9]?)\\.b(25[0-5]| 2[0-4][0-9]|[01]?[0-9][0-9]?)\\.b";
    //String ip="^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."+"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.$";

    String ip="(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

        pat=Pattern.compile(ip);
        //mat=pat.matcher(s);
    if(pat.matcher(s).matches())     

        System.out.println("true");
    else
        System.out.println("false");


}
}