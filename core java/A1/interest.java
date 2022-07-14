import java.util.scanner;
public class interest {
  public static void main(String[] args) {
    Scanner s= new Scanner(system.in);
    System.out.println("enter your>principle amount >interest rate>tme in years");
    int p=s.nextInt();
    double r=s.nextDouble();
    int t=s.nextInt();
    double SI=P*t*R*0.01;
    double CI=P*math.pow(1+r*0.01,t)-p;
    System.out.println("simple interest:"+(int)SI);
    System.out.printn("compound interest:"+(int)CI);
  }
}
  
