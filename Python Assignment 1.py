print("""Enter your choice-
          1. Add new element to list
          2. Create Dictionary from list
          3. Sort dictionary in descending order based on value""")
          

li=[1,45,2,76,3,89,4,2]
def fun(l):
    def one():
        n=int(input("Enter the element to add in the list-"))
        l.append(n)
        print(l)
    def two():
        dict = lambda l:{l[i]: l[i + 1] for i in range(0, len(l), 2)}
        return dict(l)
    def three():
        dict = lambda l:{l[i]: l[i + 1] for i in range(0, len(l), 2)}
        d= dict(l)
        print(sorted(d.items(), key =lambda kv:(kv[1], kv[0]),reverse=True))  
    ch=int(input("\n Enter your choice-"))
    if(ch==1):
        one()
    elif(ch==2):
        print(two())
    elif(ch==3):
        three()
        
fun(li)
        
        
    