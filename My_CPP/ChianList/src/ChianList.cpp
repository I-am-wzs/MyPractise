//============================================================================
// Name        : ChianList.cpp
// Author      : Alec.Wu
// Version     :
// Copyright   : Ericsson
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cstdlib>
#include <cstring>
using namespace std;

struct Data
{
	char key[10];
	char name[20];
	int age;
};
struct Node
{
	Data nodeData;
	Node *nextNode;
};
Node* CLAddtoEnd(Node* head,Data nodeData)
{
	Node *node,*htemp;
	node = (Node*)malloc(sizeof(Node));
	if( node == NULL )
	{
		cout << "can not malloc memory for node" << endl;
		return NULL;
	}
	else
	{
		node->nodeData = nodeData;
		node->nextNode = NULL;
		if(NULL == head)
		{
			head = node;
			return head;
		}
		htemp = head;
		while(htemp->nextNode != NULL)
		{
			htemp = htemp->nextNode;
		}
		htemp->nextNode = node;
		return head;
	}
}
Node* CLAddtoFirst(Node* head,Data nodeData)
{
	Node* node;
	node = (Node*)malloc(sizeof(Node));
	if( node == NULL )
	{
		cout << "can not malloc memory for node" << endl;
		return NULL;
	}
	else
	{
		node->nodeData = nodeData;
		node->nextNode = head;
		head = node;
		return head;
	}
}
Node* CLFindNode(Node* head,char* key)
{
	Node* htemp = head;
	while(htemp != NULL)
	{
		if(strcmp(htemp->nodeData.key,key) == 0)
		{
			return htemp;
		}
		htemp = htemp->nextNode;
	}
	return NULL;
}
Node* CLInsetNode(Node* head,char* findkey,Data nodeData)
{
	Node* node,*tempNode;
	node = (Node*)malloc(sizeof(Node));
	if( node == NULL )
	{
		cout << "can not malloc memory for node" << endl;
		return NULL;
	}
	node->nodeData = nodeData;
	tempNode = CLFindNode(head,findkey);
	if(tempNode != NULL)
	{
		node->nextNode = tempNode->nextNode;
		tempNode->nextNode = node;
	}
	else
	{
		cout << "can not find the key you want intser" << endl;
		free(node);
	}
	return head;
}
int CLDeleteNode(Node* head,char* key)
{
	Node *node,*htemp;
	htemp = head;
	node = head;
	while(htemp != NULL)
	{
		if(strcmp(htemp->nodeData.key,key) == 0)
		{
			node->nextNode = htemp->nextNode;
			free(htemp);
			return 1;
		}
		else
		{
			node = htemp;
			htemp = htemp ->nextNode;
		}
	}
	return 0;
}
int CLLength(Node* head)
{
	Node* htemp = head;
	int len = 0;
	while(htemp != NULL)
	{
		len++;
		htemp = htemp->nextNode;
	}
	return len;
}
void CLAllNode(Node* head)
{
	Node* htemp = head;
	Data nodeData;
	cout << "this Chain List contains " << CLLength(head) << " node, list below:" << endl;
	while(htemp != NULL)
	{
		nodeData = htemp->nodeData;
		cout << "node:" << nodeData.key <<" " << nodeData.name << " " << nodeData.age << endl;
		htemp = htemp->nextNode;
	}
}
int main() {
	Node *node,*head = NULL;
	Data nodeData;
	char key[10],findkey[10];

	cout<< "ChainList test,please input data like the following format: key name age " << endl;
	do
	{
		cin >> nodeData.key;
		if(strcmp(nodeData.key,"0") == 0)
		{
			break;
		}
		else
		{
			cin >> nodeData.name >> nodeData.age;
			head = CLAddtoEnd(head,nodeData);
		}
	}while(1);
	CLAllNode(head);

	cout << "demo: how to insert,input your key that you want to remove" << endl;
	return 0;
}
