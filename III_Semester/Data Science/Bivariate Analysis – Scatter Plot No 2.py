import seaborn as sns
import pandas as pd
import matplotlib.pyplot as plt
df = pd.read_csv("iris.csv")
sns.scatterplot(x='petal.length', y='petal.width',hue='variety', data=df)
# Placing Legend outside the Figure
plt.legend(bbox_to_anchor=(1, 1), loc=2)
plt.show()
