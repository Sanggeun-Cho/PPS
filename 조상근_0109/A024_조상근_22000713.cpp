// https://leetcode.com/problems/lemonade-change/description/

#include <iostream>
#include <vector>

using namespace std;

bool lemonadeChange(vector<int> bills){
    bool answer = true;
    // 동전의 개수를 세는 배열을 만듦 [$5, $10, $20] -> $20 없어도 됨
    vector<int> coin = {0, 0};

    for(int i = 0; i < bills.size(); i++){
        // 5달러를 받으면 coin[0]++;
        if(bills[i] == 5) coin[0]++;

        // 10달러를 받으면 5달러가 하나 이상 있는지 확인
            // 있다면 coin[0]--, coin[1]++;
        if(bills[i] == 10){
            if(coin[0] >= 1) coin[0]--, coin[1]++;
            else answer = false;
        }

        // 20달러를 받으면 (1)5달러가 세 개 이상이거나 (2)5달러 하나 이상 10달러 하나 이상인지 확인
            // if 2일경우 coin[0]--, coin[1]--; -> 10달러가 있으면 그 돈을 먼저 거슬러 줌(효율성)
            // else if 1일 경우 coin[0] -= 3;
        if(bills[i] == 20){
            if(coin[1] >= 1 && coin[0] >= 1) coin[0]--, coin[1]--;
            else if(coin[0] >= 3) coin[0] -= 3;
            else answer = false;
        }
    }

    return answer;    
}

int main(){
    vector<int> bills = {5, 5, 5, 10, 20};

    if(lemonadeChange(bills)) cout << "true" << endl;
    else cout << "false" << endl;

    return 0;
}