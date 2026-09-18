# 🎯 DSA Master Roadmap (220 Questions)

<div align="center">

![Total Progress](https://img.shields.io/badge/Progress-0%2F220_Done-blueviolet?style=for-the-badge&logo=leetcode)
![Current Focus](https://img.shields.io/badge/Current_Focus-Arrays_%26_Hashing-ff69b4?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active_Grind-brightgreen?style=for-the-badge)

</div>

> **Goal:** Pattern recognition & true interview readiness  
> **Method:** Pattern → Intuition → 2–3 Representative Problems → Variations → Mixed Revision  
> **Target:** ~200–220 Quality Problems.

---

## 🗺️ Execution Dependency Graph

```mermaid
graph TD
    subgraph STAGE_1 ["Phase 1: Linear Foundations"]
        A[1. Arrays & Hashing] --> B[2. Two Pointers]
        B --> C[3. Sliding Window]
        A --> D[4. Prefix Sum]
    end

    subgraph STAGE_2 ["Phase 2: Core Structures"]
        E[5. Stack & Monotonic]
        F[6. Binary Search]
        G[7. Linked Lists]
    end

    subgraph STAGE_3 ["Phase 3: Hierarchical & Non-Linear"]
        H[8. Trees]
        I[9. Heaps / Priority Queue]
        J[10. Intervals]
        K[11. Greedy]
        L[12. Backtracking]
    end

    subgraph STAGE_4 ["Phase 4: Graphs & Advanced Mechanics"]
        M[13. Graph Fundamentals] --> N[14. Advanced Graphs]
        O[15. Tries]
        P[16. 1D Dynamic Programming] --> Q[17. 2D Dynamic Programming]
    end

    subgraph STAGE_5 ["Phase 5: Systems & Synthesis"]
        R[18. Bit Manipulation]
        S[19. Math & Geometry]
        T[20. Data Structure Design]
        U[21. Final Mixed & Pattern Transfer]
    end

    C --> E
    D --> F
    E --> G
    G --> H
    H --> I
    I --> J
    J --> K
    K --> L
    L --> M
    N --> P
    Q --> T
    T --> U

    classDef inProgress fill:#d84315,stroke:#fff,stroke-width:2px,color:#fff;
    classDef pending fill:#212121,stroke:#424242,stroke-width:1px,color:#b0bec5;
    classDef done fill:#2e7d32,stroke:#fff,stroke-width:2px,color:#fff;

    class A inProgress;
    class B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U pending;
