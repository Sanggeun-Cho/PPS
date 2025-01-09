// https://school.programmers.co.kr/learn/courses/30/lessons/42883

#include <iostream>
#include <string>
#include <vector>

using namespace std;
// ChatGPT 사용

string solution(string number, int k) {
    vector<char> stack; // 숫자를 저장할 스택
    int removeCount = k; // 제거해야 할 숫자의 개수

    for (char digit : number) {
        // 현재 숫자가 스택의 top보다 크면 제거
        while (!stack.empty() && removeCount > 0 && stack.back() < digit) {
            stack.pop_back();
            removeCount--;
        }
        stack.push_back(digit);
    }

    // 남아있는 숫자에서 더 제거해야 한다면 뒤에서 제거
    while (removeCount > 0) {
        stack.pop_back();
        removeCount--;
    }

    // 스택에 있는 숫자를 문자열로 변환
    string result(stack.begin(), stack.end());
    return result;
}

int main() {
    string number = "1924";
    int k = 2;

    cout << solution(number, k) << endl; // 출력: 94

    return 0;
}
