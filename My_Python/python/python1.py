class Student:
    def __init__(self,name,age):
        self.name = name
        self.age = age
        
        self.setName(name)
        
    def intro(self):
        print("hai ,my name is {0}".format(self.name))
        
    def setName(self,name):
        self.name = name.upper()

s1 = Student("Liu YONG",19)
s1.intro()

