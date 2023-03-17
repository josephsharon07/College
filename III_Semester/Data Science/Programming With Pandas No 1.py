from operator import index
import pandas as pd
import numpy as np

data=pd.series([0.25,0.5,0.75,1.0])
print(data)         #print both values and index attributes

print(data.index)    #print the start ,step of index and step size 

print(data[1])      #print the first element

print(data[1:3])    #Print the element at position 1 and 3

data=pd.series([0.25,0.5,0.75,1.0],index=['a','b','c','d'])

print(data)         #print the data array with strings and index


print(data['b'])