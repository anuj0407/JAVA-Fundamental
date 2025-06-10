import java.util.Scanner;
class SimpleIntrest{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Principal:");
int p = sc.nextInt();
System.out.print("Rate:");
float r = sc.nextFloat();
System.out.print("Time:");
float t = sc.nextFloat();
double SI = (p * r * t) / 100.0;
System.out.println(SI);
}
}