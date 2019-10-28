/*
 ============================================================================
 Name        : CombineLinkedList.c
 Author      : AlecWu
 Version     :
 Copyright   : Your copyright notice
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>
int xx = 10;
typedef struct Node{
	int a;
	struct Node *next;
}ListNode,*LinkList;

ListNode* creatLinkedList(int n)
{
	ListNode *L;
	ListNode *r = (ListNode*)malloc(sizeof(ListNode));
	r->next = NULL;
	L = r;
	for(int i = 0; i < n;i++)
	{
		ListNode *node = (ListNode*)malloc(sizeof(ListNode));
		node->a = xx + 3;
		xx+=3;
		node->next = NULL;
		r->next = node;
		r = node;
	}
	xx = 11;
	return L;
}
void PrintList(LinkList L)
{
	LinkList r = L->next;
	while(r != NULL)
	{
		printf("r->data = %d\n",r->a);
		r = r->next;
	}
}
LinkList  CombineList(LinkList La,LinkList Lb)
{
	ListNode* pa;
	ListNode* pb;
	ListNode* pc = (ListNode*)malloc(sizeof(ListNode));
	pc->next = NULL;
	pa = La->next;
	pb = Lb->next;
	LinkList Lc = pc;
	while(pa && pb)
	{
		if(pa->a <= pb->a)
		{
			pc -> next = pa;
			pc = pa;
			pa = pa -> next;
		}
		else
		{
			pc -> next = pb;
			pc = pb;
			pb = pb -> next;
		}
	}
	pc->next = pa?pa:pb;//插入剩余段
	return Lc;
	/*
	if(pa == NULL)
	{
		pc -> next = pb;
	}
	else
	{
		pc -> next = pa;
	}
	*/
}
int main(void) {
	puts("!!!Hello World!!!"); /* prints !!!Hello World!!! */
	LinkList L = creatLinkedList(7);
	LinkList R = creatLinkedList(5);
	printf("L\n");
	PrintList(L);
	printf("R\n");
	PrintList(R);
	LinkList Lc = (LinkList)malloc(sizeof(ListNode));
	Lc->next = NULL;
	//CombineList(L,R);
	printf("Lc\n");
	PrintList(CombineList(L,R));
	return EXIT_SUCCESS;
}
