//============================================================================
// Name        : Stack.cpp
// Author      : Alec.Wu
// Version     :
// Copyright   : Ericsson
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cstdlib>
#include <cstring>
using namespace std;

#define MAXLEN 50

struct DATA
{
	char name[10];
	int age;
};
struct Stack
{
	DATA data[MAXLEN +1];
	int top;
};
Stack* STInit()
{
	Stack *p;
	p = (Stack*)malloc(sizeof(Stack));
	if(p != NULL)
	{
		p->top = 0;
		return p;
	}
	return NULL;
}
bool STIsEmpty(Stack *s)
{
	bool t;
	t = (s->top == 0);
	return t;
}
bool STIsFull(Stack* s)
{
	bool t = (s->top == MAXLEN);
	return t;
}
void STClear(Stack* s)
{
	s->top = 0;
}
void STFree(Stack* s)
{
	if(s != NULL)
	{
		free(s);
	}
}
int PushST(Stack* s,DATA data)
{
	if((s->top + 1) > MAXLEN )
	{
		cout << "stack overflow" << endl;
		return 0;
	}
	s->data[++s->top] = data;
	return 1;
}

DATA PopST(Stack* s)
{
	if(s->top == 0)
	{
		cout << "stack is empty" <<endl;
		exit(0);
	}
	return (s->data[s->top--]);
}
DATA PeekST(Stack *s)
{
	if(s->top == 0)
	{
		cout << "empty stack" <<endl;
		exit(0);
	}
	return (s->data[s->top]);
}
int main() {
	Stack *stack;
	DATA data,data1;

	stack = STInit();
	cout << "push stack operation:" << endl;
	cout << "please input your name and age:"<< endl;

	do
	{
		cin >> data.name >> data.age;
		if(strcmp(data.name,"0") == 0)
		{
			break;
		}
		else
		{
			PushST(stack,data);
		}
	}while(1);

	do
	{
		cout<<"pop stack operation, enter any to continue:" << endl;
		getchar();
		data1 = PopST(stack);
		cout << "pop data: name = " << data1.name <<", age = "<< data1.age << endl;

	}while(1);

	STFree(stack);
	return 0;
}
