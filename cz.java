package guvi;
import java.util.*;
public class cz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,m1=0,m2=0;
		int i,j,s=0;
		System.out.println("Enter the Array size:");
		n=sc.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{ if(i!=j)
			{
				         int sum=a[i]+a[j];
				         if(s==0)
				             s=sum;
				         if(sum > 0){
				             if(sum < s ){
				                 s=sum;
				                 m1=a[i];
				                 m2=a[j];
				             }
				         }
				         else if(sum < 0){
				             if(-sum <s){
				                 s=sum;
				                 m1=a[i];
				                 m2=a[j];
				             }
				         }
				     }
				 }
		}

				    System.out.println(m1+"\t "+m2);
			}
	}