package Arrays;

import java.util.ArrayList;
import java.util.List;

/*
========================================
LeetCode : 119
Problem  : Pascal's Triangle II

Topic     : Arrays
Subtopic  : 2D Array / ArrayList
Pattern   : In-place Row Construction

Difficulty: Easy

Time Complexity  : O(rowIndex²)
Space Complexity : O(rowIndex)

Approach:

1. Start with the first row [1].
2. Build each next row from the current row.
3. Update elements from right to left so that
   previous values are not overwritten.
4. Add 1 at the end of every row.
5. Continue until the required rowIndex is reached.
6. Return only the required row.

Key Learning:

- Pascal's Triangle
- ArrayList
- In-place Update
- Right-to-Left Traversal
- Space Optimization
- Previous Row Dependency

========================================
*/
public class LC_0119_Pascal_Triangle_II {
    public static List<Integer> getRow(int rowIndex){

        List<Integer> previousRow = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    int value = previousRow.get(j-1) + previousRow.get(j);
                    row.add(value);
                }
            }
            previousRow = row;
        }
        return previousRow;
    }

    public static void main(String[] args) {
        int rowNumber = 3;

        List<Integer> ans = getRow(rowNumber);
        System.out.println(ans);

        int num = 0;
        List<Integer> ans1 = getRow(num);
        System.out.println(ans1);
    }
}
