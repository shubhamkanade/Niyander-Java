#include<stdio.h>

int main()
{
	int arr[50],ret=0,i=0;

	printf("enter the numbers");
	for(i=0;i<50;i++)
	{
		scanf("%d",&arr[i]);
	}

	combination(arr,50);
}
void combination(int *arr,int size)
{

	int i=0,j=0;

	for(i=0;i<size-1;i++)
	{
		for(j=i+1;j<size;j++)
		{
			if(arr[i]+arr[j]==51)
				printf("%d %d",arr[i],arr[j]);
		}
	}
}




























