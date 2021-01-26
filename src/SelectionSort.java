public class SelectionSort {

	public static void main(String[] args)
	{
	
	int a[]= {5,4,3,2,1,6,9,8,12,55,34,21};
	int temp;
	int min;
	for(int i=0;i<=a.length-1;i++)
	{
		min=i;
		for(int j=i+1;j<a.length;j++)
		{
			
			if(a[j]<a[min])
			{
			min=j;
			}
		}
	temp=a[i];
	a[i]=a[min];
	a[min]=temp;
	System.out.print(a[i]+" ");
	
	}
    
}
}
