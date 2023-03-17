import pandas as pd
import uci_dataset as ds
blood_transfussion_uci_url="https://archive.ics.uci.edu/ml/machine-learning-databases/blood-transfusion/transfusion.data"
df=pd.read_csv(blood_transfussion_uci_url)
print(df)
load_transfusion_df=ds.load_blood_transfusion()
print(load_transfusion_df)
cervical_cancer_df=ds.load_cervical_cancer()
print(cervical_cancer_df)
diabetic_df=ds.load_diabetic()
print(diabetic_df)
obisity_lever_df=ds.load_obesity_levels()
print(obisity_lever_df)
chronic_kidney_disease_df=ds.load_chronic_kidney_disease()
print(chronic_kidney_disease_df)


