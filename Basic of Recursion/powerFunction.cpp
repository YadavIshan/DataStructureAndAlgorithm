#include<bits/stdc++.h>
using namespace std;

long long calculatePower(long long a , long long n){
	if(n == 0) return 1;
	if(n==1) return a;
	else return a * calculatePower(a , n-1);
}

int main (){
	int a, n ;
	cin >> a >> n;
	cout<<a<<"^"<<n<<" is: "<<calculatePower(a , n);

}