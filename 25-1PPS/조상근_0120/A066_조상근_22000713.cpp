// https://www.acmicpc.net/problem/1427

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

bool compare(int a, int b){
    return a > b;
}

string solution(string s){
    sort(s.begin(), s.end(), compare);

    return s;
}

int main(){
    string s;

    cin >> s;

    cout << solution(s) << endl;

    return 0;
}