
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int n,t,i,j,index,result[],L[],R[],re[],r;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		int max;
		n=sc.nextInt();
		result=new int[n];
		if(t>=1&&t<=5){
		    
		if(n>=1&&n<=100){
		for(i=1;i<=t;i++)
		{
		    L=new int[n];
		    R=new int[n];
		    re=new int[t];
		    for(j=1;j<=n;j++)
		    {
		    	
		        L[j]=sc.nextInt();
		        
		    }
		    for(j=1;j<=n;j++)
		    {
		        R[j]=sc.nextInt();
		    }
		    
	        max=L[1]*R[1];
	        index=1;
	        r=R[1];
		    for(j=1;j<=n;j++)
        {
            re[j]=L[j]*R[j];
            if(re[j]>=max)
            {
                if(re[j]==max)
                {
                   if(R[j]>r)
                   {
                       
                           index=j;
                           r=R[j];
                       
                   }
                }
                else{
                max=re[j];
                index=j;
                r=R[j];
                }
            }
            
        }
		    result[i]=index;
		}
		
		}
		for(i=1;i<=t;i++)
	      {
	    	  System.out.println(result[i]);
	      }
	}
      
		sc.close();
	}

}
