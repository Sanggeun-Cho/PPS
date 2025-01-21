// https://leetcode.com/problems/remove-outermost-parentheses/description/

#include <iostream>
#include <string>
#include <vector>

using namespace std;

// https://velog.io/@skins0329/LeetCode-1021.-Remove-Outermost-Parentheses

string removeOuterParentheses(string s){
    vector<char> primitive;
    string result = "";
    for(char c : s){
        if(c == '('){
            primitive.push_back('(');
            if(primitive.size() > 1){
                result += "(";
            }
        }
        else {
            primitive.pop_back();
            if(primitive.size() > 0){
                result += ")";
            }
        }
    }

    return result;
}

int main(){
    string s;

    cin >> s;

    cout << removeOuterParentheses(s) << endl;

    return 0;
}