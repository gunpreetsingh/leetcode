import java.util.HashSet;
import java.util.Set;

/**
 * Created by singhgu on 2/8/2019.
 */
public class numUniqueEmails929 {

    public static int numUniqueEmails(String[] emails){
       Set<String> set = new HashSet();
        for(String str: emails){
            String[] email = str.split("@");

            if(email[0].contains("+"))
                email[0] = email[0].substring(0, email[0].indexOf('+'));

            email[0] = email[0].replace(".", "");
            set.add(email[0]+"@"+email[1]);
        }
        return set.size();
    }

    public static void main(String[] args){System.out.println(numUniqueEmails(new String[]{"testemail@leetcode.com","testemail1@leetcode.com","testemail+david@lee.tcode.com"}));}
}
