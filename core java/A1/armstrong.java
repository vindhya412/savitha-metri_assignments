import java.util.Scanner;
public Class armstrong {
  public static void main(String[] args){
    Scanner Sc=new Scanner(System.in);
    int arm= s.nextInt();
    int temp=arm;
    int sum=0;
    while(temp>0){
      int dif=temp%10;
      sum=sum+dif*dif*dif;
      temp/=10;
    }
    if(arm==sum){
      System.out.println("Armstrong number");
    }
    else{
      System.out.println("not armstrong number");
    }
  }
}
      
