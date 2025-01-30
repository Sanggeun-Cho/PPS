// https://www.acmicpc.net/problem/3059

#include <iostream>
#include <vector>
#include <string>

using namespace std;

int solution(string s){
    // 알파벳에 해당하는 배열의 index에 +해놓음
    // 0인 수의 아스키 코드 계산

    vector<int> alphabet(26, 0);
    for(char c : s){
        alphabet[c - 'A']++;
    }
    int sum = 0;
    for(int i = 0; i < 26; i++){
        if(alphabet[i] == 0) sum = sum + 65 + i;
    }

    return sum;
}

int main(){
    int num;

    cin >> num;

    string s;

    for(int i = 0; i < num; i++){
        cin >> s;
        cout << solution(s) << "\n";
    }

    return 0;
}