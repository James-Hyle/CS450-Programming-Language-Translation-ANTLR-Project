# Project 5: Bytecode Peephole Optimization with ASM

**Due: May 3rd, 2026**

## Problem Description

In this milestone, you will implement **five independent peephole optimizations** using ASM’s `ClassReader` and `ClassWriter`.

### Required Optimizations

1. **Optimization 1:** `x + 0 -> x`, or `x - 0 -> x`  
   *(Partially implemented in `optim.Optimizer1`.)*

2. **Optimization 2:** `0 + x -> x`

3. **Optimization 3:** `0 * x -> 0`, or `0 / x -> 0`

4. **Optimization 4:**  
   `ILOAD x, ILOAD x -> ILOAD x, DUP`

   And

   `LOAD obj, GETFIELD f, LOAD obj, GETFIELD f -> LOAD obj, GETFIELD f, DUP`

5. **Optimization 5:** `if (b == true) -> if (b)`

## Starter Files

The starter code is organized into the following three packages:

- **`inputs`** — contains input programs used for testing
- **`optim`** — contains the `ByteCodeOptimizer` wrapper that provides its optimizer to the tester  
  - Currently includes a default `ClassVisitor` that simply writes bytecode produced by ASM  
  - Also includes `Optimizer1.java`, an almost-complete `ClassVisitor` for Optimization 1
- **`test`** — contains the standard JUnit test suite in `ByteCodeOptimizerTest.java`

Copy all three packages into the `src` directory of the Project 5 IntelliJ project.

## Setup Requirements

Make sure to add the following libraries to the IntelliJ project you used for Project 4:

- ASM JAR files
- JUnit 4

## Notes

Unlike previous projects, **all test cases initially pass**. This means the test suite only verifies that your optimizations preserve the program’s correct behavior.

Your implementation will also be evaluated **manually** by:
- reading your code, and
- analyzing the optimized output,

especially for the `Optimization1` through `Optimization5` test programs.

## What to Submit

Submit the following files in the `optim` package:

- `Optimizer1.java`
- `Optimizer2.java`
- `Optimizer3.java`
- `Optimizer4.java`
- `Optimizer5.java`
- `report.pdf`

Your `report.pdf` should document your experience with Project 5 and discuss:

1. What worked
2. What did not work
3. What you learned

## Grading Rubric

- **40 points total** for passing the test suite  
  - Scored as `80 × N / 91`, where `N` is the number of passed test cases
- **50 points total** for correct implementation of the five optimizations  
  - **10 points per optimization**
- **10 points** for the report  
  - **3 points** for “What worked”
  - **3 points** for “What did not work”
  - **4 points** for “What you learned”

For the report discussion items, write **one to two paragraphs of approximately 7–8 lines each**.