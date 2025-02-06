// https://www.acmicpc.net/problem/1292

#include <iostream>
#include <vector>

using namespace std;

// 1부터 시작해서 해당 수만큼 반복하여 수를 계속 유지
// 해당 구간에서는 최종 값에 수를 더함

int sumOfNumPart(int begin, int end){
    int easynum_start = 1;
    int cnt = 1;
    int sum = 0;
    while(cnt <= end){
        for(int i = 0; i < easynum_start; i++){
            if(cnt >= begin && cnt <= end) sum += easynum_start;
            cnt++;
        }
        easynum_start++;
    }
    
    return sum;
}

int main(){
    int begin, end;

    cin >> begin >> end;

    cout << sumOfNumPart(begin, end) << endl;

    return 0;
}