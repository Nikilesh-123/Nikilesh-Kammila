class calculator:
    num = 100

    def __init__(self,a, b):
        self.a = a
        self.b = b
        print("i am a new learner")

    def getdata(self):
        print("i am creating a new method in class")

    def summation(self):
        return self.a + self.b + self.num



obj = calculator(3, 4)
obj.getdata()
print(obj.summation())

obj = calculator(3, 20)
obj.getdata()
print(obj.summation())
