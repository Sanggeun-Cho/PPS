// https://www.acmicpc.net/problem/10814

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(pair<int, string> a, pair<int, string> b){
    return a.first < b.first;
}

void solution(vector<pair<int, string>> people){
    stable_sort(people.begin(), people.end(), compare);

    for(int i = 0; i < people.size(); i++){
        cout << people[i].first << " " << people[i].second << "\n";
    }
}

int main(){
    int num;

    cin >> num;

    vector<pair<int, string>> people;

    for(int i = 0; i < num; i++){
        int age;
        string name;

        cin >> age >> name;

        people.push_back(make_pair(age, name));
    }

    solution(people);

    return 0;
}