// https://www.acmicpc.net/problem/5355

#include <iostream>
#include <vector>
#include <string>
#include <sstream>

using namespace std;

double solution(string input){
    stringstream ss(input);
    vector<string> op;
    string word;
    while(getline(ss, word, ' ')){
        op.push_back(word);
    }

    double answer = stod(op[0]);

    for(int i = 1; i < op.size(); i++){
        if(op[i] == "@") answer = answer * 3.0;
        if(op[i] == "%") answer = answer + 5.0;
        if(op[i] == "#") answer = answer - 7.0;
    }

    return answer;
}

int main(){
    int cnt;
    string input;

    cin >> cnt;
    cin.ignore();
    
    for(int i = 0; i < cnt; i++){
        getline(cin, input);
        cout << fixed;
        cout.precision(2);
        cout << solution(input) << endl;
    }

    return 0;
}