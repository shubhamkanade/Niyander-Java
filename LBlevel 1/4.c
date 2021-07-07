#include<stdio.h>
int main()
{
	char arr[15],i=0;
	int iret=0;
	printf("enter the 15 characters");
	for(i=0;i<15;i++)
	{
		scanf(" %c",&arr[i]);
	}

	iret=vowels(arr,15);
	printf("%d",iret);
}
int vowels(char *arr,int size)
{

	int icnt=0;
	int count=0;
	if((arr==NULL)||(size<=0))
	return;
	for(icnt=0;icnt<size;icnt++)
	{

		if((arr[icnt]=='a')||(arr[icnt]=='e')||(arr[icnt]=='i')||(arr[icnt]=='o')||(arr[icnt]=='u')||
				(arr[icnt]=='A')||(arr[icnt]=='E')||(arr[icnt]=='I')||(arr[icnt]=='O')||(arr[icnt]=='U'))
		{
			count++;

		}
	}
	return count;
}

































