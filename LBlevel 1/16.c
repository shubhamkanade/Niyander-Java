#include<stdio.h>

int main()
{
	int arr[15]={0},iCnt=0,iRet=0;

	printf("enter the numbers");
	for(iCnt=0;iCnt<15;iCnt++)
	{
		scanf("%d",&arr[iCnt]);
	}

	iRet=prime(arr,15);

	printf("%d",iRet);

	return 0;
}
int prime(int *arr,int size)
{
	int iCnt=0,min=0,num=0;

	for(iCnt=0;iCnt<size;iCnt++)
	{
		num=arr[iCnt];
		for(int i=2;i<=(num/2);i++)
		{
			if(num%i!=0)
				break;


			if(i>(num/2))
			{
				arr[iCnt]=num;
			}
		}
	}		for(iCnt=0;iCnt<size;iCnt++)
	{
		if(arr[iCnt]>min)
			min=arr[iCnt];
	}

	return min;	

}










