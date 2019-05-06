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

import sys
N = sys.stdin.readline()

FaultLine = [ int(i) for i in sys.stdin.readline().split() ]
CorrectLine = [ int(i) for i in sys.stdin.readline().split() ]
stack1 = Stack(int(N))

result1 = 0
# num = 0
# while num <= int(N):
#     temp = FaultLine[num] - CorrectLine[num]
#     # print(temp)
#     if temp == 0:
#         num += 1
#         pass
#     else:
#         stack1.push(temp)
#         # print("while 끝")
#         break

for i in range(0, int(N)):
    temp = int(FaultLine[i] - CorrectLine[i])
    print(temp)
    print(stack1.list)
    a = stack1.pop()
    print(stack1.list)
    if a == -1:
        a = temp

    print("a값은 " , a)
    if temp > 0 and a > 0  or temp < 0 and a < 0:
        k = abs(temp) - abs(a)
        print("K값은 " , k)
        if k >= 0:

            stack1.push(temp)
            print("k >= 0일때 ", stack1.list)
        else:

            stack1.push(a)
            print("엘스에서", stack1.list)
    else:
        result1 += abs(a)
        stack1.push(temp)
        print("결과는", result1)

result1 += abs(stack1.pop())

print("끝")

print(result1)

