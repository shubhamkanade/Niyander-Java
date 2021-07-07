#include<stdio.h>
int main()
{

	int arr[20],value=0,iRet;
	int i=0;
	printf("enter the numbers");

	for(i=0;i<20;i++)
	{

		scanf("%d",&arr[i]);
	}
	printf("enter the value to be searched");
	scanf("%d",&value);

	iRet=search(arr,20,value);
	printf("%d",iRet);
	return 0;
}
int search(int *arr,int size,int value)
{

	int i=0,pos=0;

	for(i=0;i<size;i++)
	{
		if(arr[i]==value)
			return i+1;
	}
}






























