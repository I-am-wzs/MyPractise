/*
 ============================================================================
 Name        : ArrayOutOfRange.c
 Author      : Alec.Wu
 Version     :
 Copyright   : Ericsson
 Description : Hello World in C, Ansi-style
 ============================================================================
 */

#include <stdio.h>
#include <stdlib.h>

int main(int argc,char *argv[]) {
	int i = 0;
	int arr[3] = {0};
	for(;i<=3;i++){
		arr[i] = 0;
		printf("hello,word\n");
	}
	return EXIT_SUCCESS;
}
