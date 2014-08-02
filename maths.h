#ifndef MATHS_H
#define MATHS_H

#include <vector>

class Maths
{
public:
  /**
   * Sum two integers.
   */
  static int sum(const int a, const int b);
  
  /**
   * Sum a list of integers.
   */
  static int sum(const std::vector<int> & v);
};

#endif // MATHS_H
