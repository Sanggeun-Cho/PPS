// https://www.acmicpc.net/problem/10867

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> nums){
    // 오름차순 정렬
    // 앞전의 수와 같으면 추가 x
    sort(nums.begin(), nums.end());

    vector<int> answer;

    answer.push_back(nums[0]);
    for(int i = 1; i < nums.size(); i++){
        if(nums[i] != nums[i - 1]) answer.push_back(nums[i]);
    }

    return answer;
}

int main(){
    int num;

    cin >> num;

    vector<int> nums;
    int temp;

    for(int i = 0; i < num; i++){
        cin >> temp;
        nums.push_back(temp);
    }

    vector<int> answer = solution(nums);

    for(int i = 0; i < answer.size(); i++){
        cout << answer[i] << " ";
    }

    return 0;
}