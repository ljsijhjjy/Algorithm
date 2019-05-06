class Stack:
    def __init__(self, K):
        self.top = -1
        self.list = [ 0 for _ in range(K) ]

    def push(self, value):
        if self.is_full():
            return
        self.top += 1
        self.list[self.top] = value

    def pop(self):
        if self.is_empty():
            return -1

        temp = self.list[self.top]
        self.top -= 1
        return temp

    def is_full(self):
        if self.top >= len(self.list)-1 :
            return True
        return False

    def is_empty(self):
        if self.top == -1:
            return True

        return False

ST = Stack(int(input()))
ST.push(3)
ST.push(3)
ST.push(3)
ST.push(4)
ST.push(5)
print(ST.pop())
print(ST.pop())
print(ST.list)


