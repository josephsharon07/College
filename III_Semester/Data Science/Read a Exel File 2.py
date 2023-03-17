import pandas as pd

sheet1 = pd.read_excel("exel2.xlsx",sheet_name=0,index_col=0)
sheet2 = pd.read_excel("exel2.xlsx",sheet_name=1,index_col=0)

newdata=pd.concat([sheet1,sheet2])
print(newdata)