import java.util.*;
class array_farenhite
{
    public static void main (String args [])
    {
        double array [] = new double [10];
        Scanner sc = new Scanner (System.in);
        for(int i=0;i<10;i++){
           array[i]= sc.nextDouble();
           
        }
        for (int i=0;i<10;i++){
             double c=((array[i]-32)*5)/9.0;
            System.out.println(c);
        }
    }
}