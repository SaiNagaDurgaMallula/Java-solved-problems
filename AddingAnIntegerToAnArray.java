package myCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddingAnIntegerToAnArray
{
    public static void main(String[] args) {
        int[]  nums = {2,1,5};
        int k = 806;

        System.out.println(addToArray(nums,k));
    }

    private static List<Integer> addToArray(int[] nums,int k)
    {
        List<Integer> result = new ArrayList<>();

        int i = nums.length-1;
        int carry = 0;

        while(i >= 0 || k > 0 || carry > 0)
        {
            int sum = carry;

            if(i >= 0)
            {
                sum += nums[i];
                i--;
            }

            if(k > 0)
            {
                sum += k%10;
                k = k/10;
            }

            result.add(sum%10);
            carry = sum/10;
        }
        Collections.reverse(result);

        return result;
    }

}
