// https://leetcode.com/problems/count-primes/description/

#include <iostream>

using namespace std;

int countPrimes(int n) {
    bool check = true;
    int cnt = 0;

    for(int i = 2; i <= n; i++){
        for(int j = 2; j < i; j++){
            if(i % j == 0) check = false;
        }
        if(check) cnt++;
        check = true;
    }

    return cnt;
}

int main(){
    int num;

    cin >> num;
    cout << countPrimes(num) << endl;

    return 0;
}