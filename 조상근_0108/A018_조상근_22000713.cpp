// https://www.acmicpc.net/problem/1026

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool checkin(vector<int> array, int index){
    bool check = true;
    for(int i = 0; i < array.size(); i++){
        if(index == array[i]) check = false;
    }

    // 속하지 않았을 때 true 반환
    return check;
}

int solution(vector<int> A, vector<int> B, int size){
    int total_sum = 0;
    // A를 sort한다 (오름차순)
    sort(A.begin(), A.end());

    // B의 배열 중 가장 큰수를 계속 찾으며(계산된 큰 수는 제외) 정렬된 A와 곱하며 값을 더함
    vector<int> order;
    int index;
    for(int j = 0; j < A.size(); j++){
        int max = 0;
        for(int i = 0; i < B.size(); i++){
            if(max < B[i] && checkin(order, i)) max = B[i], index = i;
        }
        order.push_back(index);
        total_sum += A[j] * max;
    }

    return total_sum;
}

int main(){
    int size;
    int temp;
    vector<int> A;
    vector<int> B;

    cin >> size;
    for(int i = 0; i < size; i++){
        cin >> temp;
        A.push_back(temp);
    }
    for(int i = 0; i < size; i++){
        cin >> temp;
        B.push_back(temp);
    }

    cout << solution(A, B, size) << endl;

    return 0;
}