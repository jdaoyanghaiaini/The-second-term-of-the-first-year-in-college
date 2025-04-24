#pragma once
#include<stdio.h>
#include<assert.h>
#include<stdlib.h>
#include<stdbool.h>
typedef struct stack ST;
typedef int STDateType;
struct  stack {
	STDateType* a;
	int capacity;
	int top;
};
//��ʼ��ջ
void STInit(ST* ps);
//����ջ
void STDestroy(ST* ps);
//��������
void STPush(ST* ps,STDateType x);
//ɾ������
void STPop(ST* ps);
//ջ�Ƿ�Ϊ��
bool STEmpty(ST* ps);
//ջ�Ĵ�С
void STSize(ST* ps);