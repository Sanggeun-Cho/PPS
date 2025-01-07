// https://www.acmicpc.net/problem/2920

#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;

string checkAscending(vector<int> scale){
    // 오름차순과 내림차순 음계를 만들어 이와 비교
    vector<int> ascending = {1, 2, 3, 4, 5, 6, 7, 8};
    vector<int> descending = {8, 7, 6, 5, 4, 3, 2, 1};

    if(equal(scale.begin(), scale.end(), ascending.begin())) return "ascending";
    else if(equal(scale.begin(), scale.end(), descending.begin())) return "descending";
    else return "mixed";
}

int main(){
    vector<int> scale;
    int temp;

    for(int i = 0; i < 8; i++){
        cin >> temp;
        scale.push_back(temp);
    }

    cout << checkAscending(scale) << endl;

    return 0;
}