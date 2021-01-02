import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        int a=scn.nextInt();
        int b=scn.nextInt();
        int c=0,c1=0;
        while(a>0){
            c+=a%10;
            a/=10;
        }   
        while(b>0){
            c1+=b%10;
            b/=10;
        }
        
        System.out.println(Math.max(c1,c));
    }
}