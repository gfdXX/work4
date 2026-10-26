# Определённый интеграл многочлена

![Java](https://img.shields.io/badge/Java-007396?logo=openjdk&logoColor=white)

Работа №4 курса Java, МГТУ им. Н.Э. Баумана, ИУ1 (февраль 2022).

Программа читает пределы `a` и `b` и считает

```
∫ₐᵇ (x⁴ + x² + x − 7) dx = F(b) − F(a),   F(x) = x⁵/5 + x³/3 + x²/2 − 7x
```

по формуле Ньютона — Лейбница (функция `integRal`).

## Как запустить

```bash
javac -d out src/com/company/Main.java
java -cp out Main
```

## Автор

Салженикин Даниил, МГТУ им. Н.Э. Баумана.
