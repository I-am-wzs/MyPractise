#include <iostream>
#include <cstring>
#include <conio.h>

#define MAXLEN 100

typedef struct
{
	char key[10];
	char name[20];
	int age;
}DATA;

typedef struct
{
	DATA ListData[MAXLEN + 1];
	int ListLen;
}SLType;


void SLInit(SLType *SL)
{
	SL->ListLen = 0;
}
int SLLength(SLType *SL)
{
	return (SL->ListLen);
}
int SLInset(SLType *SL,int index,DATA data)
{
	int i = 0;
	if(SL->ListLen >= MAXLEN)
	{
		printf("顺序表已满，不能插入节点！\n");
		return 1;
	}
	if(index < 1 || index > SL->ListLen  - 1)
	{
		printf("插入的顺序号有误，不能插入元素\n");
		return 1;
	}
	for(i = SL->ListLen;i >= index;i--)
	{
		SL->ListData[i + 1] = SL->ListData[i];
	}
	SL->ListData[index] = data;
	SL->ListLen++;
	return 0;
}
int SLAdd(SLType *SL,DATA data)
{
	if(SL->ListLen >= MAXLEN)
	{
		printf("顺序表已满，不能再添加任何元素\n");
		return 1;
	}
	SL->ListData[++SL->ListLen] = data;
	return 0;
}
int SLDelete(SLType * SL,int index)
{
	int i = 0;
	if( index < 1  || index > SL->ListLen + 1)
	{
		printf("删除节点错误\n");
		return 1;
	}
	for(i = index;i < SL->ListLen;i++)
	{
		SL->ListData[i] = SL->ListData[i+1];
	}
	SL->ListLen--;
	return 0;
}
DATA* SLFindByNum(SLType *SL,int index)
{
	if (index < 1 || index > SL->ListLen  + 1)
	{
		printf("节点序号错误，不能返回节点\n");
		return NULL;
	}
	return &(SL->ListData[index]);
}
int SLFindByCont(SLType *SL,char *key)
{
	int i = 0;
	for(i = 1;i <= SL->ListLen;i++)
	{
		if(strcmp(SL->ListData[i].key,key) == 0)
		{
			return i;
		}
	}
	return -1;
}
int SLAll(SLType *SL)
{
	int i = 0;
	for(i = 1;i <= SL->ListLen;i++)
	{
		printf("(%s,%s,%d)\n",SL->ListData[i].key,SL->ListData[i].name,SL->ListData[i].age);
		fflush(stdout);
	}
	return 0;
}
int main()
{
	int i = 0;
	SLType SL;
	DATA data;
	DATA *pdata;
	char key[10];

	printf("SQL demo!\n");
	SLInit(&SL);
	printf("init sql demo done!\n");
	fflush(stdout);

	do{
		printf("input your (id name age):");
		fflush(stdout);
		fflush(stdin);
		scanf("%s %s %d",&data.key,&data.name,&data.age);
		if(data.age != 0)
		{
			fflush(stdout);
			if(SLAdd(&SL,data) == 1)
			{
				break;
			}
		}
		else
		{
			break;
		}
	}while(1);

	printf("\nsql contant:\n");
	fflush(stdout);
	SLAll(&SL);

	fflush(stdin);
	printf("\ninput the index what you want find:");
	fflush(stdout);
	scanf("%d",&i);
	pdata = SLFindByNum(&SL,i);
	if(pdata != NULL)
	{
		printf("No %d :(%s,%s,%d)\n",i,pdata->key,pdata->name,pdata->age);
	}
	fflush(stdin);
	printf("\n要查找节点的关键字：");
	fflush(stdout);
	scanf("%s",key);
	i = SLFindByCont(&SL,key);
	pdata = SLFindByNum(&SL,i);
	if(pdata != NULL)
	{
		printf("第%d个节点为：(%s,%s,%d)\n",i,pdata->key,pdata->name,pdata->age);
		fflush(stdout);
	}
	getch();
	return 0;
}

