#include <iostream>
#include <vector>
#include "maths.h"

int main(int argc, char** argv)
{
  std::vector<int> a;
  a.push_back(1);
  a.push_back(2);
  
  std::cout << "1 + 2 = " << Maths::sum(a[0], a[1]) << std::endl;
  std::cout << "1 + 2 = " << Maths::sum(a) << std::endl;
}
