import java.util.Scanner;

import java.util.Scanner;

public class app {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入要幾個數: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("第 " + (i + 1) + " 個數: ");
            nums[i] = scanner.nextInt();
        }

        int min = Solution.findMin(nums);
        System.out.println("Minimum value (Original Solution): " + min);
        
        scanner.close(); // Close Scanner
    }
}

class Solution {
    // Static method to find minimum value in an array
    public static int findMin(int[] nums) {
        int left = 0 , right = nums.length - 1;//先寫索引
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[right]){
                right = mid;
            }else{
                left = mid + 1; 
            }
        }
        return nums[left];
    }
}

/*原始數組： [3, 4, 5, 1, 2, 0, 9, 19, 50, -1]




                |
                V
[3, 4, 5, 1, 2, 0, 9, 19, 50, -1]
 ^                             ^
 |                             |
 |                           最小值
 起始位置

在這個示意圖中，我們將數組以某一點（這裡是 0）進行了旋轉。當我們進行二分搜索時，我們可以觀察到以下規律：

如果中間的元素小於右邊的元素，那麼最小值肯定在左側，包括中間元素本身。
如果中間的元素大於等於右邊的元素，那麼最小值肯定在右側，不包括中間元素本身。
基於這個規律，我們可以在每一步都排除一半的數組，直到最終找到最小值。這就是為什麼要使用這樣的二分搜索方法。


*/

