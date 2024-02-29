package Practice;
import java.util.*;

public class codevita {

    public static boolean isInvalid(char []array) {

        boolean res = false;
        for(char ch:array) {
            if(ch != '.' && !Character.isDigit(ch)) {
                res = true;
            }
        }
        return res;
    }

    public static char[] trimZeros(char []num) {

        int n=num.length;
        int i=0;
        boolean isPoint = false;

        while (i<n && num[i]=='0') {
            num[i]='-';
            i++;
        }

        String str = "";

        for(i=0;i<n;i++) {

            if(num[i]=='.') {

                isPoint = true;
                break;
            }
        }

        for(i=0;i<n;i++){

            if(num[i]!='-'){

                str+=num[i];
            }
        }

        if(!isPoint) {

            str+=".0";
        }

        return str.toCharArray();
    }

    public static String movePointer(char []arr){

        if (arr[0] != '.') {

            int i = 0;
            while (i<arr.length && arr[i] != '.') {
                i++;
            }
            String str = "";
            for(int j=0;j<arr.length;j++){

                if(arr[j] != '.'){
                    str+=arr[j];
                }
            }
            
            return arr[0]+getSum(str)+"+e"+getSum(String.valueOf(i));
        } else {

            int i=0;
            char firstValue = '0';
            while (i<arr.length && arr[i] == '0') {
                i++;
            }
            if(i<arr.length){
                firstValue = arr[i];
            }
            String temp = "";
            for(int j=i+1;j<arr.length;j++){
                temp+=arr[j];
            }
            return firstValue+getSum(temp)+"-e"+getSum(String.valueOf(i));
        }
    }

    public static String getSum(String str) {

        while (str.length() != 1) {

            int temp = 0;
            for(int i=0;i<str.length();i++) {
                temp += Character.getNumericValue(str.charAt(i));
            }

            str = String.valueOf(temp);
        }
        
        return str;
    }

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        int testcases = Integer.parseInt(sc.next());

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "thr");
        map.put(4, "fou");
        map.put(5, "fiv");
        map.put(6, "six");
        map.put(7, "sev");
        map.put(8, "eig");
        map.put(9, "nin");
        map.put(0, "zer");


        for(int i = 0; i < testcases; i++){

            String []input = sc.next().split(" ");
            String num = input[0];
            String name = input[1];

            char chars[] = num.toCharArray();

            if(isInvalid(chars)) {

                System.out.println("Invalid Input");
            } else {

                char arr[] = trimZeros(chars);
                String res = movePointer(arr);
                System.out.println(res);
            }
        }
    }
}