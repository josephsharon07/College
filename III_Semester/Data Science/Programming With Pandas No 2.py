import pandas as pd
data=pd.Series([0.25,0.5,0.75,1.0],index=['a','b','c','d'])

print(data)
print(data['b'])
print(data.keys())          #print the index
#print(list(data.item()))    #print the list of items along with ender

data['e']=1.25              #assigning to a new index

print(data)

print(data['a':'c'])

data[0:2]

data[(data>0.3)&(data<0.8)]

data[['a','e']]

data=pd.Series(['a','b','c'],index=[1,3,5])

print(data)
print(data[1])              #data explicit index 1
print(data[1:3])            #data from impliit index position 1 to 2 (3 exluded)

print(data.loc[1])                 #Print data st explicit index 1

print(data.loc[1:3])               #Print data at explicit index 1,3

print(data.iloc[1])                #print the data at implicit index 1

print(data.iloc[1:3])              #print the data at implicit index 1 to 3

#selection in data frames
data=pd.DataFrame({'area':area,'population':pop})

print(data['area'])         #dictionary style acces
print(data)
data.values                 #Print the values of array
data.T                      #Swap rows to columns to rows and rows to columns
data.values[0]              #Print the values in first row
data.iloc[:3,:2]            #Print the first two columns of first three  columns
data.iloc[:'Illionis',:'pop']#Print the same output

data.iloc[:3,:'pop']        #print the same result

#marking and fancy indexing
data.iloc[data.density>100,['pop','density']]
data.iloc[0,2]=90            #set the value opf first row,third column to 90
