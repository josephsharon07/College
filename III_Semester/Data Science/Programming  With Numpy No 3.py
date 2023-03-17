import pandas as pd
data=pd.Series([0.25,0.5,0.75,1.0],index=['a','b','c','d'])

print(data)
print(data['b'])
print(data.keys())  #print the index
print(list(data.item()))    #print the list of items along with ender

data['e']=1.25  #assigning to a new index

print(data)

print(data['a':'c'])

data[0:2]

data[(data>0.3)&(data<0.8)]

data[['a','e']]

data=pd.Series(['a','b','c'],index=[1,3,5])

print(data)
print(data[1])  #data explicit index 1
print(data[1:3])    #data from impliit index position 1 to 2 (3 exluded)

data.loc[1]     #Print data st explicit index 1

data.loc[1:3]   #Print data at explicit index 1,3

data.iloc[1]    #print the data at implicit index 1

data.iloc[1:3]  #print the data at implicit index 1 to 3

#selection in data frames
data=pd.DataFrame({'area':area;'ppopulation':pop}

print(data['area']) #dictionary style acces
print(data)