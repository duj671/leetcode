/**
* Given an index k, return the kth row of the Pascal's triangle.
* For example, given k = 3,
* Return [1,3,3,1]. 
**/

public class Solution {
   public List<Integer> getRow(int rowIndex) {
		 List<Integer> listl = new ArrayList<Integer>();
		 int[][] a = new int[rowIndex+1][rowIndex+1];
		 for(int i=0;i<=rowIndex;i++){
			 for(int j=0;j<=i;j++){
				 if(j==0||j==rowIndex){
					a[i][j]=1;
				 }else{
					 a[i][j]=a[i-1][j-1]+a[i-1][j];
				 }
			 }
		 }
		 for(int i=0;i<=rowIndex;i++){
			 listl.add(a[rowIndex][i]);
		 }
		return listl; 
	 }
}