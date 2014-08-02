#include "maths.h"

int Maths::sum(const int a, const int b)
{
  return (a + b);
}

int Maths::subtract(const int a, const int b)
{
  return (a - b);
}

int Maths::sum(const std::vector<int> & v)
{
  int result = 0;
  for (std::vector<int>::size_type i = 0; i < v.size(); i++)
  {
    result += v[i];
  }
  return result;
}

int Maths::subtract(const int b, const std::vector<int> & v)
{
  int result = b;
  for (std::vector<int>::size_type i = 0; i < v.size(); i++)
  {
    result -= v[i];
  }
  return result;
}
