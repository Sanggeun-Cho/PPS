// https://www.acmicpc.net/problem/1475

#include <iostream>
#include <vector>

using namespace std;

int solution(int num){
    // 호수의 숫자들을 벡터로 생성
    int temp;
    vector<int> nums;
    vector<int> count = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    while(1){
        temp = num % 10;
        nums.push_back(temp);
        num = num / 10;

        if(num < 1) break;
    }

    // 숫자 별로 개수를 셈
        // 9는 6으로 판별하여 /2
    for(int i = 0; i < nums.size(); i++){
        if(nums[i] == 9) count[6]++;
        else count[nums[i]]++;
    }
    if(count[6] % 2 == 0) count[6] = count[6] / 2;
    else count[6] = (count[6] + 1) / 2;

    // 가장 많이 쓰이는 숫자만큼의 세트를 필요로 함
    int max = 0;
    for(int i = 0; i < count.size(); i++){
        if(max < count[i]) max = count[i];
    }

    return max;
}

int main(){
    int num;

    cin >> num;

    cout << solution(num) << endl;

    return 0;
}