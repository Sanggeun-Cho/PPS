// https://www.acmicpc.net/problem/4659

#include <iostream>
#include <string>

using namespace std;

// ChatGPT의 도움으로 로직 완성

// 모음 여부를 판별하는 함수
bool is_vowel(char ch) {
    return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}

void solution(string s) {
    bool accept = false;
    int vowel_count = 0, consonant_count = 0; // 연속된 모음과 자음의 개수 추적
    
    for (int i = 0; i < s.length(); i++) {
        // 1. 적어도 하나의 모음이 포함되어야 함
        if (is_vowel(s[i])) {
            accept = true; // 모음이 있음을 표시
            vowel_count++;  // 모음 카운트 증가
            consonant_count = 0; // 자음 카운트 초기화
        } else {
            consonant_count++; // 자음 카운트 증가
            vowel_count = 0; // 모음 카운트 초기화
        }

        // 2. 같은 글자가 연속으로 두 번 나오면 (단, 'e', 'o'는 허용)
        if (i > 0 && s[i] == s[i - 1] && s[i] != 'e' && s[i] != 'o') {
            accept = false;
            break;
        }

        // 3. 모음 또는 자음이 3번 연속 나오면
        if (vowel_count >= 3 || consonant_count >= 3) {
            accept = false;
            break;
        }
    }

    if (accept) 
        cout << "<" << s << "> is acceptable." << endl;
    else 
        cout << "<" << s << "> is not acceptable." << endl;
}

int main() {
    string s;

    while (true) {
        cin >> s;

        if (s == "end") break;

        solution(s);
    }

    return 0;
}
