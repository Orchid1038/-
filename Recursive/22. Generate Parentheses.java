import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入要產生括號的數量: ");
        int n = scanner.nextInt();

        Solution solution = new Solution();
        List<String> result = solution.generateParenthesis(n);

        System.out.println("生成的括號組合：");
        for (String parenthesis : result) {
            System.out.println(parenthesis);
        }
        
        scanner.close(); // 關閉 Scanner
    }
}

//n = 1 只有一個左右括號
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(result, "", 0, 0, n);
        return result;
    }

    private void generate(List<String> result, String cur, int left, int right, int n) {
        // 終止條件：左括號和右括號都使用完畢
        if (left == n && right == n) {
            result.add(cur);
            return;
        }

        // 左括號的數量小於 n，可以添加左括號
        if (left < n) {
            generate(result, cur + "(", left + 1, right, n);
        }

        // 右括號的數量小於左括號的數量，可以添加右括號
        if (right < left) {
            generate(result, cur + ")", left, right + 1, n);
        }
    }
}
