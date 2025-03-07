// https://leetcode.com/problems/distance-between-bus-stops/description/

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// start에서 destination으로 가는 두 개의 길 중 작은 것을 리턴
// 첫번째 길은 start에서 < destination까지 숫자 더하기
// 두번째 길은 destination <= 에서 start까지 더하기기
// 비교 후 리턴

int distanceBetweenBusStop(vector<int> distance, int start, int destination){
    int first_way_weight = 0;
    int second_way_weight = 0;
    int total_weight = 0;

    if(start < destination){
        for(int i = start; i < destination; i++){
            first_way_weight += distance[i];
        }
    } else {
        for(int i = destination; i < start; i++){
            first_way_weight += distance[i];
        }
    }
    for(int i = 0; i < distance.size(); i++){
        total_weight += distance[i];
    }
    second_way_weight = total_weight - first_way_weight;

    return min(first_way_weight, second_way_weight);
}

int main(){
    vector<int> distance = {1, 2, 3, 4};

    int start, destination;

    cin >> start >> destination;

    cout << distanceBetweenBusStop(distance, start, destination) << endl;

    return 0;
}