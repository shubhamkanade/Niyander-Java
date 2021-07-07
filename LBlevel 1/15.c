#include<stdio.h>
int main()
{
	char str1[30];
	int count=0;
	printf("enter the string");
	//fgets(str1,30,stdin);
	scanf("%s",str1);

	count=difference(str1);
	printf("%d",count);
}
int difference(const char *str1)
{
	int count1=0,count2=0;
	while(*str1!='\0')
	{
		if(*str1=='a')
		{
			count1++;
			//str1++;
		}
		else if(*str1=='b')
		{
			//str1++;
			count2++;
			//str1++;
		}
		str1++;
		//return (count1-count2);
	}
return count1-count2;
}

