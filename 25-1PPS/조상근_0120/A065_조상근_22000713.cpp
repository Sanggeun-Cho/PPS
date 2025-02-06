// https://www.acmicpc.net/problem/11650

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void solution(int num){
    int x, y;
    vector<pair<int, int>> coordinate;
    for(int i = 0; i < num; i++){
        cin >> x >> y;
        coordinate.push_back({x, y});
    }
    sort(coordinate.begin(), coordinate.end());
    for(int i = 0; i < num; i++){
        cout << coordinate[i].first << ' ' << coordinate[i].second << '\n';
    }
}

int main(){
    ios::sync_with_stdio(false); // C 표준 입출력과의 동기화 비활성화
    cin.tie(nullptr);            // `cin`과 `cout`의 연결 해제

    int num;

    cin >> num;

    solution(num);

    return 0;
}