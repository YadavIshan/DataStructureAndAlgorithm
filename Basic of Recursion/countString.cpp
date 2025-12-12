#include<bits/stdc++.h>
using namespace std;

long long countPossibleString(int currentBit , int n){
	if(n == 1) return 1 ;



	if(currentBit == 1) return countPossibleString(0 , n - 1);
	else return countPossibleString(0 , n - 1) + countPossibleString(1 , n - 1);
}

int main (){
	int n ;
	cin >> n ;
	cout<<"Number of binary string with no consecutive one that can be formed of lenght n is :"<<countPossibleString(0 , 5);
}