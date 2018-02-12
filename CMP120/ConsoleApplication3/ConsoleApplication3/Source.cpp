#include <iostream>
using namespace std;
void main(){
	double x, z;
	
	cout << "Enter the value for x: ";
	cin >> x;
	z = (double) ((2 * x - 1) / (3 * x + 1)) + x + 2;
	cout << "z = " << z << endl;
	
}

