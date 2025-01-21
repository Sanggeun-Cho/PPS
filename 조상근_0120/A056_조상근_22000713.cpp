// https://leetcode.com/problems/next-greater-element-i/description/

#include <iostream>
#include <vector>

using namespace std;

vector<int> nextGreaterElement(vector<int> nums1, vector<int> nums2){
    // nums1의 반복문을 돌면서 nums2에서 nums1과 크기가 같은 수의 인덱스를 찾아냄
    // j이후의 nums2를 돌면서 nums1의 수보다 큰 수가 있다면 그 값을 새로운 배열에 넣고 break;
    vector<int> answer;
    int index;
    for(int i = 0; i < nums1.size(); i++){
        for(int j = 0; j < nums2.size(); j++){
            if(nums1[i] == nums2[j]){
                index = j + 1;
                break;
            }
        }
        for(int j = index; j < nums2.size(); j++){
            if(nums2[j] > nums1[i]) answer.push_back(nums2[j]);
            break;
        }
        if(answer.size() < i + 1) answer.push_back(-1);
    }

    return answer;
}

int main(){
    vector<int> nums1 = {4, 1, 2};
    vector<int> nums2 = {1, 3, 4, 2};

    vector<int> answer = nextGreaterElement(nums1, nums2);

    cout << "[";
    for(int i = 0; i < answer.size(); i++){
        cout << answer[i];
        if(i < answer.size() - 1) cout << ", ";
    }
    cout << "]" << endl;

    return 0;
}