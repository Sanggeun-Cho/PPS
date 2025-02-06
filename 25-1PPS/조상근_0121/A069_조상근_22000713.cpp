// https://www.acmicpc.net/problem/11866

#include <iostream>
#include <queue>

using namespace std;

void solution(int N, int K){
    // N까지의 수가 들어있는 queue를 만듦
    // queue가 빌 때까지 k - 1번까지의 수들을 다시 push
        // k번째 수는 출력한 후 pop
    queue<int> q;
    for(int i = 1; i <= N; i++){
        q.push(i);
    }

    cout << "<";
    while(!q.empty()){
        for(int i = 1; i < K; i++){
            q.push(q.front());
            q.pop();
        }
        cout << q.front();
        if(q.size() > 1) cout << ", ";
        q.pop();
    }
    cout << ">" << endl;
}

int main(){
    int N, K;

    cin >> N >> K;

    solution(N, K);

    return 0;
}