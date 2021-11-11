import java.util.*;
class Tdsym
{
              public static void main(String arg[])
              {
                     int[][] a=new int[10][10];
	   int[][] T=new int[10][10];
	   int i,j,n,m,o=0;
                     Scanner t=new Scanner(System.in);
                     System.out.println("Enter n");
                     n=t.nextInt();
	   System.out.println("Enter m");
                     m=t.nextInt();
	   System.out.println(" enter array A matrix value");
                    for (i=0;i<n;i++)
                    {
                          for(j=0;j<m;j++)
                          {
	          
                             a[i][j]=t.nextInt();
	          
	         }
                          
                     }
	  for(i=0;i<n;i++)
                   {
                        for(j=0;j<m;j++)
                        {
                           T[i][j]=a[j][i]; 
	         
                          }
                      
                     }
	System.out.println("original matrix");
	for (i=0;i<n;i++)
                    {
                          for(j=0;j<m;j++)
                          {
	          System.out.print(a[i][j]+"     ");
	           
	         }
	        System.out.println();
	}
	System.out.println("Tarnspose matrix");
	 for (i=0;i<n;i++)
                    {
                          for(j=0;j<m;j++)
                          {
	          
	           System.out.print(T[i][j]+"     ");
	         }
	        System.out.println();
	}
	 for (i=0;i<n;i++)
                    {
                          for(j=0;j<m;j++)
                          {
	           if(a[i][j]==T[i][j])
	           {
	             o=o+1;
	           }
	        }
	   }
	if(o==1)
	{
	  System.out.print("symmetric matrix");
	}
	else{
	          System.out.print("not symmetric matrix");
	      }
       }
}

          
