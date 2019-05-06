class Node:
    def __init__(self, data, next=None):
        self.data = data
        self.next = next

class LL:
	def __init__(self):
		self.head = None
		self.tail = None

	def addFirst(self, data):
		new_node = Node(data)
		if self.head == None:
			self.head = new_node
		else:
			self.addLast(data)

	def add(self, index, data):
		temp = self.head
		for i in range(index-2):
			temp = temp.next


#       new_node.next = temp
		new_node = Node(data, temp.next)
		temp.next = new_node

	def delNode(self, index):
		temp = self.head
		if index == 1:
			self.head = self.head.next
		else:
			for i in range(index-2):
				temp = temp.next
			temp.next = temp.next.next

	def addLast(self, data):
		new_node = Node(data)
		temp = self.head
		while(temp.next != None):
			temp = temp.next

		temp.next = new_node
		self.tail = temp.next  # 유지하는 로직이 필요...

	def printList(self):
		temp = self.head
		while(temp != None):
			print(temp.data)
			temp = temp.next


import sys

M, N = map(int, sys.stdin.readline().split())

NomalList = [ i  for i in range(1, M+1)]


# Linked List 생성
LL = LL()
LL.addFirst(NomalList[0])
for i in range(1, M):
	LL.addLast(NomalList[i])


# While 반복문으로 리스트가 다 없어질때까지
while()

	# for 문으로 N번째꺼 제거 (HEAD 이용) 및 새로운 연결, 제거된 숫자  List에 넣기



# 리스트가 비어있는지 확인 후 없으면 break, 있으면 반복

#리스트 출력
