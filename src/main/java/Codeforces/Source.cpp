#pragma GCC optimize("o3")
#include <ext/pb_ds/assoc_container.hpp>
#include<bits/stdc++.h>
#include<map>
// #pragma GCC optimize("Ofast")
//#pragma GCC target("avx,avx2,fma")
#include <ext/pb_ds/tree_policy.hpp>
#include <functional> // for less
using namespace __gnu_pbds;
using namespace std;
typedef tree<int,null_type,less<int>,rb_tree_tag,
            tree_order_statistics_node_update>
            order_set;
#define ll                  long long
#define ull                 unsigned long long
#define PI                  3.1415926535897932384626
#define MOD                 998244353 // 1000000007
#define vi                  vector<int>
#define vb                  vector<bool>
#define vvi                 vector<vector<int>>
#define vll                 vector<long long>
#define pb                  push_back
#define eb                  emplace_back
//#define mp(a, b)            make_pair(a, b)
#define pii                 pair<int, int>
#define vpii                vector<pair<int, int>>
#define mk(arr, n, type)    type *arr = new type[n];
#define FOR(i, a, b)        for (int(i) = (a); (i) < (b); ++(i))
#define RFOR(i, a, b)       for (int(i) = (a)-1; (i) >= (b); --(i))
#define FORALL(i, a)        for (auto& (i) : (a))
#define printall(a)         for (auto& (i) : (a)) cout << i << ' '
#define print(a)            cout << a << ' '
#define rsort(a)            sort((a).rbegin(), (a).rend())
#define w(x)                int x; cin >> x; while(x--)
#define all(c)              (c).begin(), (c).end()
#define sz(c)               (int)(c).size()
#define mpii                  map<int,int>
#define pqmx                priority_queue<int>
#define pqmn                priority_queue<int, vector<int>, greater<int> >
#define max3(a, b, c)       max((a), max((b), (c)))
#define min3(a, b, c)       min((a), min((b), (c)))
#define mx_all(c)           *max_element((c).begin(), (c).end())
#define mn_all(c)           *min_element((c).begin(), (c).end())
#define lwr_b(c, a)         lower_bound((c).begin(), (c).end(), (a)) - ((c).begin())
#define upr_b(c, a)         upper_bound((c).begin(), (c).end(), (a)) - ((c).begin())
#define FIO                 ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);


/*int countDistinct(vi arr)
{
    int n=arr.size(),result=1;
    int i;
    FOR(i,1,n)
    {
        int j=0;
        for(j=0;j<i;j++)
          if(arr[i]==arr[j])
            break;
        if(i==j)
            result++;
    }
    return result;
}
*/
void Solve(int test)
{
    while(test--)
    {
        int n;
        cin>>n;
        mpii arr;
        int i;
        FOR(i,0,n)
        {
            int x;
            cin>>x;
            arr[x]++;
        }
        vi ans;
        for(int k=1;k<=n;k++)
        {
            if(k<=arr.size())
              ans.push_back(arr.size());
            else
            {
                int value=ans[ans.size()-1];
                ans.push_back(value+1);
            }
        }
        for(auto it:ans)
           cout<<it<<" ";
        cout<<endl;
    }
}
int32_t main()
{
    FIO;
    int test;
    cin>>test;
    Solve(test);
    return 0;
}
