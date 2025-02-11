// https://www.acmicpc.net/problem/9546

#include <iostream>

using namespace std;

// 7 -> 3 -> 1 -> 0
// k번만큼 반복하며 n * 2 + 1

int beginingPeopleNumber(int busStop){
    int people = 0;
    for(int i = 0; i < busStop; i++){
        people = people * 2 + 1;
    }

    return people;
}

int main(){
    int num;

    cin >> num;

    for(int i = 0; i < num; i++){
        int busStop;
        cin >> busStop;

        cout << beginingPeopleNumber(busStop) << "\n";
    }

    return 0;
}