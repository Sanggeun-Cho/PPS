// https://leetcode.com/problems/find-the-difference/description/

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

// 두 문자열을 정렬하여 하나씩 비교하면서 다른 문자열이 있을 경우 해당 문자 반환

bool comp(char c1, char c2){
    return c1 < c2;
}

char findTheDifference(string s, string t){
    sort(s.begin(), s.end(), comp);
    sort(t.begin(), t.end(), comp);
    int t_index;

    for(int i = 0; i < t.size(); i++){
        if(s[i] != t[i]){
            t_index = i;
            break;
        }
    }

    return t[t_index];
}

int main(){
    string s, t;

    cin >> s >> t;

    cout << findTheDifference(s, t) << endl;

    return 0;
}