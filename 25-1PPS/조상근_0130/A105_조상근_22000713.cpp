// https://www.acmicpc.net/problem/1193

#include <iostream>
#include <string>

using namespace std;

// https://velog.io/@hwsa1004/%EB%B0%B1%EC%A4%80-1193%EB%B2%88-%EB%B6%84%EC%88%98%EC%B0%BE%EA%B8%B0-%ED%8C%8C%EC%9D%B4%EC%8D%AC-%ED%92%80%EC%9D%B4

string solution(int num){
    int line = 1;

    while(num > line){
        num -= line;
        line += 1;
    }

    if(line % 2 == 0){
        string s = to_string(num) + "/" + to_string(line - num + 1);
        return s;
    } else{
        string s = to_string(line - num + 1) + "/" + to_string(num);
        return s;
    }
}

int main(){
    int num;
    cin >> num;

    cout << solution(num) << endl;

    return 0;
}