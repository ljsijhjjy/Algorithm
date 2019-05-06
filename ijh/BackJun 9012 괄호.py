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
N = sys.stdin.readline()

for i in range(N):
    GuaroLength = len(sys.stdin.readline())
    stack = Stack(GuaroLength)
    for j in range(GuaroLength):
        if j == '(':
            stack.push(j)
        elif j == ')':
            if stack.is_empty():
                return "NO"
            else:
                stack.pop()

    if stack.is_empty:
        return "YES"
    else:
        return "NO"


