// https://leetcode.com/problems/pascals-triangle/description/

#include <iostream>
#include <vector>

using namespace std;

vector<vector<int>> generate(int numRows) {
    vector<vector<int>> triangle;

    for (int i = 0; i < numRows; i++) {
        vector<int> row(i + 1, 1); // 현재 행 생성 (모든 값 1로 초기화)
        for (int j = 1; j < i; j++) {
            // 이전 행을 기반으로 값 계산
            row[j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
        }
        triangle.push_back(row); // 계산된 행을 삼각형에 추가
    }

    return triangle;
}

int main(){
    int numRows = 5;

    vector<vector<int>> triangle = generate(numRows);

    cout << "[";
    for (size_t i = 0; i < triangle.size(); i++) {
        cout << "[";
        for (size_t j = 0; j < triangle[i].size(); j++) {
            cout << triangle[i][j];
            if (j < triangle[i].size() - 1) cout << ",";
        }
        cout << "]";
        if (i < triangle.size() - 1) cout << ",";
    }
    cout << "]" << endl;

    return 0;
}