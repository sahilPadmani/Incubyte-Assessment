# 🧩 String Calculator – TDD Implementation

This project showcases a **String Calculator** built using **Test-Driven Development (TDD)** as part of the Incubyte Software Craftsperson challenge.

---

## 🛠 Method Signature



```java
public int add(String numbers) throws ContainsNegativeNumbersException
```


## 📸 Test Case Results

---

### 🔍 1. Empty Input Returns Zero
📥 **Input:** `""`  
✅ **Output:** `0`

---

### 🔍 2. Invalid Comma Format
📥 **Input:** `"5,,"`  
❌ **Exception:** `RuntimeException`

---

### 🔍 3. Improper Newline Usage
📥 **Input:** `"7,\n8"`  
❌ **Exception:** `RuntimeException`

---

### 🔍 4. Valid Comma-Separated Numbers
📥 **Input:** `"3,4,5,3"`  
✅ **Output:** `15`

---

### 🔍 5. Custom Delimiter with No Numbers
📥 **Input:** `"//#\n"`  
✅ **Output:** `0`

---

### 🔍 6. Custom Delimiter with Valid Input
📥 **Input:** `"//#\n4#3#5"`  
✅ **Output:** `12`

---

### 🔍 7. Multiple Negative Numbers
📥 **Input:** `"8,-3,2,-7"`  
❌ **Exception:** `negative numbers not allowed <-3,-7>`

---

### 🔍 8. Negative Numbers with Custom Delimiter
📥 **Input:** `"//@\n6@-4@2@-9"`  
❌ **Exception:** `negative numbers not allowed <-4,-9>`

---

## 📌 Summary

🔁 **TDD followed step-by-step**  
✅ **8 comprehensive test cases implemented and verified**  
📦 **Clean structure and exception handling**  
💡 **Demonstrates usage of custom delimiters and validations**

---

## 👨‍💻 Author

**Sahil Padmani**  
🎓 B.Tech – IT | Dharmsinh Desai University, Nadiad  
💻 Focused on building maintainable and testable software