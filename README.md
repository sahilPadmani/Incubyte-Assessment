# 🧩 String Calculator – TDD Implementation

This project showcases a **String Calculator** built using **Test-Driven Development (TDD)** as part of the Incubyte Software Craftsperson challenge.

---

## 🛠 Method Signature

```java
public int add(String numbers)
```


## 📸 Test Case Results

---

### 🔍 1. Empty String"
📥 **Input:** `""`  
✅ **Output:** `0`

---

### 🔍 2. Multiple Numbers with Delimiter
📥 **Input:** `"1,2,3,4"`  
✅ **Output:** `10`

---

### 🔍 3. Multiple Numbers with Custom Delimiter Format
📥 **Input:** `"//;\n1;2;3"`  
✅ **Output:** `6`

---

### 🔍 4. Multiple Negative Numbers
📥 **Input:** `"1,-2,3,-5"`  
❌ **Exception:** `negative numbers not allowed <-2,-5>`

---

### 🔍 5. Multiple Negative Numbers In Custom Format
📥 **Input:** `"//:\n1:-2:3:-5"`  
❌ **Exception:** `negative numbers not allowed <-2,-5>`

---

### 🔍 6. Empty String In Custom Format
📥 **Input:** `"//;\n"`  
✅ **Output:** `0`

---

### 🔍 7. Invalid String Format
📥 **Input:** `"1,,"`  
❌ **Exception:** `RuntimeException`

---

### 🔍 8. Invalid String Format
📥 **Input:** `"1,\n2"`  
❌ **Exception:** `RuntimeException`

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