#include<stdio.h>

int main()
{
int no1, no2;
printf("enter the two numbers");
scanf("%d%d",&no1,&no2);

swap(no1,no2);

return 0;
}

void swap(int no1,int no2)
{

int temp;

temp=no1;
no1=no2;
no2=temp;
printf("%d %d",no1,no2);
}
