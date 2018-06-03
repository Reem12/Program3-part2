/*
 * This program uses greedy algorithm to find the minimum number of coins (of certain deomination)
   that add up to a given amoubt of money.
 */ 


/**
 *
 * @author reem
 */
package coin;
import java.util.Arrays;
import java.util.*;

public final class Coin {

    public static int[] Min (int coins[],int due ){
        if(coins.length == 0) {
			throw new IllegalArgumentException("Array of size 0 is not allowed");
		}
    Arrays.sort(coins);
    ArrayList<Integer> change= new ArrayList<>();
    int sum =0;
    for(int i =coins.length-1;i>=0;i--){
     if(sum+coins[i]<=due)
     {change.add(coins[i]);
     sum=sum+coins[i];}}
     int[] arr = new int[change.size()];
     for(int i = 0; i<arr.length;i++){
         arr[i] = change.get(i);}
          return arr;
    }
   
    
    }
    

