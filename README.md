# Compiler_project

## First Task
In this project, We use **Antlr4 program** to read *if statment* which takes each block and numbering it sequentially.
Once we put an input which contains **nested if** with *True* or *False* condition as input shown :

(You can find it in: [input.java](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/input.java))

**INPUT**


![370488c4-3f78-4b10-8f6e-e933f415923e](https://user-images.githubusercontent.com/76706477/226956801-e44c0a25-2c05-4cee-8a12-c28659332ce6.jpg)


As Input shown, *IF* function contains another *IF* which have an *Print* function. Our Purpose is to put *\\blocknumber + "number of this block"* in each new statment, as shown in the output.


**OUTPUT**


![c62ff5ec-5803-4619-a718-65f2a51e7001](https://user-images.githubusercontent.com/76706477/226959632-f7234121-3e54-4754-b9fd-ac177ef74876.jpg)


(You can find it in:[output.txt](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/output.txt))

**To make this scenario:**

1- We made a grammer for if statment as you can find in ([If.g4](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/If.g4))
with start rule:

![2023-03-22_18h41_42224](https://user-images.githubusercontent.com/76706477/226976604-d2a17a56-e438-45da-934e-7398f17431b4.png)


2- After that we generate a parse tree, to show every branch of the tree and its children :


**Parsing Tree**

![91796e07-a6ce-4d3c-8820-73d5843d25a3](https://user-images.githubusercontent.com/76706477/226966350-608008d2-bd29-4b44-a86b-ba1f6935ed5e.jpg)

3- By using *ListenerFunctions* for specefic tokens -as we need- We made a class *extends* from **Baselistener** which is:
[TestIf.java](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/TestIf.java)

4- We output our output in new file which is:

(You can find it in:[output.txt](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/output.txt))




***Some Tips***


In our main file:  [Test.java](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/Test.java) We use:


1- We use **Walker** to know how to walk through the tree and point to specific position to write before or after this position:

![2023-03-22_18h36_13](https://user-images.githubusercontent.com/76706477/226975538-ef5dc1ce-e98e-4dfc-976d-ac19fc813df2.png)


2- We use **Rewritter** to write in specific position as we need:

![q2023-03-22_18h36_13](https://user-images.githubusercontent.com/76706477/226975441-aaeab462-af3a-4f10-b6af-1ac05a3688ac.png)

