// https://www.acmicpc.net/problem/1431

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(string a, string b){
    if(a.length() != b.length()) return a.length() < b.length();
    else{
        int a_sum = 0;
        int b_sum = 0;
        for(int i = 0; i < a.length(); i++){
            if(a[i] >= '0' && a[i] <= '9') a_sum += (a[i] - '0');
        }
        for(int i = 0; i < b.length(); i++){
            if(b[i] >= '0' && b[i] <= '9') b_sum += (b[i] - '0');
        }
        if(a_sum != b_sum) return a_sum < b_sum;
        else return a < b;
    }
}

vector<string> solution(vector<string> s){
    sort(s.begin(), s.end(), compare);

    return s;
}

int main(){
    int num;

    cin >> num;

    string temp;
    vector<string> s;

    for(int i = 0; i < num; i++){
        cin >> temp;
        s.push_back(temp);
    }

    vector<string> answer = solution(s);

    for(int i = 0; i < answer.size(); i++){
        cout << answer[i] << "\n";
    }

    return 0;
}