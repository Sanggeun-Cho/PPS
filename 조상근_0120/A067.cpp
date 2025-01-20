// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/

#include <iostream>
#include <string>
#include <vector>

using namespace std;

string removeDuplicates(string s){
    // 문자열의 철자를 하나씩 벡터에 넣는다
    // 벡터 값이 이전 문자열과 같으면 pop 두번
    // 새로운 문자열에 벡터 철자들을 계속 더해준다
    vector<char> answer;
    for(int i = 0; i < s.length(); i++){
        answer.push_back(s[i]);
        if(i > 0 && (answer[answer.size() - 1] == answer[answer.size() - 2])){
            answer.pop_back();
            answer.pop_back();
        }
    }

    string removed = "";
    for(int i = 0; i < answer.size(); i++){
        removed += answer[i];
    }

    return removed;
}

int main(){
    string s;

    cin >> s;

    cout << removeDuplicates(s) << endl;

    return 0;
}