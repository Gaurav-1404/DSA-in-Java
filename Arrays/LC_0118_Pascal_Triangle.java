package Arrays;
import java.util.ArrayList;
/*
========================================
LeetCode : 118
Problem  : Pascal's Triangle

Topic     : Arrays
Subtopic  : 2D Array / ArrayList
Pattern   : Dynamic Construction

Difficulty: Easy

Time Complexity  : O(numRows²)
Space Complexity : O(numRows²)

Approach:

1. Create a list to store all rows.
2. The first and last element of every row is always 1.
3. For each middle element, add the two elements
   directly above it from the previous row.
4. Build each row using the previous row.
5. Add every completed row to the result.

Key Learning:

- Pascal's Triangle
- ArrayList
- Nested Loops
- Building Rows from Previous Row
- 2D Array / List Construction

========================================
*/
import java.util.List;

public class LC_0118_Pascal_Triangle {
    public static List<List<Integer>> generate(int numRows){

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0; i<numRows; i++){

            List<Integer> row = new ArrayList<>(i);

            for(int j=0; j<=i; j++){
                if(j==0  || j==i){
                    row.add(1);
                }
                else{
                    List<Integer> prevousRow = ans.get(i-1);

                    int value = prevousRow.get(j-1)+prevousRow.get(j);
                    row.add(value);
                }
            }
            ans.add(row);
        }
        return ans;
    }
    public static void main(String[] args) {
        int row = 8;

        List<List<Integer>> ans = generate(row);

        System.out.println(ans);
    }
}