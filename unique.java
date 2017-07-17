package guvi;
import java.util.*;
public class unique {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int [] a=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		for(int j=0;j<a.length;j++){
			for(int k=j+1;k<a.length;k++){
			if(a[j]==a[k]){
				a[j]=0;
				a[k]=0;
		
			}
			}
		}
		for(int j=0;j<a.length;j++){

		if(a[j]!=0){
				System.out.println(a[j]);
			}
		}
	}
	}


