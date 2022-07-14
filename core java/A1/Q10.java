import java.util.Scanner;
public class operation {
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int[][] data=new int[3][3];
    char[] sub={'A','B','c'};
    for(int i=0;i<3;i++){
      System.out.println("Enter marks of student "+(i+1));
      for(int j=0;j<3;j++){
        data[i][j]=s.nextInt();
      }
    }
    int sum=0;
    for(int i=0;i<3;i++){
      for(int j=0;j<3;j++){
        sum=sum+data[i][j];
      }
      System.out.println("total marks of the student "+(i+1)+"="+sum);
      System.out.println("average marks of the student "+(i+1)+" ="(sum/3));
      sum=0;
    }
    int total=0;
    for(int i=0;i<3;i++){
      for (int j=0;j<3;j++){
        total=total+data[j][i];
      }
      System.out.println("total marks of subject "+sub[i]+" ="+total);
      System.out.println("average of the subject "+sub[i]+" ="+total/3);
      total=0;
    }
  }
}
