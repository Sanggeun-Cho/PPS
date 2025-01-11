// https://www.acmicpc.net/problem/3052

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> num){
    // 수들을 42로 나눈 나머지를 배열에 넣는다
    // 만약 배열 안에 해당 수가 있다면 건너뛴다
    // 배열의 크기를 리턴
    vector<int> remain;
    for(int i = 0; i < num.size(); i++){
        int temp = num[i] % 42;
        if(!(find(remain.begin(), remain.end(), temp) != remain.end())) remain.push_back(temp);
    }

    return remain.size();
}

int main(){
    vector<int> num(10);

    for(int i = 0; i < 10; i++){
        cin >> num[i];
    }

    cout << solution(num) << endl;

    return 0;
}