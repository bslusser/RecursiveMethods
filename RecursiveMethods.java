/*
 * @author Brandon Slusser 
 * CS160-04
 * April 17, 2022
 */
public class RecursiveMethods {
   public static void main(String[] args) {
      //Some testing on the methods
	   System.out.println(byLeapsAndBounds(3));
	   System.out.println(subCount("aaaa","a"));
	   int[]sampleArr = {1,2,3,5,6,8,13};
	   System.out.println(binarySearch(sampleArr,3,0,sampleArr.length-1));

   }
   public static int byLeapsAndBounds(int n) {
     //Part I code goes here
	   //Base case
	   if(n<0) {
		   return 0;
	   }
	   //Base case
	   else if (n==0) {
		   return 1;
	   }
	   //If n is greater than 0, the recursive method is called
	   else {
		   return byLeapsAndBounds(n-1) + byLeapsAndBounds(n-2);
	   }
   }
   public static int subCount(String str, String subStr) {
     //Part II code goes here
	   //Base case
	   if(str.length()<subStr.length()|| str.length()==0) {
		   return 0;
	   }
	   //Checks if the first substring of str equals subStr
	   if(str.substring(0, subStr.length()).equals(subStr)) {
		   return subCount(str.substring(subStr.length()), subStr)+1;
	   }
	   //Calls the recursive method with one less letter
	   return subCount(str.substring(1),subStr);
   }
   public static int binarySearch(int[]array, int target, int left, int right) {
     //Part III code goes here
	   //Finds the middle index of the array
	   int middleValue = left + ((right-left)/2);
	   
	   //Base case
	   if(right<left) {
		   return -1;
	   }
	   //Base case
	   //Returns middleValue if it is the target
	   if(target == array[middleValue]) {
		   return middleValue;
	   }
	   //If the value of the middle index is greater than the target, check the left side of the array
	   else if (target < array[middleValue]) {
		   return binarySearch(array, target, left, middleValue-1);
	   }
	   
	   else {
		 //Checks the right side of the array
		   return binarySearch(array, target, middleValue + 1, right);
	   }
	   
   }

}