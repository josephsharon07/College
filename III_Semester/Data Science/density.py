import matplotlib as mpl
import matplotlib.pyplot as plt
import numpy as np
plt.style.use('classic')
def f(x, y):
    return np.sin(x) ** 10 + np.cos(10 + y * x) * np.cos(x)

x = np.linspace(0, 5, 50)
y = np.linspace(0, 5, 40)

X, Y = np.meshgrid(x, y)
Z = f(X, Y)
#plt.contour(X, Y, Z, colors='black');
#plt.contour(X, Y, Z, 20, cmap='RdGy');
plt.contourf(X,Y,Z,20,cmap='RdGy')
plt.show()