import java.util.*;
public class que{
public static void main(String[] args){
Scanner sx=new Scanner(System.in);
int n=sx.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++){
a[i]=sx.nextInt();
}
int max=0;
int c=0;
for(int i=0;i<n;i++){
if(max<a[i]){
c=max;    
max=a[i];
}
if(c>a[i] && c<max){
    c=a[i];
}
}
System.out.println(c);
}
}

