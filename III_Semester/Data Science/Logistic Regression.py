

# importing libraries
import statsmodels.api as sm
import pandas as pd

# loading the training dataset
df = pd.read_csv('Pima Indian Diabetes.csv')
print(df)
# defining the dependent and independent variables
#Xtrain = df.iloc[:,:-1].values

Xtrain = df[['Pregnancies', 'Glucose', 'BloodPressure','SkinThickness','Insulin','BMI','DiabetesPedigreeFunction','Age']] 
print(Xtrain)
#ytrain = df.iloc[:,7].values

ytrain = df[['Class']]
print(ytrain)
# building the model and fitting the data
log_reg = sm.Logit(ytrain, Xtrain).fit()
# printing the summary table
print(log_reg.summary())
