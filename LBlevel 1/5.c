#include<stdio.h>
int main()
{
	int no1=0,no2=0;


	printf("enter the range ");
	scanf("%d%d",&no1,&no2);

	even(no1,no2);
	return 0;

}
void even(int no1,int no2)
{

	int i=0;

	for(i=no1;i<=no2;i++)
	{
		if(i%2==0)
			printf("%d ",i);
	}
}
