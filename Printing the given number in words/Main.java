#include<stdio.h>
int main()
{
  int n,option;
  scanf("%d",&option);
  if(option==1)
    printf("One");
  else if(option==2)
    printf("Two");
  else if(option==3)
    printf("Three");
  else if(option==4)
    printf("Four");
 else if(option==5)
    printf("Six");
  else if(option>5)
    printf("Invalid");
  return 0;
}