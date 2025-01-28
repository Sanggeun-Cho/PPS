// https://www.acmicpc.net/problem/11656

#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

vector<string> solution(string s){
    vector<string> words;
    int len = s.length();
    for(int i = 0; i < len; i++){
        words.push_back(s.substr(i));
    }

    sort(words.begin(), words.end());

    return words;
}

int main(){
    string s;

    cin >> s;

    vector<string> answer = solution(s);

    for(string i : answer){
        cout << i << "\n";
    }

    return 0;
}