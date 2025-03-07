// https://leetcode.com/problems/maximum-number-of-balloons/description/

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

// ChatGPT 도움
// 철자 번호 대로 배열 정리
// 철자별 개수를 세서 balloon이 만들어질 수 있는 개수 세기

int maxNumberOfBalloons(string text){
    vector<int> index_for_alphabet(26);
    for(char c : text){
        int temp = c - 'a';
        index_for_alphabet[temp]++;
    }
    int index_a = 'a' - 'a';
    int index_b = 'b' - 'a';
    int index_l = 'l' - 'a';
    int index_n = 'n' - 'a';
    int index_o = 'o' - 'a';

    index_for_alphabet[index_l] /= 2;
    index_for_alphabet[index_o] /= 2;

    return min({index_for_alphabet[index_a], index_for_alphabet[index_b], index_for_alphabet[index_l], index_for_alphabet[index_n], index_for_alphabet[index_o]});
}

int main(){
    string text;
    cin >> text;

    cout << maxNumberOfBalloons(text) << endl;

    return 0;
}