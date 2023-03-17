import numpy as np

#Create an Array
a1=np.array([1,4,2,5,3])
print("An Simpel Array:\n")
print(a1)

#Create an simple array of type "float 32"
a2=np.array([1.1,2.3,3.6,4.8], dtype="float32")
print("An Simple Array of Float32:\n")
print(a2)
print("\n")

#Create a  multidimentional array
a3=np.array([range(i,i+3) for i in [2,4,6]])
print("A Multidimentional Array:\n")
print(a3)
print("\n")

#Craete a length 10 integer array filled with zeros
a4=np.zeros(10,dtype='int')
print("Length 10 integer array filled with zeros:\n")
print(a4)
print("\n")

#Create 3×5 floating point array filled woth 1's
a5=np.ones((3,5),dtype='int')
print("A 3×5 floating point array filled woth 1's:\n")
print(a5)
print("\n")

#Create a 3×5 Array filled with 3.14
a6=np.full((3,5),3.14)
print("A 3×5 Array filled with 3.14:\n")
print(a6)
print("\n")

#Create an array filled with linear sequence starting at 0 ending at 20 stepping by 2
a8=np.arange(start=0, stop=20, step=2)
print("An array filled with linear sequence starting at 0 ending at 20 stepping by 2:\n")
print(a8)
print("\n")

#Create an array of five value evenly spaced between 0 to 1
a7=np.linspace(0, 1, 5)
print("An array of five value evenly spaced between 0 to 1:\n")
print(a7)
print("\n")

#Create an array of 3×3 evenly spaced 
a9=np.random.random((3,3))
print("An array of 3×3 evenly spaced:\n")
print(a9)
print("\n")

#Create an array of 3×3 evenly spaced betweeen 0 to 1
a10=np.random.normal(0,1,(3,3))
print("An Array of 3×3 evenly spaced between 0 to 1:\n")
print(a10)
print("\n")

#Create an array of 3×3 Array of random integer in the internal [0,10]
a11=np.random.randint(0,10,(3,3))
print("An array of 3×3 Array of random integer in the internal [0,10]\n")
print(a11)
print("\n")

#Create a 3×3 identity matrix
a12=np.eye(3)
print("3×3 Identity Matrix:\n")
print(a12)
print("\n")

#Create an uninitiaiaized array of the integers
a13=np.empty(3)
print("Uninitiaiaized array of the integers:\n")
print(a13)
print("\n")

#Create single dimentional array, Two Dimentional Array and print the array, no of dimension size of each dimension, Total size Of the array

np.random.seed(0)

x1=np.random.randint(10,size=6)
x2=np.random.randint(10,size=(3,4))
x3=np.random.randint(10,size=(3,4,5))

print("\nX1 ndim", x1.ndim)
print("\nX1 Shape", x1.shape)
print("\nX1 Size", x1.size)
print("\nX2 ndim", x2.ndim)
print("\nX2 Shape", x2.shape)
print("\nX2 Size", x2.size)
print("\nX3 ndim", x3.ndim)
print("\nX3 Shape", x3.shape)
print("\nX3 Size", x3.size)

#Print The datatype of the arrays
print("\nData Type", x3.dtype)

#Print the size of each array in bytes
print("\nItem Size",x3.itemsize,"bytes")

#Print the total size of array in bytes
print("\nnbytes", x3.nbytes,"bytes")
