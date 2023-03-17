#include<stdio.h>
#include<conio.h>
#include<process.h>
#define size 10
int item;
int s[size];
int top;
void display()
{
	int i;
	if(top==-1)
		{
			printf("\nstack is empty");
			return;
		}
		printf("\nContent of stack is:\n");
		for(i=0;i<=top;i++)
			printf("%d\t",s[i]);
	}

void push()
	{
		if(top==size-1)
			{
				printf("\nStack is full");
				return;
			}
			printf("\nEnter item:\n");
			scanf("%d",&item);
			s[++top]=item;
		}
		void pop()
		{
			if(top==-1)
				{
					printf("\nstack is empty");
					return;
				}
				printf("\nDeleted item is: %d",s[top]);
				top--;
			}


void main()
{
	int ch;
	top=-1;
	clrscr();
	printf("#****Main Menu*****#");
	printf("\n1.push\n2.pop\n3.display\n4.exit\n");
	do{
		printf("\nEnter your choice:\n");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
			push();
			break;

			case 2:
			pop();
			break;

			case 3:
			display();
			break;

			case 4:
			exit(0);

			default:
			printf("\nWrong entry ! try again");
		}
	}
	while(ch<=4);
	getch();

}
