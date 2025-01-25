// https://leetcode.com/problems/valid-palindrome/description/

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

bool isPalindrom(string s){
    // s의 철자 하나하나 영어인지 묻고 새로운 문자열에 조건에 맞게 추가
    // 문자열을 하나 복사해서 반대로 뒤집음
    // 두 문자열이 같다면 true

    string new_s = "";
    for(int i = 0; i < s.length(); i++){
        if(s[i] >= 'a' && s[i] <= 'z'){
            new_s += s[i];
        } else if(s[i] >= 'A' && s[i] <= 'Z'){
            s[i] += 32;
            new_s += s[i];
        }
    }

    if(new_s.length() == 0) new_s = " ";
    string copy_s = new_s;
    reverse(copy_s.begin(), copy_s.end());

    cout << new_s << " " << copy_s << endl;

    if(new_s.compare(copy_s) == 0) return true;
    else return false;
}

int main(){
    string s;

    getline(cin, s);

    if(isPalindrom(s)) cout << "true" << endl;
    else cout << "false" << endl;

    return 0;
}