//1649A
#include<bits/stdc++.h>
using namespace std;
int32_t main()
{
    int t; scanf("%d", &t);
    while(t--){
        int n; scanf("%d", &n);
        vector<long> arr(n); for(int p = 0; p < n; p++){scanf("%d", &arr[p]);}
        int l(0); while(l + 1 < n && arr[l + 1]){++l;}
        int r(n - 1); while(r > 0 && arr[r - 1]){--r;}
        int cost = (r - l); cost = (cost > 0) ? cost : 0;
        printf("%d\n", cost);
    }
}
