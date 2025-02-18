# Assignment 4 – Stacks and Queues

## Deadline: Friday, February 28, 2025, 9:59 PM

## Objectives:

- Familiarize yourself with the Stack and Queue data structures.
- **Only** use Stacks and Queues for this assignment.

---

## Instructions:

- Problems marked as **(code)** require Java programs.
- Problems marked as **(text)** require written answers in prose, algorithms (pseudo-code or code), proofs, or mathematical equations.
- **Algorithm-based answers** (pseudo-code or code) will be assessed based on logic rather than compilation.

---

## Problems:

### **(text) Problem 1: Stacking [10 points]**

Given an empty stack, determine the contents after performing the following operations:

```
- push(8)
- push(2)
- pop()
- push(pop() * 2)
- push(10)
- push(pop() / 2)
```

### **(text) Problem 2: Queueing [10 points]**

Given an empty queue, determine the contents after performing the following operations:

```
- push(4)
- push(pop() + 4)
- push(8)
- push(pop() / 2)
- pop()
- pop()
```

### **(text) Problem 3: Find in Deque [10 points]**

Provide an algorithm that finds the position of element `x` in a **Deque q** in `O(n)` time.

- Hint: Use the properties of a doubly-linked list.

### **(code) Problem 4: Balanced Brackets [25 points]**

Write a function `isBalanced(String s)` that returns `"YES"` if `s` contains balanced brackets, otherwise returns `"NO"`.

#### **Constraints:**

- `1 ≤ |s| ≤ 10^6`
- `s` consists of `{, }, (, ), [, ]`
- Use **LinkedList** with **add(), remove(), and peek()** only.

#### **Example:**

| Input          | Output |
| -------------- | ------ |
| `{[()]}`       | `YES`  |
| `{[(])}`       | `NO`   |
| `{{[[(())]]}}` | `YES`  |

---

### **(code) Problem 5: Decode String [25 points]**

Implement a function that decodes an encoded string where `k[encoded_string]` means `encoded_string` repeats `k` times.

#### **Constraints:**

- `1 ≤ s.length ≤ 30`
- `s` consists of lowercase letters, digits, and `[]`.
- `k` is in `[1, 300]`.

#### **Example:**

| Input                 | Output             |
| --------------------- | ------------------ |
| `s = "3[a]2[bc]"`     | `"aaabcbc"`        |
| `s = "3[a2[c]]"`      | `"accaccacc"`      |
| `s = "2[abc]3[cd]ef"` | `"abcabccdcdcdef"` |

---

### **(code) Problem 6: Infix to Postfix [10 points]**

Convert an **infix** expression to **postfix** notation.

#### **Constraints:**

- The input is guaranteed to be a valid expression.
- Operators: `+ - * / ^`
- **Precedence Order:** `^ > * = / > + = -`
- Ignore right associativity of `^`.

#### **Example:**

| Infix Expression        | Postfix Expression  |
| ----------------------- | ------------------- |
| `a+b*(c^d-e)^(f+g*h)-i` | `abcd^e-fgh*+^*+i-` |

---

### **(text) Problem 7: Algorithm Analysis [10 points]**

Analyze the **time complexity** and **space complexity** of Problems 4-6 using **Big-O notation**.

---

## **Grading Rubric:**

| Item               | Points  |
| ------------------ | ------- |
| Stacking           | 10      |
| Queueing           | 10      |
| Find in Deque      | 10      |
| Balanced Brackets  | 25      |
| Decode String      | 25      |
| Infix to Postfix   | 10      |
| Algorithm Analysis | 10      |
| **Total**          | **100** |

---

## **Author:**

**Author:** Jayden Cruz\
**Course:** CSC 3130: Intro to Algorithms\
**University:** Belmont University
