#include<stdio.h>

int add(int no1 ,int no2)
{
	return no1+no2;
}

int main()
{
	int no1=0, no2=0,ret=0;

	printf("enter the 2 no to add");

	scanf("%d%d",&no1,&no2);

	ret=add(no1,no2);
	printf("the addtion is :%d",ret);

	return 0;
}
