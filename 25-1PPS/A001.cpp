// https://leetcode.com/problems/assign-cookies/description/

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int findContentChildren(vector<int>& g, vector<int>& s) {
    sort(g.begin(), g.end());
    sort(s.begin(), s.end());

    int child = 0;
    int cookie = 0;

    while(child < g.size() && cookie < s.size()) {
        if(s[cookie] >= g[child]){
            child++;
        }
        cookie++;
    }

    return child;
}

int main(){
    vector<int> g = {1, 2};
    vector<int> s = {1, 2, 3};

    cout << "Result : " << findContentChildren(g, s) << endl;

    return 0;
}