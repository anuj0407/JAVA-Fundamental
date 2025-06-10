import java.util.*;
class Power{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.print("Base:");
int b = sc.nextInt();
System.out.print("Exponent:");
int e = sc.nextInt();
double res = Math.pow(b ,e );
System.out.println(res);
}
}