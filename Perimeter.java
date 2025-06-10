import java.util.Scanner;
class Perimeter{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Length:");
int l = sc.nextInt();
System.out.print("Width:");
int w = sc.nextInt();
int p = 2 * (l + w);
System.out.println(p); 
}
}