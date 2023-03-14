import java.util.Scanner;

public class HJ26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        char[] res = new char[str.length()];
        StringBuilder letters = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isLetter(str.charAt(i))){
                res[i] = str.charAt(i);
            }else {
                letters.append(str.charAt(i));
            }
        }
        String sortLetters = mySort(letters.toString());
        int resIndex = 0;
        for (int i = 0; i < sortLetters.length(); i++) {
            while (res[resIndex] != 0) {
                resIndex++;
            }
            res[resIndex] = sortLetters.charAt(i);
        }

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }
    }

    public static String mySort(String letters){
        char[] cs = letters.toCharArray();
        for(int i = 0; i < cs.length; i++){
            for(int j = 0; j < cs.length - i - 1; j++){
                if(Character.toLowerCase(cs[j]) - Character.toLowerCase(cs[j + 1]) > 0){
                    char temp = cs[j];
                    cs[j] = cs[j + 1];
                    cs[j + 1] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cs.length; i++) {
            sb.append(cs[i]);
        }
        return sb.toString();
    }
}
