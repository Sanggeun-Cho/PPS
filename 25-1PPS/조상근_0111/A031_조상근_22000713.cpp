// https://www.acmicpc.net/problem/2163

#include <iostream>
#include <vector>

using namespace std;

int solution(int N, int M){
    return (N - 1) + N * (M - 1);
}

int main(){
    int N, M;

    cin >> N >> M;

    cout << solution(N, M) << endl;
}