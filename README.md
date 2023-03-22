# Compiler_project

## First Task
In this project, We use **Antlr4 program** to read *if statment* which takes each block and numbering it sequentially.
Once we put an input which contains **nested if** with *True* or *False* condition as input shown :
(You can find it in: (Test.txt)

**INPUT**


![370488c4-3f78-4b10-8f6e-e933f415923e](https://user-images.githubusercontent.com/76706477/226956801-e44c0a25-2c05-4cee-8a12-c28659332ce6.jpg)


As Input shown, *IF* function contains another *IF* which have an *Print* function. Our Purpose is to put *\\blocknumber + "number of this block"* in each new statment, as shown in the output.


**OUTPUT**


![c62ff5ec-5803-4619-a718-65f2a51e7001](https://user-images.githubusercontent.com/76706477/226959632-f7234121-3e54-4754-b9fd-ac177ef74876.jpg)


(You can find it in:(Compiler_project/Test.txt at main · Asmahan-Rashed/Compiler_project)[output.txt])

**To make this scenario:**

1- We made a grammer for if statment as you can find in ([If.g4](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/If.g4))
with start rule:
prog : if_stmt+;

2- After that we generate a parse tree, to show every branch of the tree and its children :

**Parsing Tree**

![91796e07-a6ce-4d3c-8820-73d5843d25a3](https://user-images.githubusercontent.com/76706477/226966350-608008d2-bd29-4b44-a86b-ba1f6935ed5e.jpg)

3- By using *ListenerFunctions* for specefic tokens -as we need- We made a class *extends* from **Baselistener** which is:
()

4- We output our output in new file which is:



***Some Tips***

