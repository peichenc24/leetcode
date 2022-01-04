# leetcode
Leet Code problem Algorithm practices record

1009. Complement of Base 10 Integer
Share
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer n, return its complement.

Example 1:

Input: n = 5
Output: 2
Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
Example 2:

Input: n = 7
Output: 0
Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
Example 3:

Input: n = 10
Output: 5
Explanation: 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.
 
Constraints:
0 <= n < 109

# leetcode-CN
913. 猫和老鼠
两位玩家分别扮演猫和老鼠，在一张 无向 图上进行游戏，两人轮流行动。

图的形式是：graph[a] 是一个列表，由满足 ab 是图中的一条边的所有节点 b 组成。

老鼠从节点 1 开始，第一个出发；猫从节点 2 开始，第二个出发。在节点 0 处有一个洞。

在每个玩家的行动中，他们 必须 沿着图中与所在当前位置连通的一条边移动。例如，如果老鼠在节点 1 ，那么它必须移动到 graph[1] 中的任一节点。

此外，猫无法移动到洞中（节点 0）。

然后，游戏在出现以下三种情形之一时结束：

如果猫和老鼠出现在同一个节点，猫获胜。
如果老鼠到达洞中，老鼠获胜。
如果某一位置重复出现（即，玩家的位置和移动顺序都与上一次行动相同），游戏平局。
给你一张图 graph ，并假设两位玩家都都以最佳状态参与游戏：

如果老鼠获胜，则返回 1；
如果猫获胜，则返回 2；
如果平局，则返回 0 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/cat-and-mouse
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。