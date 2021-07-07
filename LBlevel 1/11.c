#include<stdio.h>
int main()
{
	char str[30];

	printf("enter the string");
	scanf("%s",str);

	Toggle(str);
	printf("%s",str);
}
void Toggle( char *str)
{
	int i=0;
	
		for(i=0;i<sizeof(str);i=i+2)
{
		if((str[i]>='A')&&(str[i]<='Z'))
		{
			str[i]=str[i]+32;
		}
		else if((str[i]>='a')&&(str[i]<='z'))
		{
			str[i]=str[i]-32;
		}
	}
}

