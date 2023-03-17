import seaborn as se
import matplotlib.pyplot as plt
import pandas as pd
df = pd.read_csv("iris.csv")
def graph(y):
    se.boxplot(x="variety", y=y, data=df)
plt.figure(figsize=(10,10))
# Adding the subplot at the specified
# grid position
plt.subplot(221)
graph('sepal.length')
plt.subplot(222)
graph('sepal.width')
plt.subplot(223)
graph('petal.length')
plt.subplot(224)
graph('petal.width')
plt.show()
