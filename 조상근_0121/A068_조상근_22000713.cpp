// https://www.acmicpc.net/problem/18258

#include <iostream>
#include <queue>
#include <string>

using namespace std;

void solution(int N){
    // push -> x를 입력 받고 push
    // pop -> 출력하고 vec.erase(vec.begin())으로 삭제 없으면 -1
    // size -> 벡터 사이즈
    // empty -> 비어있으면 1, 아니면 0
    // front -> 가장 앞에 있는 정수 없으면 -1
    // back -> 가장 뒤에 있는 정수 없으면 -1
    // queue 활용으로 변경

    ios::sync_with_stdio(false); // C 표준 입출력과의 동기화 비활성화
    cin.tie(nullptr);

    queue<int> q;
    string s;
    for(int i = 0; i < N; i++){
        cin >> s;
        if(s == "push"){
            int x;
            cin >> x;
            q.push(x);
        }
        if(s == "pop"){
            if(q.size() > 0){
                cout << q.front() << "\n";
                q.pop();
            } else{
                cout << "-1" << "\n";
            }
        }
        if(s == "size"){
            cout << q.size() << "\n";
        }
        if(s == "empty"){
            if(q.size() == 0) cout << "1" << "\n";
            else cout << "0" << "\n";
        }
        if(s == "front"){
            if(q.size() > 0) cout << q.front() << "\n";
            else cout << "-1" << "\n";
        }
        if(s == "back"){
            if(q.size() > 0) cout << q.back() << "\n";
            else cout << "-1" << "\n";
        }
    }
}

int main(){
    int N;

    cin >> N;

    solution(N);

    return 0;
}