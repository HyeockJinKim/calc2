# Calculator using ANTLR
> only use .g4 file

This calculator saves the value to be stored in the variable in the Map.

In addition, each statement can be separated by `;`,
and the last statement does not have to be `;`. (similar to `Rust`) 

Supports multi-line calculations and storing result in variables.

### input
```python
a = 13;
a + 2;
1 + 3 * 2 - 3 * 7
```

```python
15
-14
```

### input code
![code](imgs/test_wh.png)


### result
![result](imgs/result.png)

It also guarantees operator precedence.