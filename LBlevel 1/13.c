#include<stdio.h>
int main()
{
	char str[30];
	int count=0;
	printf("enter the string");
	scanf("%s",str);

	count=aftercount(str);
	printf("%d",count);
}
int aftercount(const char *str)
{
	int count=0;
	if(str==NULL)
		return -1;

	if((*str>='A')&&(*str<='Z'))
	{
		str++;
	}
	else
	{
		return -1;
	}

	while(*str!='\0')
	{
		count++;
		str++;
	}
	return count;
}

















