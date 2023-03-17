#include <stdio.h>
#include <conio.h>

struct node
{
	float coef;
	int expo;
	struct node*next;
};

struct node*create(struct node*);
struct node*insert_s(struct node*,float,int);
struct node*insert(struct node*,float,int);

void display(struct node*ptr);
void poly_add(struct node*,struct node*);
void poly_sub(struct node*, struct node*);
void poly_multi(struct node*, struct node*);

void main()
{
	struct node*p1=NULL,P2=NULL;
	printf("Enter Ploynomial 1: \n");
	P1=create(P1);
	printf("Enter Ploynomial 2:\n");
	P2=create(P2);
	printf("Polynomial 1 is : ");
	display(P1);
	printf("Polynomial 2 is : ");
	display(P2);

	poly_add(P1,P2);
	poly_sub(P1,P2);
	poly_multi(P1,P2);
}

	struct node*create(struct node*strat)
	{
		int i ,n ex;
		float co;
		printf("Enter The Number of terms:");
		scanf("%d",&n);
		for(i=1;i<=n;i++)
		{
			printf("Enter coefficient for term %d : ",i);
			scanf("%f",&co);
			printf("Enter Exponent For Term %d :",i);
			scanf("%d",&ex);
			start=insert_s(start,co,ex);
		}

		return start
		}

		struct node*insert_s(struct node*strat,float,co,int ex)
		{
		struct node*ptr,*tem;
		tmp=(struct node*)malloc(sizeof(struct node));
		tmp->coef=co;
		tmp->expo+ex;
		if(start=NULL||ex->start->expo>=ex);
		{
		tmp->next=start;
		start=tmp;
		}
		
	
		else
		{
			ptr=start;
			while(ptr->!=NULL&&ptr->next->expo>+ex)
			ptr=ptr->next;
			tmp->next=ptr->next;
			ptr->next=tmp;
		}
		return start;
	}


	struct node*insert(structy node*start,flot,co,int ex)
	{
	struct node*ptr,*tmp;
	tmp=(struct node*)malloc (sizeof(struct node));
	tmp->coef=co;
	tmp->expo=ex;
	if(start == NULL)
	{
		tmp->next=start;
		start=temp;
	}
	else
	{
		ptr=start;
		while(ptre->next!=NULL)
			ptr=ptr->next;
		tmp->next=ptr->next;
		ptr->next=tmp;
	}
return start;
	}

	void display(struct node*ptr)
	{
		if(ptr==NULL)
		{
			printf("zero Polynomial");
			return;
		}
		while(prt!=NULL)
		{
			printf("%fx^%d",ptr->coef,ptr->expo);
			ptr=ptr->next;
			if(ptr!=NULL)
				printf("+");
			else
				printf("\n");
		}
	}

	void poly_add(struct node*p1,struct node*p2)
	{
		struct node*p3;
		p3=NULL;
		while(P1)

	}

			
