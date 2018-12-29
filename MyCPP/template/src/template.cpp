//============================================================================
// Name        : template.cpp
// Author      : Alec.Wu
// Version     :
// Copyright   : Ericsson
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;
template <typename T>
int compare(const T &v1,const T &v2)
{
	if(v1 < v2)
		return -1;
	if(v2 < v1)
		return 1;
	return 0;
}
int main() {
	//cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	cout << compare(2,1) << endl;
	return 0;
}
