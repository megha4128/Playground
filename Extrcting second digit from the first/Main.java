#include<stdio.h>
int main()
{
    int m, sd;
    scanf("%d", &m);
    while(m >= 100)
    {
        m /= 10;
    }
    sd = m % 10;
    printf("%d", sd);
    return 0;
}

