// https://www.acmicpc.net/problem/10828

#include <iostream>
#include <string>
#include <vector>

using namespace std;

void solution(int num){
    vector<int> stack;
    string s;
    int X;
    // push X -> X를 push_back
    // pop -> 맨 끝의 정수를 출력하고 pop_back
    // size -> 정수 개수 출력
    // empty -> 스택이 비어있으면 1, 아니면 0
    // top -> 맨 끝의 정수 출력, 없으면 -1
    for(int i = 0; i < num; i++){
        cin >> s;
        if(s == "push"){
            cin >> X;
            stack.push_back(X);
        }
        if(s == "pop"){
            if(stack.size() == 0) cout << "-1" << endl;
            else {
                cout << stack[stack.size() - 1] << endl;
                stack.pop_back();
            }
        }
        if(s == "size"){
            cout << stack.size() << endl;
        }
        if(s == "empty"){
            if(stack.size() == 0) cout << "1" << endl;
            else cout << "0" << endl;
        }
        if(s == "top"){
            if(stack.size() == 0) cout << "-1" << endl;
            else cout << stack[stack.size() - 1] << endl;
        }
    }
}

int main(){
    int num;

    cin >> num;

    solution(num);

    return 0;
}