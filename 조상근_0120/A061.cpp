// https://leetcode.com/problems/excel-sheet-column-title/description/

#include <iostream>
#include <string>

using namespace std;

string convertToTitle(int columnNumber){
    // 수를 26으로 나눈 나머지를 구함
    // 나머지에 - 1 + 'A' 나머지가 0이면 'Z' insert(0, str)
    // 수를 나눠주고 반복
    int num;
    string str = "";
    while(columnNumber > 0){
        num = (columnNumber - 1) % 26;
        str.insert(0, 1, 'A' + num);
        columnNumber = (columnNumber - 1) / 26;
    }

    return str;
}

int main(){
    int columnNumber;

    cin >> columnNumber;

    cout << convertToTitle(columnNumber) << endl;

    return 0;
}

// A -> 1 = 1
// AA -> 27 = 26 + 1
// AAA -> 703 = 26 * (26 + 1) + 1