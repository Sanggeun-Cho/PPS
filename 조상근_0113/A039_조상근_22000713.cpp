// https://leetcode.com/problems/valid-perfect-square/

#include <iostream>

using namespace std;

bool isPerfectSquare(int num){
    int left = 0;
    int right = num;
    
    while(left <= right){
        double mid = (left + right) / 2;
        if(mid * mid < num){
            left = mid + 1;
        }
        else if(mid * mid > num){
            right = mid - 1;
        }
        else return true;
    }
    return false;
}

int main(){
    int num;

    cin >> num;

    if(isPerfectSquare(num)) cout << "true" << endl;
    else cout << "false" << endl;

    return 0;
}