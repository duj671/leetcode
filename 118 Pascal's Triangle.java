/**
* Given numRows, generate the first numRows of Pascal's triangle.
* For example, given numRows = 5,
* Return
* [
*      [1],
*     [1,1],
*    [1,2,1],
*   [1,3,3,1],
*  [1,4,6,4,1]
* ]
**/

import java.util.ArrayList;
import java.util.List;
public class Solution {
	public List<List<Integer>> generate(int numRows) {
		int[][] a = new int[numRows][numRows];
		for(int i=0;i<numRows;i++){
			for(int j=0;j<=i;j++){
				if(j==0||j==i){
					a[i][j]=1;
				}else{
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		List<List<Integer>> listd = new ArrayList<List<Integer>>();
		for(int i=0;i<numRows;i++){
			List<Integer> list = new ArrayList<Integer>();
			for(int j=0;j<=i;j++){
				list.add(a[i][j]);
			}
			listd.add(list);
		}
		return listd;
    }
}
