package org.example;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution8Test {
    private final Solution8 solution = new Solution8();

    // 测试用例设计的总体原则
    // 1. 全面覆盖：确保测试用例覆盖所有可能的输入情况和边界条件。
    // 2. 可重复性：测试用例应该能够重复执行，并且每次执行的结果一致。
    // 3. 独立性：每个测试用例应该独立于其他测试用例，即一个测试用例的执行不应影响其他测试用例。
    // 4. 明确性：每个测试用例都应该有明确的预期结果，并且能够清晰地判断测试是否通过。
    // 5. 简洁性：测试用例应该尽量简洁明了，避免冗余。
    // 6. 自动化：尽可能使测试用例自动化，以减少人工干预和提高效率。
    //
    // 等价类划分原则
    // 等价类划分（Equivalence Partitioning）是一种常用的测试用例设计技术，其目的是减少测试用例的数量，
    // 同时保持较高的覆盖率。等价类划分将输入域划分为几个等价类，每个等价类内的任何输入都会产生相同的输出行为。

    // 测试目的: 验证空数组输入返回0
    // 测试用例:
    // 输入: 空的二维字符数组 new char[][]{}
    // 预期输出: 0 (表示没有岛屿)
    // 设计原理: 等价类划分 - 空数组作为一个等价类
    @Test
    public void testEmptyInput() {
        assertEquals(0, solution.numIslands(new char[][]{}));
    }

    // 测试目的: 验证单个元素数组输入返回正确的岛屿数
    // 测试用例:
    // 输入: 单个元素为 '1' 的二维字符数组 new char[][]{{'1'}}
    // 预期输出: 1 (表示有一个岛屿)
    // 输入: 单个元素为 '0' 的二维字符数组 new char[][]{{'0'}}
    // 预期输出: 0 (表示没有岛屿)
    // 设计原理: 等价类划分 - 单个元素数组作为一个等价类
    @Test
    public void testSingleElementInput() {
        assertEquals(1, solution.numIslands(new char[][]{{'1'}}));
        assertEquals(0, solution.numIslands(new char[][]{{'0'}}));
    }

    // 测试目的: 验证标准输入返回正确的岛屿数
    // 测试用例:
    // 输入: 包含一个岛屿的标准输入 input1
    // 预期输出: 1 (表示有一个岛屿)
    // 输入: 包含三个岛屿的标准输入 input2
    // 预期输出: 3 (表示有三个岛屿)
    // 设计原理: 等价类划分 - 标准输入作为一个等价类
    @Test
    public void testStandardInput() {
        char[][] input1 = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        assertEquals(1, solution.numIslands(input1));

        char[][] input2 = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        assertEquals(3, solution.numIslands(input2));
    }

    // 测试目的: 验证包含多个岛屿的输入返回正确的岛屿数
    // 测试用例:
    // 输入: 包含四个岛屿的输入
    // 预期输出: 4 (表示有四个岛屿)
    // 设计原理: 等价类划分 - 包含多个岛屿的输入作为一个等价类
    @Test
    public void testMultipleIslands() {
        char[][] input = new char[][]{
                {'1', '0', '0', '0', '1'}, // 第一行
                {'0', '0', '0', '0', '0'}, // 第二行
                {'0', '0', '1', '0', '0'}, // 第三行
                {'0', '0', '0', '1', '1'}  // 第四行
        };
        assertEquals(4, solution.numIslands(input));
    }
}