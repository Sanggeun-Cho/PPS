// https://www.acmicpc.net/problem/1316

#include <iostream>
#include <vector>
#include <string>

using namespace std;

bool checkin(vector<char> array, char c){
    for(int i = 0; i < array.size(); i++){
        if(c == array[i]) return true;
    }
    return false;
}

int solution(vector<string> words){
    // 현재 글자가 다음 글자와 다르면 배열에 추가 (이미 나온 철자들 저장)
        // 다음 글자와 비교할 때 ||를 사용해 위 배열에 들어가있지 않은지 검사
        // 들어가있다면 false
        // false가 아니라면 개수 ++
    int answer = 0;
    for(int i = 0; i < words.size(); i++){
        vector<char> used = {};
        bool check = true;
        for(int j = 0; j < words[i].length(); j++){
            if(checkin(used, words[i][j])) check = false;
            if((words[i][j] != words[i][j + 1]) && (j < words[i].length() - 1)){
                used.push_back(words[i][j]);
            }
            
        }
        if(check) answer++;
    }

    return answer;
}

int main(){
    int num;

    cin >> num;

    vector<string> words;
    string word;

    for(int i = 0; i < num; i++){
        cin >> word;
        words.push_back(word);
    }

    cout << solution(words) << endl;

    return 0;
}