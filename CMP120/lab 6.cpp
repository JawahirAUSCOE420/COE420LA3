#include <iostream>
using namespace std;
void main()
{
	int n, z;
	cout << "N=";
	cin >> n;
	for (z = 1; n > 0; n--)
	{
		z = n*z;
			
	}
	cout << "N!=" << z << endl;
}