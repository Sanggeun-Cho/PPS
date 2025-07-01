// https://leetcode.com/problems/degree-of-an-array/

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// 가장 많이 반복되는 수 찾기 -> 벡터 두개를 가지고 index에 맞추어 조절?
// 그 수가 둘러싼 배열 구하기 -> 해당 num과 count 수를 가지고 구함함
// 배열의 개수 세기 -> 뺄셈으로 구해서 나중에 min값에 넣음

int findShortestSubArray(vector<int> nums){
    vector<int> type_of_nums;
    vector<int> count_of_nums;

    
}