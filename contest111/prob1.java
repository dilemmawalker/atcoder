import java.io.*;
import java.util.*;
public class prob1{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
        long n=0l,m=0l;
         n=scn.nextLong();
         m=scn.nextLong();
       Long no=0l;
       double a=Math.pow(10,n);
       System.out.println(a);
       a/=m;
       a%=m;
         
        System.out.println((int)a);
    }
}