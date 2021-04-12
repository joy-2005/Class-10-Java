import java.util.*;
class cricket_pg287
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        int run[]=new int [11];
        String name [] = new String [3];
        for(int i=0;i<3;i++){
            name[i]=sc.next();
            run[i]=sc.nextInt();
            
        }
        int max = run[0];
        for(int i=1;i<3;i++){
            if(max<run[i]){
                max = run[i];
            }
        }
        int index = 0;;
        for (int i=0;i<3;i++){
            if(max==run[i]){
                index = i;
            }
            
        }
        System.out.println(name[index]+ "=" +max );
    }
    
}
