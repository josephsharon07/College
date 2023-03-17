import numpy as np
x1=np.random.randint(10,size=6)
print(x1)
print("\n")

#Print the 0th Element In The Array
print(x1[0])
print("\n")

#Print the 4th Element In The Array
print(x1[4])
print("\n")

#Print the last Element In The Array
print(x1[-1])
print("\n")

#Print the second element from the last
print(x1[-1])
print("\n")

#Access Element in mult dimentional Array
x2=np.random.randint(10,size=(3,4))
print(x2)
print("\n")

#Print the Element at 0,0 position
print(x2[0,0])
print("\n")

#Print the element In The 2,0 position
print(x2[2,0])
print("\n")

#Print the element In The 2,-1 position
print(x2[0,-1])
print("\n")

#Modify The Value using index notation
x2[0,0]=12

#Array String
#Create an array wth 0 element starting from 0
x=np.arange(10)
print(x)
print("\n")

#To print First five Elements
print(x[:5])
print("\n")

#To Print elements after index 5
print(x[5:])
print("\n")

#To Print Elements from 4 to 7
print(x[4:7])
print("\n")

#Print Every other element(one after another)
print(x[::2])
print("\n")

#To Print every ther element starting at index 1
print(x[1::2])
print("\n")

#To Print Element in reverse order
print(x[::-1])
print("\n")

#TO Print Every Other from index 5 in reverse
print(x[5::-2])
print("\n")

#To Print two rows, three columns in multidimentional array
print(x2[:2, :3])
print("\n")

#To Print all rows and every other columns
print(x2[:3, ::2])
print("\n")

#To Print array in reverse order
print(x2[::-1, ::-1])
print("\n")

#To Print first column of x2
print(x2[:, 0])
print("\n")

#To Print first row of x2
print(x2[0, :])
print("\n")

#To Extract 2×2 array | subarrays as no copy views
x2_sub=x2[:2, :2]
print(x2_sub)
print("\n")
x2_sub[0,0]=99
print(x2_sub)
print("\n")
print(x2)
print("\n")

#Copies Of Arrays
x2_sub_copy=x2[:2,:2].copy()
print(x2_sub_copy)
print("\n")
print(x2)
print("\n")