#include<bits/stdc++.h>
#define FIO  ios::sync_with_stdio(false); cin.tie(0); cout.tie(0);
using namespace std;

vector<int> int_to_vector(long long n) { 
    vector<int> vec;
    while (n != 0) {
        vec.push_back(n%10);
        n /= 10;
    }
    reverse(vec.begin(), vec.end());
    return vec;
}
void Solve(int n)
{
    
    while (n--)
    {
        vector<int> arr;
        int val;
        cin>>val;
        arr=int_to_vector(val);
        if(arr.size()==2)
        {
            cout<<arr[1]<<endl;
        }
        else
        {
            int min=*min_element(arr.begin(), arr.end());
            cout<<min<<endl;
        }
    }
}
auto main(int argc,char** argv)->int32_t
{
    FIO;
    int n;
    cin>>n;
    Solve(n);   
    return 0;
}