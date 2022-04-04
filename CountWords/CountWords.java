package CountWords;
import java.util.Scanner;

public class CountWords {

    public static int count_Words(String str){
        int count = 0;
        if(!(" ".equals(str.substring(0,1))) || !(" ".equals(str.length() - 1))){
            for(int i = 0; i< str.length();i++){
                if(str.charAt(i) == ' '){
                    count++;
                }
            }
            count = count + 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the string : ");
        String str = input.nextLine();
        System.out.println("Number of words in the string : " + count_Words(str) + "\n");

        input.close();
    }
}
