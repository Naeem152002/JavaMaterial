package com.hashset;

public class Test{

    public static  int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                int a[]={i+1,j+1};
                return a;
            }
            if(numbers[i]+numbers[j]<target){
                i++;
      
            }else{
        j--;
            }
        }
        return null;
    }

  public static void main(String args[]){
   int numbers[]= {2,7,11,15};
   System.out.println(twoSum(numbers,9));
  }  
}
//public int[] twoSum(int[] numbers, int target) {
//    for(int i=0;i<numbers.length;i++){
//         for(int j=i+1;j<numbers.length;j++){
//             if(numbers[i]+numbers[j]==target){
//                  int a[]={i+1,j+1};//is question main index 1 se start ho raha hain 
//                 return a;
//             }
//         }
//    }
//    return null;
//}}



