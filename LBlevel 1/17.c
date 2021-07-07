#include<stdio.h>
void print(int*,int*,int);
int main()
{

	int arr1[15]={0};
	int arr2[15]={0};

	printf("enter the numberes from set1");
	for(int i=0;i<15;i++)
	{
		scanf("%d",&arr1[i]);
	}
	printf("enter the numberes from set2");
	for(int i=0;i<15;i++)
	{
		scanf("%d",&arr2[i]);
	}
	print(arr1,arr2,15);
}

void print(int *arr1,int *arr2,int size)
{
	for(int i=0;i<size;i++)
	{
		if(arr1[i]==arr2[i])
		{
			printf("%d%d",arr1[i],arr2[i]);
		}
	}
}
