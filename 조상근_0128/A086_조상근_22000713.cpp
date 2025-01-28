// https://www.acmicpc.net/problem/1755

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(int a, int b){
    // 두 숫자를 string으로 바꿈
    // 비교하여 사전순 정렬
    string string_a = "";
    string string_b = "";

    while(a >= 1){
        int temp = a % 10;
        if(temp == 0) string_a = "zero" + string_a;
        if(temp == 1) string_a = "one" + string_a;
        if(temp == 2) string_a = "two" + string_a;
        if(temp == 3) string_a = "three" + string_a;
        if(temp == 4) string_a = "four" + string_a;
        if(temp == 5) string_a = "five" + string_a;
        if(temp == 6) string_a = "six" + string_a;
        if(temp == 7) string_a = "seven" + string_a;
        if(temp == 8) string_a = "eight" + string_a;
        if(temp == 9) string_a = "nine" + string_a;
        
        a /= 10;
    }
    while(b >= 1){
        int temp = b % 10;
        if(temp == 0) string_b = "zero" + string_b;
        if(temp == 1) string_b = "one" + string_b;
        if(temp == 2) string_b = "two" + string_b;
        if(temp == 3) string_b = "three" + string_b;
        if(temp == 4) string_b = "four" + string_b;
        if(temp == 5) string_b = "five" + string_b;
        if(temp == 6) string_b = "six" + string_b;
        if(temp == 7) string_b = "seven" + string_b;
        if(temp == 8) string_b = "eight" + string_b;
        if(temp == 9) string_b = "nine" + string_b;

        b /= 10;
    }

    return string_a < string_b;
}

vector<int> solution(int start, int finish){
    // 벡터값에 수 넣기
    // 정렬
    vector<int> answer;
    for(int i = start; i <= finish; i++){
        answer.push_back(i);
    }
    sort(answer.begin(), answer.end(), compare);

    return answer;
}

int main(){
    int start, finish;

    cin >> start >> finish;

    vector<int> answer = solution(start, finish);

    for(int i = 0; i < answer.size(); i++){
        cout << answer[i] << " ";
        if(i % 10 == 9) cout << "\n";
    }

    return 0;
}