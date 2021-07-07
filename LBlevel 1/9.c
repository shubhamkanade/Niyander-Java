#include<stdio.h>

int main()
{
int num=0,iRet=0;
printf("ente the number");
scanf("%d",&num);

iRet=largest(num);

printf("%d",iRet);

return 0;
}

int largest(int num)
{
int max=0,iDigit=0;
while(num!=0)
{
iDigit=num%10;
if(iDigit>max)
max=iDigit;
num=num/10;
}
return max;
}


























