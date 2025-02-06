// https://leetcode.com/problems/min-stack/description/

#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main(){
    // push
    // pop
    // top -> 최상위 요소
    // getMin -> 가장 작은 수

    vector<int> MinStack;
    int num;
    string s;

    while(1){
        cin >> s;
        if(s == "push"){
            cin >> num;
            MinStack.push_back(num);
        } else if(s == "pop"){
            if(MinStack.size() < 1) cout << "null" << "\n";
            else MinStack.pop_back();            
        } else if(s == "top"){
            if(MinStack.size() < 1) cout << "null" << "\n";
            else cout << MinStack[MinStack.size() - 1] << "\n";
        } else if(s == "getMin"){
            if(MinStack.size() < 1) cout << "null" << "\n";
            else{
                int min = INT_MAX;
                for(int i = 0; i < MinStack.size(); i++){
                    if(MinStack[i] < min) min = MinStack[i];
                }
                cout << min << "\n";
            }
        } else break;
    }

    return 0;
}