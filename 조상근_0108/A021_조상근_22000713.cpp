// https://www.acmicpc.net/problem/2010

#include <iostream>
#include <vector>

using namespace std;

int solution(int count, vector<int> multitap){
    int computer = 0;
    // 멀티탭의 콘센트 수를 더한다
    for(int i = 0; i < multitap.size(); i++){
        computer += multitap[i];
    }

    // 멀티탭 개수 - 1 (멀티탭에 다른 멀티탭을 연결하는 과정) 를 뺀다
    computer = computer - (count - 1);

    return computer;
}

int main(){
    int count;
    vector<int> multitap;
    int temp;

    cin >> count;
    for(int i = 0; i < count; i++){
        cin >> temp;
        multitap.push_back(temp);
    }

    cout << solution(count, multitap) << endl;
}