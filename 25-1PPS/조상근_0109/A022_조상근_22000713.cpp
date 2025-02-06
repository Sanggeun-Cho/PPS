// https://www.acmicpc.net/problem/1267

#include <iostream>
#include <vector>

using namespace std;

void solution(vector<int> times){
    vector<int> times_copy;
    for(int i = 0; i < times.size(); i++){
        times_copy.push_back(times[i]);
    }

    // 각 시간마다 영식 요금제를 이용하여 계산되는 금액을 구한다.
    int Y = 0;
    int Y_part;
    for(int i = 0; i < times.size(); i++){
        Y_part = 10;
        while(times[i] >= 30){
            times[i] = times[i] - 30;
            Y_part += 10;
        }
        Y += Y_part;
    }

    // 각 시간마다 민식 요금제를 이용하여 계산되는 금액을 구한다.
    int M = 0;
    int M_part;
    for(int i = 0; i < times_copy.size(); i++){
        M_part = 15;
        while(times_copy[i] >= 60){
            times_copy[i] = times_copy[i] - 60;
            M += 15;
        }
        M += M_part;
    }

    if(Y < M) cout << "Y " << Y << endl;
    else if(M < Y) cout << "M " << M << endl;
    else cout << "Y M " << Y << endl;
}

int main(){
    int num;
    vector<int> times;
    int temp;

    cin >> num;

    for(int i = 0; i < num; i++){
        cin >> temp;
        times.push_back(temp);
    }

    solution(times);

    return 0;
}