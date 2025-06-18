#include<bits/stdc++.h>
using namespace std;

//In ascending order
bool isSortedArrayInAsc(vector<int>&arr , int index){
	if(arr.size() ==0 or index == arr.size() - 1) return true ;
	bool isSorted = arr[index] <= arr[index+1] && isSortedArrayInAsc(arr , index+1);
	return isSorted;
}
//For descending order
bool isSortedArrayInDesc(vector<int>&arr , int index){
	if(arr.size() ==0 or index == arr.size() - 1) return true ;
	bool isSorted = arr[index] >= arr[index+1] && isSortedArrayInDesc(arr , index+1);
	return isSorted;
}

int main(){
	vector<int>sortedArray{1,2,3,4,5};
	vector<int>unsortedArray{5,2,3,4,1};
	vector<int>descSortedArray{5,2,1};
	cout<<"Checking if element in sortedArray are sorted in Ascending order ,ans is : "<<bool(isSortedArrayInAsc(sortedArray , 0))<<endl;
	cout<<"Checking if element in unsortedArray are sorted in Ascending order ,ans is : "<<bool(isSortedArrayInAsc(unsortedArray , 0))<<endl;
	cout<<"Checking if element in sortedArray are sorted in Descending order ,ans is : "<<bool(isSortedArrayInDesc(descSortedArray , 0))<<endl;
}