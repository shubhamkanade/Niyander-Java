#include<stdio.h>
int main()
{
	char str[30];

	printf("enter the string");
	scanf("%s",str);

	printupper(str);
	//printf("%s",str);
}
void printupper(const char *str)
{

if(str==NULL)
return;

	while(*str!='\0')
{
	if((*str>='A')&&(*str<='Z'))
	{
		printf("%c",*str);
	}
str++;
}
}

