/**
 * Created by singhgu on 2/5/2019.
 */
public class RomanToInteger13 {

    public static int romantoInteger(String str){
        char[] strArray = str.toCharArray();
        int[] number = new int[strArray.length];
        int sum = 0;

        for(int i = 0; i<strArray.length; i++){
            switch(strArray[i]){
                case 'I':
                    number[i] = 1;
                    break;
                case 'V':
                    number[i] = 5;
                    break;
                case 'X':
                    number[i] = 10;
                    break;
                case 'L':
                    number[i] = 50;
                    break;
                case 'C':
                    number[i] = 100;
                    break;
                case 'D':
                    number[i] = 500;
                    break;
                case 'M':
                    number[i] = 1000;
                    break;
            }
        }

        for(int i=0; i<number.length-1;i++){
            if(number[i]<number[i+1])
                sum-=number[i];
            else
                sum+=number[i];
        }


        return sum + number[number.length-1] ;
    }
    public static void main(String[] args)
    {
        System.out.println(romantoInteger("VIIII"));
    }
}
