// https://school.programmers.co.kr/learn/courses/30/lessons/60057

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int solution(string s) {
    int minLength = s.size(); // 초기값은 원본 문자열의 길이

    // 단위 크기를 1부터 s.size() / 2까지 시도
    for (int unit = 1; unit <= s.size() / 2; unit++) {
        string compressed = ""; // 압축된 문자열
        string prev = s.substr(0, unit); // 첫 번째 단위 문자열
        int count = 1;

        // 문자열을 unit 단위로 나눔
        for (int i = unit; i < s.size(); i += unit) {
            string current = s.substr(i, unit); // 현재 단위 문자열
            if (current == prev) {
                count++; // 이전 문자열과 같으면 카운트 증가
            } else {
                // 다른 문자열이 나오면 압축 문자열에 추가
                if (count > 1) compressed += to_string(count);
                compressed += prev;
                prev = current;
                count = 1;
            }
        }

        // 마지막 남은 문자열 처리
        if (count > 1) compressed += to_string(count);
        compressed += prev;

        // 압축된 문자열 길이 갱신
        minLength = min(minLength, (int)compressed.size());
    }

    return minLength;
}

int main() {
    string s = "aabbaccc";
    cout << solution(s) << endl;

    return 0;
}
