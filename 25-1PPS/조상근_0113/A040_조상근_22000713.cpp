// https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

#include <iostream>
#include <cctype>
#include <string>

using namespace std;

bool halvesAreAlike(string s){
    int s1_cnt = 0;
    int s2_cnt = 0;
    // 문자열을 돌면서 문자열의 절반을 기준으로 다르게 모음의 개수를 셈
    for(int i = 0; i < s.size(); i++){
        // 첫 번째 문자열
        if(i < s.size() / 2){
            if(tolower(s[i]) == 'a' || tolower(s[i]) == 'e' || tolower(s[i]) == 'i' || tolower(s[i]) == 'o' || tolower(s[i]) == 'u') s1_cnt++;
        }
        // 두 번째 문자열
        else {
            if(tolower(s[i]) == 'a' || tolower(s[i]) == 'e' || tolower(s[i]) == 'i' || tolower(s[i]) == 'o' || tolower(s[i]) == 'u') s2_cnt++;
        }
    }
    // 개수를 비교
    if(s1_cnt == s2_cnt) return true;
    else return false;
}

int main(){
    string s;
    cin >> s;

    if(halvesAreAlike(s)) cout << "true" << endl;
    else cout << "false" << endl;
}