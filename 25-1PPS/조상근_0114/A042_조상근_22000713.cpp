// https://leetcode.com/problems/backspace-string-compare/description/

#include <iostream>
#include <string>

using namespace std;

bool backspaceCompare(string s, string t){
    // s와 t에 대해 각각 문자열을 돌며 새로운 문자열에 #여부에 따라 push 혹은 pop을 한다
    string after_s;
    string after_t;
    for(int i = 0; i < s.size(); i++){
        if(s[i] == '#') {
            if(after_s.size() > 0) after_s.pop_back();
        }
        else after_s.push_back(s[i]);
    }
    for(int i = 0; i < t.size(); i++){
        if(t[i] == '#'){
            if(after_t.size() > 0) after_t.pop_back();
        }
        else after_t.push_back(t[i]);
    }
    
    // 두 문자열이 같으면 true, 다르면 false 반환
    if(after_s.compare(after_t) == 0) return true;
    else return false;
}

int main(){
    string s, t;

    cin >> s >> t;

    if(backspaceCompare(s, t)) cout << "true" << endl;
    else cout << "false" << endl;

    return 0;
}