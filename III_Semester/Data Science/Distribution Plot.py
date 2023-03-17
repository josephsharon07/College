import seaborn as sns
import pandas as pd
import matplotlib.pyplot as plt
df = pd.read_csv("iris.csv")
plot = sns.FacetGrid(df, hue="variety")
plot.map(sns.distplot, "sepal.length").add_legend()
plot = sns.FacetGrid(df, hue="variety")
plot.map(sns.distplot, "sepal.width").add_legend()
plot = sns.FacetGrid(df, hue="variety")
plot.map(sns.distplot, "petal.length").add_legend()
plot = sns.FacetGrid(df, hue="variety")
plot.map(sns.distplot, "petal.width").add_legend()
plt.show()