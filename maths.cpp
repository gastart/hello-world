#include "maths.h"

int Maths::sum(const int a, const int b)
{
  int result = a + b;
  return result;
}

int sum(const std::vector<int> & v)
{
  int result = 0;
  for (std::vector<int>::size_type i = 0; i < v.size(); i++)
  {
    result = sum(result, v[i]);
  }
  return result;
}
