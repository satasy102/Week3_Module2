import java.util.LinkedList;
import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> maxString = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chuoi:");
        String string = sc.nextLine();
        list.add(string.charAt(0));
        int count = 1;
        for (int i = 1; i < string.length(); i++) {                         // single loop

            if (string.charAt(i) > string.charAt(i - 1)) {                  // simple stament
                list.add(string.charAt(i));
                count++;
            }

            if(string.charAt(i)<string.charAt(i-1)||i+1==string.length()){
                if (count >= maxString.size()) {                            // simple stament
                    maxString.clear();
                    maxString.addAll(list);
                }
                list.clear();
                list.add(string.charAt(i));
                count=1;
            }
        }

        for(char ch:maxString) System.out.print(ch);                        // single loop,simple stament

    }
}
/*********************************************************************************
 * 	Analyze the time complexity of your program:                                  *
 * 	1 single loop * 2 simple statements = 2;                                      *
 * 	1 single loop * 1 simple statement = 1;                                       *
 *                                                                                *
 * 	T(n) = O(n) Linear time;                                                      *
 *********************************************************************************/