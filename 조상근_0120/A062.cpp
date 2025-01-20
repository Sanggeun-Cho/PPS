// https://school.programmers.co.kr/learn/courses/30/lessons/12901

#include <iostream>
#include <vector>
#include <string>

using namespace std;

string solution(int a, int b){
    // 월별 날짜를 포함하고 있는 배열을 이용해 0부터 a - 1까지의 날을 더한다
    // 일은 b - 1을 하여 그 차이 값을 더한다
    vector<int> month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int days = 0;
    for(int i = 0; i < a - 1; i++){
        days += month[i];
    }
    days = days + b - 1;
    days %= 7;
    vector<string> week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

    return week[days];
}

int main(){
    int a, b;

    cin >> a >> b;

    cout << solution(a, b) << endl;

    return 0;
}