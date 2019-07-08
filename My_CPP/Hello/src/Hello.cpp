//============================================================================
// Name        : Hello.cpp
// Author      : Alec.Wu
// Version     :
// Copyright   : Ericsson
// Description : Hello World in C++, ANSI-style
//============================================================================

#include <iostream>
using namespace std;

class User{
private:
	int id;
	string name;
	int age;
	string birthPlace;
	string gender;
public:
	User(int id,string name,int age,string birthPlace,string gender){
		this->id = id;
		this->age = age;
		this->birthPlace = birthPlace;
		this->name = name;
		this->gender = gender;
	}

	int getAge() const {
		return age;
	}

	void setAge(int age) {
		this->age = age;
	}

	const string& getBirthPlace() const {
		return birthPlace;
	}

	void setBirthPlace(const string& birthPlace) {
		this->birthPlace = birthPlace;
	}

	const string& getGender() const {
		return gender;
	}

	void setGender(const string& gender) {
		this->gender = gender;
	}

	int getId() const {
		return id;
	}

	void setId(int id) {
		this->id = id;
	}

	const string& getName() const {
		return name;
	}

	void setName(const string& name) {
		this->name = name;
	}
};

int main() {
	User user1(1,"上官鸿飞",25,"重庆","male");
	cout << user1.getGender() << endl;
	cout << "!!!Hello World!!!" << endl; // prints !!!Hello World!!!
	return 0;
}
