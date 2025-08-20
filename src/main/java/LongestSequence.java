import java.util.*;

public class LongestSequence {

    public static void main(String[] args) {
            int b =0;
        List<Integer> arr = Arrays.asList(1, 1, 2, 2, 1, 1);
//        int arr1= longestSequence(arr);
        int arr1= longestEqualSubarray(arr,b);
        System.out.println(arr1);
    }
//    public static int longestSequence(int[] nums)

//    {
//        int max = 0;
//        Set<Integer> set1 = new HashSet<>();
//        for(int num:nums){
//
//
//            set1.add(num);
//        }
//
//        for (int num:nums){
//
//            if(!set1.contains(num - 1))
//            {
//                int start =num;
//                while (set1.contains(start)){
//
//                    start++;
//                }
//                max = Math.max(max,start-num);
//            }
//
//        }
//        return max;
public static int longestEqualSubarray(List<Integer> nums, int k) {
    int maxf = 0, i = 0, n = nums.size();
    Map<Integer, Integer> count = new HashMap<>();
    for (int j = 0; j < n; j++) {
        count.put(nums.get(j), count.getOrDefault(nums.get(j), 0) + 1);
        maxf = Math.max(maxf, count.get(nums.get(j)));
        if (j - i + 1 - maxf > k) {
            count.put(nums.get(i), count.get(nums.get(i)) - 1);
            i++;
        }
    }
    return maxf;
}

//    def longestEqualSubarray(self, A: List[int], k: int) -> int:
//    maxf = i = 0
//    count = Counter()
//        for j in range(len(A)):
//    count[A[j]] += 1
//    maxf = max(maxf, count[A[j]])
//            if j - i + 1 - maxf > k:
//    count[A[i]] -= 1
//    i += 1
//            return maxf2

}

//    Both my solutions are O(n).
//        99% of other solutions of these two problems is O(kn)
//        where k = 26 or k = 2, is the number of different elements.
//
//
//        Explanation
//        Assume there is a subarray from A[i] to A[j],
//        j - i + 1 the size of subarray,
//        If we want to delete some elements in the subarray to make it equal subarray,
//        we will keep the elements with the maximum frequency.
//
//        We can use a hashmap count to count the frequency of each elements,
//        and we need to delete j - i + 1 - maxf elements,
//        where maxf means the max frequency of elements in the subarray.
//
//        So now we will slide a window from left to right.
//        And our task is to find out the max frequency.
//
//        Each time a new element A[j] coming from right,
//        and we increment ++count[A[j]] and update maxf = max(maxf, count[A[j]]).
//        If j - i + 1 - maxf > k,
//        it means the current too many elements to delete,
//        so we slide to the next index.
//
//        Note that the size of window won't decrease,
//        and maxf is actually the max frequency in history (not the current subarray),
//        you can find this trick in many of my sliding window solutions,
//        if you keep reading and voting them :)
//
//        Finally return maxf we found.
//
//
//        Q&A
//        Question: What if after moving left pointer, the current most element frequency decreases?
//        Answer: Nothing happen:
//        maxf don't change, sliding window size don't change.
//        until we have bigger maxf.
//
//
//        Complexity
//        Time O(n)
//        Space O(n)
