#include <stdio.h>
#include <stdlib.h>
int sum_n(int n)
{
  int sum=0;
  for(int i=1; i<=n; i++) sum += i;
  return sum;
}
int main(int n, char  ** argv) {
    int result = sum_n(n);
    if (atoi(n) < 0)
    {
        printf("");
    }
    
}