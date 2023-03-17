<<<<<<< HEAD
#include<stdio.h>
int size=0;
void swap(int *a,int *b)
{
int temp=nb;
*b=*a;
*a=temp;
}
void heapify(int array[],int size,int i)
{
if(size==1)
{
printf(" single element in the heap");
else
{
int largest=i;
int l=2*i+1;
int r=2*i+2;
if(i<size && array[l]>array[largest])
{
largest=l;
}
if(r<size && array[r]>array[largest])
{
largest=r;
}
if(largest!=i)
{
swap(& array[i],& array[largest]);
heapify(array,size,largest);
}
}
}
void insert(int array[],int new Num)
{
if(size==0)
{
array[0]=new Num;
size+=1;
}
else
{
array[size]=new Num;
size+=1;
for(int i=size/2-1;i>=0;i--)
{
heapify(array,size,i);
}
}
}
void delete root(int array[],int,Num)
{
int i;
for(i=0;i<size;i++)
{
if(Num=array[i])
break;
Swap(& array[i],& array[size-1]);
size-1=1;
}
void print array (innt array[],int size)
for(int i=0;i<size;++i)
{
printf("%d",array[i]);
printf("\n");
}
int main()
{
int array[10];
insert(array, 9);
insert(array, 3);
insert(array, 4);
insert(array, 2);
insert(array, 1);
print array(array,size)
delete root(array,size)
}
}
=======
#include<stdio.h>
int size=0;
void swap(int *a,int *b)
{
int temp=nb;
*b=*a;
*a=temp;
}
void heapify(int array[],int size,int i)
{
if(size==1)
{
printf(" single element in the heap");
else
{
int largest=i;
int l=2*i+1;
int r=2*i+2;
if(i<size && array[l]>array[largest])
{
largest=l;
}
if(r<size && array[r]>array[largest])
{
largest=r;
}
if(largest!=i)
{
swap(& array[i],& array[largest]);
heapify(array,size,largest);
}
}
}
void insert(int array[],int new Num)
{
if(size==0)
{
array[0]=new Num;
size+=1;
}
else
{
array[size]=new Num;
size+=1;
for(int i=size/2-1;i>=0;i--)
{
heapify(array,size,i);
}
}
}
void delete root(int array[],int,Num)
{
int i;
for(i=0;i<size;i++)
{
if(Num=array[i])
break;
Swap(& array[i],& array[size-1]);
size-1=1;
}
void print array (innt array[],int size)
for(int i=0;i<size;++i)
{
printf("%d",array[i]);
printf("\n");
}
int main()
{
int array[10];
insert(array, 9);
insert(array, 3);
insert(array, 4);
insert(array, 2);
insert(array, 1);
print array(array,size)
delete root(array,size)
}
}
>>>>>>> 86ccca3130f935cd2b1d5d354bc3af404536064d
}