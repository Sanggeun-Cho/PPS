// https://www.acmicpc.net/problem/5585

#include <iostream>
#include <vector>

using namespace std;

// 거슬러줄 금액에서 큰 동전부터 시작해 줄 수 있는 만큼 준다

#define PAY_MONEY 1000
vector<int> typeOfCoins = {500, 100, 50, 10, 5, 1};

int numberOfCoins(int value){
    int change = PAY_MONEY - value;
    int coin_cnt = 0;

    for(int coin_value : typeOfCoins){
        coin_cnt += change / coin_value;
        change %= coin_value;
    }

    return coin_cnt;
}

int main(){
    int value;
    cin >> value;

    cout << numberOfCoins(value) << endl;

    return 0;
}