// https://www.codeground.org/practice/practiceProblemViewNew

#include <iostream>
 
using namespace std;

int main(){
    // T번 반복하면서 test_case번 동안 수를 계속 XOR하여 그 값을 출력함
    int T;
    int test_case;
    int num;
    cin >> T;
    for(int  i = 0; i < T; i++){
        int sum = 0;
        cin >> test_case;
        for(int j = 0; j < test_case; j++){
            cin >> num;
            sum = sum ^ num;
        }
        cout << "Case #" << i + 1 << endl;
        cout << sum << endl;
    }

    return 0;
}