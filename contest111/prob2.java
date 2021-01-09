import java.io.*;
import java.util.*;
public class prob2{
    public static Scanner scn=new Scanner(System.in);
    public static void main(String[]args){
      int n=scn.nextInt();
      HashMap<Integer,Integer>map=new HashMap<>();
      pair[]arr=new pair[n];

      for(int i=0;i<n;i++){
        int a=scn.nextInt();
        int b=scn.nextInt();
        arr[i]=new pair(a,b);
      }
      int[][]dp=new int[n+1][n+1];
      int c=solve(arr,0,map,dp);
     
        System.out.println(c);
    }
    public static int solve(pair[]arr,int idx,HashMap<Integer,Integer>map,int[][]dp){
        if(idx==arr.length)
        return map.size();

        int c=0,c1=0,c2=0;

        if(dp[idx][map.size()]!=0)
        return dp[idx][map.size()];

        int a=arr[idx].a;
        boolean flag=false;

        if(!map.containsKey(a)){
        map.put(a,1);
        flag=true;
        }
        c1=solve(arr,idx+1,map,dp);
        if(flag)
        map.remove(a,1);

        flag=false;
        int b=arr[idx].b;
        if(!map.containsKey(b)){
            map.put(b,1);
            flag=true;
            }
        c2=solve(arr,idx+1,map,dp);
        if(flag)
        map.remove(b,1);

        return dp[idx][map.size()]=Math.max(c1,c2);
    }
    public static class pair{
        int a=0;
        int b=0;
        pair(int a,int b){
            this.a=a;
            this.b=b;
        }
    }
}