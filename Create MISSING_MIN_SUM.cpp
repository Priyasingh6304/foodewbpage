#include<bits/stdc++.h>
using namespace std;

void solve(){

    int n;
    cin>>n;
    vector<long long>arr(n);
    for(int i=0;i<n;i++)cin>>arr[i];
    sort(arr.begin(),arr.end());

    long long smallestSum=1;
    for(int i=0;i<n;i++){
        if(arr[i]<=smallestSum){
            smallestSum+=arr[i];
        }
        else{
            break;
        }
    }
    cout<<smallestSum<<endl;
}

int main(){

    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    solve();
}
