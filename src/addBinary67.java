/**
 * Created by singhgu on 2/9/2019.
 */
public class addBinary67 {

    public static String addBinary(String a, String b){
        int maxlength = a.length();
        char carry = '0';
        if(maxlength<b.length())
            maxlength=b.length();

        char[] aArray = reverseElements(a, maxlength);
        char[] bArray = reverseElements(b, maxlength);

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i <maxlength; i++){
            if(aArray[i]=='1' && bArray[i]=='1' && carry=='0') {
                stringBuilder.append('0');
                carry='1';
            }
            else if(aArray[i]=='1' && bArray[i]=='1' && carry=='1') {
                stringBuilder.append('1');
                carry='1';
            }
            else if(aArray[i]=='0' && bArray[i]=='0' && carry=='0') {
                stringBuilder.append('0');
                carry='0';
            }
            else if(aArray[i]=='0' && bArray[i]=='0' && carry=='1') {
                stringBuilder.append('1');
                carry='0';
            }
            else if(aArray[i]=='1' && bArray[i]=='0' && carry=='0') {
                stringBuilder.append('1');
                carry='0';
            }
            else if(aArray[i]=='1' && bArray[i]=='0' && carry=='1') {
                stringBuilder.append('0');
                carry='1';
            }
            else if(aArray[i]=='0' && bArray[i]=='1' && carry=='0') {
                stringBuilder.append('1');
                carry='0';
            }
            else if(aArray[i]=='0' && bArray[i]=='1' && carry=='1') {
                stringBuilder.append('0');
                carry='1';
            }
        }
        if(carry=='1')
            stringBuilder.append('1');

        return stringBuilder.reverse().toString();

    }

    public static char[] reverseElements(String str, int maxlength){
        char[] arr = new char[maxlength];

        if(maxlength>str.length()){
            for(int j = str.length(); j<maxlength;j++)
                arr[j]='0';
        }
        for(int i = str.length()-1, j=0; i>=0; i--)
            arr[j++] = str.charAt(i);
        return arr;
    }


    public static void main(String args[]){
        System.out.println(addBinary("1010", "1011"));
    }
}
