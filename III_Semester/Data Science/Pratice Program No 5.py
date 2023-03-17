num=int(input("Enter number:\t"))
temp=num
rev=0
while(num>0):
    dig=num%10
    rev=rev*10+dig
    num=num//10
if(temp==rev):
    print("The number is a palindrome!")
else:
    print("The number isn't a palindrome!")