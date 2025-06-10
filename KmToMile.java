import java.util.Scanner;
class KmToMile{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
float km = sc.nextFloat();
double mile = (km * 0.621371);
System.out.println(mile);
}
}