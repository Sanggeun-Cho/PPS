// https://leetcode.com/problems/sqrtx/description/

#include <iostream>
#include <cmath>

using namespace std;

int mySqrt(int x){
    int left = 0;
    int right = x;
    while(left <= right){
        double mid = (left + right) / 2;
        if(mid * mid < x){
            left = mid + 1;
        }
        else if(mid * mid > x){
            right = mid - 1;
        }
        else return mid;
    }
    return right;
}

int main(){
    int x;
    
    cin >> x;

    cout << mySqrt(x) << endl;

    return 0;
}