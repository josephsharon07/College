<<<<<<< HEAD
#include<math.h>
#include<stdio.h>
void insertionSort(int arr[],int n)
{
int i,key,j;
for(i=1;i<n;i++)
{
key=arr[i];
j=i-1;
while(j>=0 && array[j]>key)
{
arr[j+1]=arr[j];
j=j-1;
}
arr[j+1]=key;
}
}
void swap(int xp,int yp)
{
temp=xp;
xp=yp;
yp=temp;
}
void selectionsort(int arr[],int n)
{
int i,j,min_id;
for(i=0;i<n-1;i++)
{
min_id=i;
for(j=i+1;j<n;j++)
{
if(arr[j]<arr[min_id])
{
min_id=j;
if(min_id!=i)
{
swap(& arr[min_id],& arr[i]);
}
}
int main()
{
int arr[]={6,5,7,9,10};
int n=sizeof(arr)/sizeof(arr[0]);
int choice;
printf("Enter your choice\n 1.insertion sort\n 2.selection sort);
scanf("%d",&choice);
switch(choice)
{
case 1:
insertion sort(arr[],n);
break;
case 2:
seletion sort(arr[],n);
break;
default;
exit(0);
}
}
for(int i=0;i<size;i++)
{
cout<<arr[i]<<*;
cout<<and 1;
=======
#include<math.h>
#include<stdio.h>
void insertionSort(int arr[],int n)
{
int i,key,j;
for(i=1;i<n;i++)
{
key=arr[i];
j=i-1;
while(j>=0 && array[j]>key)
{
arr[j+1]=arr[j];
j=j-1;
}
arr[j+1]=key;
}
}
void swap(int xp,int yp)
{
temp=xp;
xp=yp;
yp=temp;
}
void selectionsort(int arr[],int n)
{
int i,j,min_id;
for(i=0;i<n-1;i++)
{
min_id=i;
for(j=i+1;j<n;j++)
{
if(arr[j]<arr[min_id])
{
min_id=j;
if(min_id!=i)
{
swap(& arr[min_id],& arr[i]);
}
}
int main()
{
int arr[]={6,5,7,9,10};
int n=sizeof(arr)/sizeof(arr[0]);
int choice;
printf("Enter your choice\n 1.insertion sort\n 2.selection sort);
scanf("%d",&choice);
switch(choice)
{
case 1:
insertion sort(arr[],n);
break;
case 2:
seletion sort(arr[],n);
break;
default;
exit(0);
}
}
for(int i=0;i<size;i++)
{
cout<<arr[i]<<*;
cout<<and 1;
>>>>>>> 86ccca3130f935cd2b1d5d354bc3af404536064d
}