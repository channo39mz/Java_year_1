#include <iostream>
using namespace std;

int main() {
  int a,b,c; 

  int maxval = 0;
  int stk = 1;
  int ans = 0;

  // cout << "Type a number: "; 
  cin >> a; 
  // cout << "Type a number: ";
  cin >> b;
  while(a!= b){
    c = a;
    stk = 1;
    while(c!=1){
                if(c%2==0){
                    c /= 2;
                }
                else{
                    c = c*3+1;
                }
                stk += 1;
                // System.out.println(stk);
            }
            if(stk>ans){
                ans = stk;
            }
            a++;
            // cout << a;
            
  }
  cout << ans;
}