// https://school.programmers.co.kr/learn/courses/30/lessons/49993

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(string skill, vector<string> skill_trees){
    // 스킬 트리의 원소에서 스킬에 포함되어있지 않은 문자들을 삭제
    for(int j = 0; j < skill_trees.size(); j++){
        for(int i = 0; i < skill_trees[j].length(); i++){
            if(skill.find(skill_trees[j][i]) == string::npos){
                skill_trees[j].erase(skill_trees[j].begin() + i);
                i--;
            }
        }
    }

    // 삭제된 스킬 트리의 원소가 스킬에 포함된 문자배열이라면 정답으로 인정
    // -> 중간부터 시작하는 경우 간과 -> 원소의 길이만큼 한글자 한글자를 대조하여 비교
    int num = 0;
    bool right = true;
    for(int j = 0; j < skill_trees.size(); j++){
        for(int i = 0; i < skill_trees[j].length(); i++){
            if(skill[i] != skill_trees[j][i]) right = false;
        }
        if(right == true) num++;
        right = true;
    }

    // 하나도 없다면 -1로 설정
    if(num == 0) num = -1;

    return num;
}

int main(){
    string skill = "CBD";
    vector<string> skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

    cout << solution(skill, skill_trees) << endl;
}