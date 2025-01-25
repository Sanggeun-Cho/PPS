// https://school.programmers.co.kr/learn/courses/30/lessons/42746

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

// https://mungto.tistory.com/22
// -> 아이디어 참고

bool cmp(string a, string b){
    return a + b > b + a;
}

string solution(vector<int> numbers){
    // string으로 바꿔 벡터에 집어넣음
    // 더할 때 오름차순으로 정렬
    // 처음 숫자가 0이라면 0을 반환
    // 처음부터 끝까지 문자열을 합치고 리턴
    vector<string> s_numbers;
    for(int num : numbers){
        s_numbers.push_back(to_string(num));
    }
    sort(s_numbers.begin(), s_numbers.end(), cmp);

    if(s_numbers[0] == "0") return "0";

    string answer = "";
    for(auto s_num : s_numbers){
        answer += s_num;
    }

    return answer;
}

int main(){
    vector<int> numbers = {3, 30, 34, 5, 9};

    cout << solution(numbers) << endl;

    return 0;
}