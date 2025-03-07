// https://leetcode.com/problems/day-of-the-week/description/

#include <iostream>
#include <vector>

using namespace std;

#define BEGIN_YEAR 1971

// 1971년도 1월 1일을 기준으로 날짜를 더하는 느낌
// 년도 수 차이 - 1 만큼 365 or 366을 더함
// 월 차이 - 1 만큼 그 날짜를 더함
// 일 차이만큼 더함
// 총 일 수 % 7 의 값만큼 배열에서 더한 값을 출력

string dayOfTheWeek(int day, int month, int year){
    vector<string> week = {"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
    vector<int> days_of_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    int total_days = 0;
    for(int i = BEGIN_YEAR; i < year; i++){
        if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) total_days += 366;
        else total_days += 365;
    }

    for(int i = 0; i < month - 1; i++){
        total_days += days_of_month[i];
        if(((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month == 2) total_days++;
    }

    total_days += day - 1;

    return week[total_days % 7];
}

int main(){
    int day, month, year;
    cin >> day >> month >> year;

    cout << dayOfTheWeek(day, month, year) << endl;

    return 0;
}