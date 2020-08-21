import java.util.LinkedList;
import java.util.Scanner;

public class FindMaxIncreasingly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }

            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }

        for (Character ch: max) System.out.print(ch);

        System.out.println();
    }

/*********************************************************************************
 * Phân tích độ phức tạp về thời gian của chương trình của bạn:                                *
 * 	1 Vòng ngoài = n;                                                              *
 * 	1 Vòng trong = n - 1;                                                          *
 *  1 lệnh in đơn giản = 1                                                        *
 * 	1 vòng lăp đơn * 1 lệnh in đơn giản = 1;                                       *
 *  T(n) = (n * (n - 1)) + (1 + 1);                                               *
 *  T(n) = O(n^2) + O(n);                                                         *
 * 	T(n) = O(n^2) Thời gian bậc 2;                                                 *
 *********************************************************************************/
}
