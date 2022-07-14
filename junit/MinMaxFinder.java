import java.util.Arrays;
public class MinMaxFinder {
  public static void main(String[] args){
    int[] input={56,34,7,3,54,3,34,53};
    int[] ret_Arr=findMinMax(input);
    Arrays.stream(ret_Arr).forEach(System.out::println);
  }
  public static int[] findminmax(int[] arr){
    int[] ret={Integer.MAx_VALUE,Integer.MIN_VALUE};
    for(int i=0;i<arr.length; i++){
      if(arr[i]>ret[1]){
        ret[1]=arr[i];
      }
      if(arr[i]<ret[0]){
        ret[0]=arr[i];
      }
    }
    return ret;
  }
