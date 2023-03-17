import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt
df = pd.read_csv("iris.csv")
sns.countplot(x='variety', data=df)
plt.show()
