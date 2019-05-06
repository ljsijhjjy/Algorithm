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
        # return temp

    def is_full(self):
        if self.top >= len(self.list)-1 :
            return True
        return False

    def is_empty(self):
        if self.top == -1:
            return True

        return False

import sys
n = sys.stdin.readline()
stack = Stack(len(n))
i = 0
stick = 0
result = 0

while True:

    if n[i:i + 2] == '()':
        result += stick
        i += 2
    elif n[i] == '(':
        stick += 1
        result += 1
        stack.push(1)
        i += 1
    elif n[i] == ')':
        stick -= 1
        stack.pop()
        i += 1

    if i == len(n):
        break

print(result)