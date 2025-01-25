// https://www.acmicpc.net/problem/2164

#include <iostream>
#include <queue>

using namespace std;

int solution(int num){
    // 큐에 숫자들을 넣는다
    // 큐의 크기가 1이 될 때까지 pop, push, pop을 반복한다
    // 마지막 정수는 출력
    queue<int> q;

    for(int i = 1; i <= num; i++){
        q.push(i);
    }

    while(q.size() > 2){
        q.pop();
        q.push(q.front());
        q.pop();
    }

    return q.back();
}

int main(){
    int num;
    
    cin >> num;

    cout << solution(num) << endl;

    return 0;
}