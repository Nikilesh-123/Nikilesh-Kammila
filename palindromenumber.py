# the palindrome in numeric
# for numeric enter the  numeric character
# for example number

number = int(input("enter the string"))
string = str(number)
rev_string= string[: : -1]
print("reversed string:", rev_string)
if string == rev_string:
    print("the num is palindrome: ")
else:
    print("the num is not a palindrome:")
