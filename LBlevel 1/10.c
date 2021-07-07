#include<stdio.h>
typedef int BOOL;
#define TRUE 1
#define FALSE 0

int main()
{
	int num1,num2;
	BOOL bRet=TRUE;
	printf("enter the first number");
	scanf("%d",&num1);
	printf("enter the second number");
	scanf("%d",&num2);

	bRet=Reverse(num1,num2);
	if(bRet==TRUE)
		printf("1st number is reverse of 2nd number");
	else
		printf("not reverse");
	return 0;
}
BOOL Reverse(int num1,int num2)
{
	int iRev=0;

	while(num2!=0)
	{
		iRev=(iRev*10)+(num2%10);
		num2=num2/10;
	}
		//num1=iRev;
	if(num1==iRev)
		return TRUE;
	else
		return FALSE;
}



















