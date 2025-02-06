// https://leetcode.com/problems/longest-common-prefix/description/

#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

string longestCommonPrefix(vector<string> strs){
    // 단어들을 for문으로 돌면서 자신의 전 단어와 철자 하나하나 비교 (1부터시작)
    int max = min(strs[0].size(), strs[1].size()); // 처음에는 max를 두 문자 중 작은 것으로 설정
    for(int i = 1; i < strs.size(); i++){
        // 각 단어가 같지 않으면 중복 단어의 최대값을 index - 1로 설정
        // 그 다음 단어와 최대값까지만 비교하며 계속 리턴
        for(int j = 0; j < max; j++){
            if(strs[i-1][j] != strs[i][j]) max = j - 1;
        }
    }

    // 마지막 단어에서 최대값까지의 인덱스만 pushback하여 새로운 문자열 만듦
    string answer;
    for(int i = 0; i <= max; i++){
        answer.push_back(strs[strs.size() - 1][i]);
    }

    return answer;
}

int main(){
    string s1, s2, s3;

    cin >> s1 >> s2 >> s3;

    vector<string> answer = {s1, s2, s3};

    cout << longestCommonPrefix(answer) << endl;

    return 0;
}