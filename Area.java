import java.util.Scanner;
public class Area{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double R = sc.nextDouble();
    double pi = 3.141592653;
    double area = pi * R * R;
    System.out.println("%.9f\n",area);
    sc.close();
  }
}