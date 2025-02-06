// https://www.acmicpc.net/problem/1157

#include <iostream>
#include <vector>
#include <string>

using namespace std;

char solution(string s){
    // 문자열을 모두 소문자로 바꾼다
    for(int i = 0; i < s.size(); i++){
        if('a' <= s[i] && s[i] <= 'z') s[i] -= 32;
    }
    // 각 문자열을 돌며 개수를 센다
    vector<int> alphabet(26);
    for(int i = 0; i < s.size(); i++){
        alphabet[s[i] - 'A']++;
    }
    // max를 -1로 두고 max를 찾는데 max값과 새로운 값이 같으면 false를 넣는다
        // 그런데 max 값이 갱신이 된다면 다시 true로 변환
    int max = -1;
    int index;
    bool check;
    for(int i = 0; i < alphabet.size(); i++){
        if(alphabet[i] > max){
            max = alphabet[i];
            index = i;
            check = true;
        }
        else if(alphabet[i] == max){
            check = false;
        }
    }

    if(check) return index + 'A';
    else return '?';
}

int main(){
    string s;

    cin >> s;

    cout << solution(s) << endl;

    return 0;
}