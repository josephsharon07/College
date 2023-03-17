#include<stdio.h>
#include<malloc.h>
#include<conio.h>
#include<stdlib.h>

struct node

{
	int value;
	struct node*next;
};

void display();
void insert();
void deletee();
int count();

typedef struct node DATA_NODE;
struct node *head_node;
struct node *first_node;
struct node *temp_node=0;
struct node *prev_node,next_node;

int data;
int main()
{
	int option = 0;
	printf("\noptions\n");
	printf("1.Insert To The Linked List\n2.Delete from the Linked List\n3.Display The Linked List\n4.Count Linked List\n5.Exit");
	scanf("Enter Your Option:%d",&option);
	switch(option)
	{
		case 1:
		insert();
		break;

		case 2:
		deletee();
		break;

		case 3:
		display();
		break;

		case 4:
		count();
		break;

		case 5:
		{
			printf("\n\t::THE PR0GRAM WILL EXIT IN 3 SECONDS::");
			return 0;
		}

		default:
		break;
	}
	return 0;
}

void insert()
{
	 printf("\nEnter The Element to Insert to the Linked List\n");
	 scanf("%d",&data);
	 temp_node=(DATA_NODE*)malloc(sizeof(DATA_NODE));
	 temp_node->value=data;
	 if(first_node==0)
	 {
		first_node=temp_node;

	 }
	 else
	 {
		head_node->next=temp_node;

	 }
	 temp_node->next=0;
	 head_node=temp_node;
	 fflush(stdin);
}

void deletee()
{
	int countvalue,pos,i=0;
	countvalue=count();
	temp_node=first_node;
	printf("\nDisplay Linked list:'\n");
	display();
	printf("\nEnter The Postion for Delete The Element:\n");
	scanf("%d",&pos);

	if(pos>0&&pos<=countvalue)
		{
			if (pos==1)
			{
				temp_node=temp_node->next;
				first_node=temp_node;
				printf("/nDeleted Sucessfully\n\nb");
			}
			else
			{
				while(temp_node!=0)
					{
						if(i==(pos-1))
						{
							prev_node->next=temp_node->next;
							if(i==(countvalue-1))
							{
								head_node=prev_node;
							}
							printf("\nDeleted Sucessfully\n\n");
							break;
						}
						else
							{
								i++;
								prev_node=temp_node;
								temp_node=temp_node->next;

							}

					}
					}
			}
			else
			{
				printf("\n INVALID POSITION\n");
			}
		}

void display()
{
	int count=0;
	temp_node=first_node;
	printf("\nDisplay Linked List\n");
	while(temp_node!=0);
	{
		printf("#%d#",temp_node->value);
		count++;
		temp_node=temp_node->next;
	}
	printf("\n No of items in the Linked List: %d\n",count);
}


int count()
{
	int count=0;
	temp_node=first_node;
	while(temp_node!=0)
		{
			count++;
			temp_node=temp_node->next;
		}
		printf("\n No of items in the linked list: %d\n",count);
		return count;
}



