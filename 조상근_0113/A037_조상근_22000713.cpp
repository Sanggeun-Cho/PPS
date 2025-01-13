// https://leetcode.com/problems/self-dividing-numbers/description/\

#include <iostream>
#include <vector>

using namespace std;

vector<int> selfDividingNumbers(int left, int right) {
    // left부터 right 까지 반복
    // 그 값을 복사하여 복사한 값을 1보다 크거나 같은 동안 나머지를 구해 수를 나누었을 때 나누어 떨어지는지 판단
    // 나누어 떨어진다면 push back
    vector<int> answer;
    for(int i = left; i <= right; i++){
        bool check = true;
        int temp = i;
        while(temp >= 1){
            if(temp % 10 == 0 || i % (temp % 10) != 0) check = false; 
            temp /= 10;
        }
        if(check) answer.push_back(i);
    }

    return answer;
}

int main(){
    int left, right;

    cin >> left >> right;

    vector<int> answer = selfDividingNumbers(left, right);
    
    cout << "[";
    for(int i = 0; i < answer.size(); i++){
        cout << answer[i];
        if(i != answer.size() - 1) cout << ", ";
    }
    cout << "]" << endl;

    return 0;
}