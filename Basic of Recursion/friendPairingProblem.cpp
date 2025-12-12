#include<bits/stdc++.h>
using namespace std;

int friendPairingProblem(int n){
	if(n <= 2) return n ;

	// (Ways when nth friend is single) + (Ways when nth friend is paired up with someone else)
	return friendPairingProblem(n-1) +((n-1) * friendPairingProblem(n-2));
}

int main(){
	int n ;
	cin >> n;
	cout<<"There are total "<<friendPairingProblem(n)<<" ways to pair them.";
}