#include<stdio.h>
int main()
{
    int n1, s1 = 0;
    scanf("%d", &n1);
    while(n1 != 0)
    {
        int r = n1 % 10;
        s1 = s1 + r;
        n1 = n1 / 10;
    }
    printf("%d", s1);
    return 0;
}