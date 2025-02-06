// https://leetcode.com/problems/fizz-buzz/description/

#include <iostream>
#include <vector>
#include <string>

using namespace std;

vector<string> fizzBuzz(int n){
    // n번 반복하며
        // if 3과 5로 모두 나누어지면
        // else if 3으로 나누어지면
        // else if 5로 나누어지면
        // else 그대로
    vector<string> answer;
    for(int i = 1; i <= n; i++){
        if((i % 3 == 0) && (i % 5 == 0)){
            answer.push_back("FizzBuzz");
        } else if(i % 3 == 0){
            answer.push_back("Fizz");
        } else if(i % 5 == 0){
            answer.push_back("Buzz");
        } else{
            answer.push_back(to_string(i));
        }
    }

    return answer;
}

int main(){
    int n;

    cin >> n;

    vector<string> answer = fizzBuzz(n);
    cout << "[";
    for(int i = 0; i < n; i++){
        cout << "\"" << answer[i] << "\"";
        if(i < n - 1) cout << ", ";
    }
    cout << "]" << endl;

    return 0;
}