package com.java.learn;

public class RemovesDuplicatesBySorting {

	public static void main(String[] args) 
    {
        int a[]={3,2,1,4,2,1};
        System.out.print("Before Sorting:\n");
        for (int i=0;i<a.length; i++ )
        {
            System.out.print(a[i]+"\t");
        }
        System.out.print ("\nAfter Sorting:\n");
        //sorting the elements
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
            System.out.printf(a[i]+"\t");
        }
        
        System.out.print("\nAfter removing duplicates:\n");
        int b=0;
        a[b]=a[0];
        for(int i=0;i<a.length;i++)
        {
            if (a[b]!=a[i])
            {
                b++;
                a[b]=a[i];
            }
        }
        for (int i=0;i<=b;i++ )
        {
            System.out.print(a[i]+"\t");
        }
    }
}
