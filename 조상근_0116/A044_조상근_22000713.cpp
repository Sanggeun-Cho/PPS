// https://leetcode.com/problems/student-attendance-record-i/description/

#include <iostream>
#include <string>

using namespace std;

bool checkRecord(string s){
    int a_cnt = 0;
    int l_sequence = 0;

    // 첫 번째는 A인지만 판별 한 후 그 다음 출석부터 반복문
    if(s[0] == 'A') a_cnt++;
    
    // 반복문을 돌며 조건 파악
    bool answer = true;
    for(int i = 1; i < s.size(); i++){
        // A(결석)의 개수가 2개 이상인지
        if(s[i] == 'A') a_cnt++;
        // L(지각)이 세 번 연속으로 있지 않은지
        // 이전 출석과 지금 출석 모두 L이면 카운트 증가(카운트 2면 false)
        if(s[i - 1] == 'L' && s[i] == 'L') l_sequence++;
        else l_sequence = 0;

        if(a_cnt >= 2 || l_sequence >= 2){
            answer = false;
            break;
        }
    }
        
    return answer;
}

int main(){
    string s;

    cin >> s;

    if(checkRecord(s)) cout << "true" << endl;
    else cout << "false" << endl;

    return 0;
}