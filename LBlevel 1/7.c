#include<stdio.h>
int main()
{

	int arr[30],iRet;
	int i=0;
	printf("enter the numbers");

	for(i=0;i<30;i++)
	{

		scanf("%d",&arr[i]);
	}
	//printf("enter the value to be searched");
	//scanf("%d",&value);

	iRet=difference(arr,30);
	printf("%d",iRet);
	return 0;
}
int difference(int *arr,int iSize)
{
	int max=arr[0],min=arr[0];
	int i=0,j=0;
	for(i=0;i<iSize;i++)
	{
		if(arr[i]>max)
			max=arr[i];
	}
	for(j=0;j<iSize;j++)
	{
		if(arr[j]<min)
			min=arr[j];
	}

	return (max-min);
}













































