import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
       int n=scn.nextInt();
       pair[]arr=new pair[n];
       
       for(int i=0;i<n;i++){
           int a=scn.nextInt();
           int b=scn.nextInt();
           arr[i]=new pair(a,b);
       }
       int c=0;
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
            pair a=arr[i];
            pair b=arr[j];
            double val=0.0;
            val=(b.b-a.b)*1.0/(b.a-a.a)*1.0;
            if(val>=-1 && val<=1)
            c++;
           }
       }
       System.out.println(c);
    }
    public  static class pair{
        int a=0;
        int b=0;
        pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
}