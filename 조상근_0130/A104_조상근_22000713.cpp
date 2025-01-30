// https://www.acmicpc.net/problem/14487

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> route){
    // 벡터 정렬 후 가장 마지막 빼고 다 더하기 (이렇게 해도 되나?)

    sort(route.begin(), route.end());
    
    int distance = 0;
    for(int i = 0; i < route.size() - 1; i++){
        distance += route[i];
    }

    return distance;
}

int main(){
    int num;

    cin >> num;

    vector<int> route;
    int temp;
    for(int i = 0; i < num; i++){
        cin >> temp;
        route.push_back(temp);
    }

    cout << solution(route) << endl;

    return 0;
}