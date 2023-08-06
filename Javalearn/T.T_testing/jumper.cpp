#include <iostream>
#include <string>
#include <sstream>
using namespace std;

int main() {
  string num;
  int intarr[5];
  int cout1 = 0;
  int cout2 = 0;
  int notjoy = 0;
  int i = 0;
  cout << "number: ";
  getline (cin, num);
  stringstream ssin(num);
  while (ssin.good() && i < 5){
    ssin >>  intarr[i];
    ++i;
  }
  for (int i = 0; i < 3; i++) {
    if (intarr[i] > intarr[i+1]){
        cout1 = intarr[i] - intarr[i+1];
    }
    if (intarr[i] < intarr[i+1]){
        cout1 = intarr[i+1] - intarr[i];
    }
    if (intarr[i+1] > intarr[i+2]){
        cout2 = intarr[i+1] - intarr[i+2];
    }
    if (intarr[i+1] < intarr[i+2]){
        cout2 = intarr[i+2] - intarr[i+1];
    }
    if (cout1-cout2 > 1 || cout2-cout1 > 1 ){
        
        notjoy += 1;
    } 

  }
  if (notjoy == 0){

    cout << "Jolly";
  }
  else{
    cout << "Not Jolly";
  }
}