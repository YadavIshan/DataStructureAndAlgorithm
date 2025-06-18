#include<bits/stdc++.h>
using namespace std;
// we can write a^n to (a^n/2)^2 for even and for odd a * (a^n/2)^2
long long powerFunctionOptimised(long long a , long long n){
	if(n == 0) return 1;
	if(n==1) return a;
	long long half = powerFunctionOptimised(a, n / 2);
    if (!(n & 1))
        return half * half;
    else
        return a * half * half;
}

int main (){
	int a, n ;
	cin >> a >> n;
	cout<<a<<"^"<<n<<" is: "<<powerFunctionOptimised(a , n);

}