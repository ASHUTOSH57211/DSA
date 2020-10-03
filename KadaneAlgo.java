/*
Authored by Ashutosh Prasad
kadane algo is used to find the maximum contiguous sub-array sum from an array.

How it works?
it take a variable in which it stores the maximum element so far it has found and maximum element ending in the sub-array.

Explanation
suppose the array is [-2,1,3,4,-1,2,1,-5,4]

- it starts by storing the 1st element as the maximum sum found so far.(which is -2 here)
- then it stores maximum element found so far int array(here also it is -2)
- when it goes to the next element again checks for the maximum element between the previous element
    and the ADDITION of (previous and current) element and stores it in the new maxEndinghere.
    (in this case it is -2+1= -1)
- then it finds the maximum between the max elemnt found so far(which was -2 ) and new max ending here(which is -1).
- this way the loop continues till the last
 */

import java.util.*;
public class kadaneAlgo {
    static int kadane(int[] a){

        int x = a.length;
        int maxSofar = a[0];                //initialised the 1st element
        int maxEndingHere = a[0];           //initialised with the 1st element
        for(int i =1;i < x;i++){            //loops starts from the 2nd element by compaing with the previous element
            maxEndingHere = Math.max(a[i],maxEndingHere+a[i]);
            maxSofar = Math.max(maxSofar,maxEndingHere);
        }
        return maxSofar;                    //the max sum is returned.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter sze of array");
        int N = sc.nextInt();               //initialise the size
        int[] arr = new int[N];             //array declaration

        for(int i = 0; i<N; i++){           //insering elemnts in array
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<N; i++){           //printing elements from the array
            System.out.print(arr[i]+" ") ;
        }
        //inside arr [-2,1,3,4,-1,2,1,-5,4]
        System.out.println();
        System.out.println("maxsum is ");
       int maxsum =  kadane(arr);           //calling the function
        System.out.println(maxsum);         //printing the sum
    }

}
