import pandas as pd

# Reading the CSV file
df = pd.read_csv("iris.csv")
print(df)

# Printing top 5 rows
print(df.head())

#Print the shape 
print(df.shape)

# print the information about the data
print(df.info())

#statistical summary of the data set
print(df.describe())

#print the count of rows
print(df.count())

#print the mean
print(df.mean())

#print the median
print(df.median())

#print the variance
print(df.var())

#print the standard deviation
print(df.std())

#print the quantiles
print(df.quantile(0.1))     #10thpercentile
print(df.quantile(0.95))    #95thpercentile
print(df.quantile(0.75))    #75thpercentile
print(df.quantile(0.25))    #25thpercentile

#interquartile range(IQR)
print(df.quantile(.75) - df.quantile(.25))

#print the maximum and minimum values
print(df.max())
print(df.min())

#divide the data into groups based on the column "Variety"
iris_grps = df.groupby("variety")
print(iris_grps.mean())
print(iris_grps.quantile(0.75))
print(iris_grps.quantile(0.75)-iris_grps.quantile(0.25))
print(iris_grps.describe())
