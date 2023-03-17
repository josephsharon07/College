import seaborn as sns
import matplotlib.pyplot as plt
import pandas as pd
df = pd.read_csv("iris.csv")
sns.pairplot(df,hue='variety', height=2)
plt.show()
