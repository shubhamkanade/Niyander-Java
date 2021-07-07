#include<stdio.h>

int main()
{

	float arr[20];

	printf("enter the elements");
	for(int iCnt=0;iCnt<20;iCnt++)
	{
		scanf("%f",arr[iCnt]);
	}

	duplicate(arr,20);

	return 0;
}
void duplicate(int *arr,int size)
{
	int iCnt=0,jCnt=0;

	for(iCnt=0;iCnt<size-1;iCnt++)
	{
		for(jCnt=iCnt+1;jCnt<size;jCnt++)
		{
			if(arr[iCnt]==arr[jCnt])
				arr[jCnt]=0.0;
		}
	}
}

