import seaborn as sns
import pandas as pd
import matplotlib.pyplot as plt
df = pd.read_csv("iris.csv")
data = df.drop_duplicates(subset ="variety")
print(data.corr(method='pearson'))
sns.heatmap(df.corr(method='pearson'),annot = True)
plt.show()
