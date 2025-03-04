// https://www.acmicpc.net/problem/1049

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// 가격 정렬
// 끊어진 줄의 개수가 6개 이상이라면 세트의 가격이 가장 작은 것을 더함
//      개수에서 6 빼줌
// 6개 미만이라면 낱개의 가격이 가장 작은 것 * 줄 개수를 더함

int priceOfNewGuitarString(int broken_string, int brand_count){
    vector<int> set_price_sort;
    vector<int> one_price_sort;

    int set_price, one_price;
    for(int i = 0; i < brand_count; i++){
        cin >> set_price >> one_price;
        set_price_sort.push_back(set_price);
        one_price_sort.push_back(one_price);
    }
    sort(set_price_sort.begin(), set_price_sort.end());
    sort(one_price_sort.begin(), one_price_sort.end());

    int total_price = 0;

    int cost1 = ((broken_string / 6) + 1) * set_price_sort[0];
    int cost2 = (broken_string / 6) * set_price_sort[0] + (broken_string % 6) * one_price_sort[0];
    int cost3 = broken_string * one_price_sort[0];

    return min({cost1, cost2, cost3});
}

int main(){
    int broken_string, brand_count;

    cin >> broken_string >> brand_count;

    cout << priceOfNewGuitarString(broken_string, brand_count) << endl;

    return 0;
}