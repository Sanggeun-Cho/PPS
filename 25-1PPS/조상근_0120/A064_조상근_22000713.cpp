// https://leetcode.com/problems/height-checker/description/

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int heightChecker(vector<int> heights){
    // 배열 복사
    vector<int> sorted;
    for(int i = 0; i < heights.size(); i++){
        sorted.push_back(heights[i]);
    }
    // 배열 정렬
    sort(sorted.begin(), sorted.end());
    // 배열을 비교해서 틀린 개수 세기
    int nonmatch = 0;
    for(int i = 0; i < heights.size(); i++){
        if(sorted[i] != heights[i]) nonmatch++;
    }

    return nonmatch;
}

int main(){
    vector<int> heights = {1, 1, 4, 2, 1, 3};

    cout << heightChecker(heights) << endl;

    return 0;
}