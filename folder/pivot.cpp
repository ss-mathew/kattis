/*
  Author: Sheryl Mathew
  Problem: pivot
  It is not okay to share my code anonymously for educational purposes
*/

#include <iostream>
#include<algorithm>
#include<vector>

int main() {
  int n;
  std::cin >> n;
  std::vector<int> A(n);
  std::vector<int> Aprime(n);
  std::vector<int> rightmostMin(n);
  int total = 0; //# of possible pivots
  for (int x = 0; x < n; x++) { //parse inp
        int add;
        std::cin >> add;
        A[x] = add;
        Aprime[x] = add;
    }
    std::sort(Aprime.begin(), Aprime.end()); //one Arr sorted
    
    int min = A[n-1];
    for (int x = n-1; x >=0; x--) { //vector filled with the min starting from the end to that position
        min = std::min(min, A[x]);
        rightmostMin[x] = min;
    }
     for (int x = 0; x < n; x++) {
         if (A[x] == Aprime[x]) { //check pivot is in the same position after sorting
             if (x == n-1) { //last index pivot case
                 total++;
             } else if (A[x] == Aprime[x] && (rightmostMin[x+1] > A[x])) { //check that min of values post pivot > pivot
             total++;
            }
             
         }
    }
        std::cout << total;
        return 0;
}

