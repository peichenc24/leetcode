import numpy as np
class Solution(object):
    def countVowelPermutation(self, n):
        """
        :type n: int
        :rtype: int
        """
        factor = np.mat([(0, 1, 0, 0, 0), (1, 0, 1, 0, 0), (1, 1, 0, 1, 1), (0, 0, 1, 0, 1), (1, 0, 0, 0, 0)], np.dtype('O'))
        res = np.mat([(1, 1, 1, 1, 1)], np.dtype('O'))
        n -= 1
        while n > 0:
            if n % 2 == 1:
                res = res * factor % 1000000007
            factor = factor * factor % 1000000007
            n = n // 2
        return res.sum() % 1000000007