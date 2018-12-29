//============================================================================
// Name        : List.cpp
// Author      : Alec.Wu
// Version     :
// Copyright   : Ericsson
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cstdlib>
using namespace std;

struct Node{
	int data;
	Node* next;
};
Node* InitList()
{
	Node* HeadNode = (Node*)malloc(sizeof(Node));
	if(HeadNode == NULL){
		cout << "can not alloc mem for node" << endl;
	}
	HeadNode->data = 0;
	HeadNode->next = NULL;
	return HeadNode;
}
Node* InserHead(Node* head,Node node)
{
	node.next = head->next;
	head->next = &node;
	return head;
}
Node* InsertHead(Node* head,int data)
{
	Node* node = (Node*)malloc(sizeof(Node));
	if(node == NULL)
	{
		cout << "can not alloc node" << endl;
		return NULL;
	}
	node->data = data;
	node->next = head;
	head = node;
	return head;
}
Node* ListReverse(Node* head)
{
	Node* present = head;
	Node* pre = NULL;
	Node* q = NULL;
	head  = NULL;
	while(present != NULL)
	{
		pre = present->next;
		present->next = q;
		q = present;
		present = pre;
	}
	head = q;
	return head;
}
Node* InsertTail(Node* head,int data)
{
	Node* node = (Node*)malloc(sizeof(Node));
	Node* tempNode;
	if(node == NULL)
	{
		cout << "can not alloc node" << endl;
		return NULL;
	}
	node->data = data;
	node->next = NULL;
	if(head == NULL)
	{
		head = node;
	}
	tempNode = head;
	while(tempNode->next != NULL)
	{
		tempNode = tempNode->next;
	}
	tempNode->next = node;
	return head;
}
int DeleteNode(Node* head,int data)
{
	Node* tempNode = head;
	Node* node;
	while(tempNode->next != NULL)
	{
		if(data == tempNode->next->data)
		{
			node = tempNode->next;
			tempNode->next = tempNode->next->next;
			free(node);
			cout << "the number: "<< data << " has been removed from the list" << endl;
			return 1;
		}
		else
		{
			tempNode = tempNode->next;
		}
	}
	if(tempNode -> next == NULL)
	{
		cout << "can not find the number: " << data <<" that you want to remove" << endl;
	}
	return 0;
}
void ListShow(Node* head)
{
	Node* p = head;
	while(p != NULL)
	{
		cout << p->data << endl;
		p = p->next;
	}
}
int main() {
	//Node* head = InitList();
	Node* head = NULL;
	int dats[] = {34,53,78,90,768,567};
	int datss[] = {56,67,23,98,909,789};
	for(unsigned int  i = 0;i< sizeof(dats)/sizeof(int);i++)
	{
		head = InsertHead(head,dats[i]);
	}
	for(unsigned int  i = 0;i< sizeof(datss)/sizeof(int);i++)
	{
		head = InsertTail(head,datss[i]);
	}
	ListShow(head);
	DeleteNode(head,53);
	head = ListReverse(head);
	cout << "========================================================" << endl;
	ListShow(head);
	return 0;
}
