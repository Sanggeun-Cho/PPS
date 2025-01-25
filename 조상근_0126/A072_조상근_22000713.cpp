// https://leetcode.com/problems/day-of-the-year/description/

#include <iostream>
#include <vector>
#include <string>

using namespace std;

int solution(string date){
    // 문자열을 나누어 정수로 변환
    // 년도가 윤년인지 판단하여 월별 일수를 벡터로 저장
    // 월까지 날짜를 세고 일을 더해줌
    string temp;
    temp = date.substr(0, 4);
    int year = stoi(temp);
    temp = date.substr(5, 2);
    int month = stoi(temp);
    temp = date.substr(8, 2);
    int day = stoi(temp);

    vector<int> leap;
    if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
        leap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    } else {
        leap = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    }

    int days = 0;
    for(int i = 0; i < month - 1; i++){
        days += leap[i];
    }
    days += day;

    return days;
}

int main(){
    string s;
    
    cin >> s;

    cout << solution(s) << endl;

    return 0;
}