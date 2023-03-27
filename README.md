# Compiler_project

## First Task
In this project, We use **Antlr4 program** to read *if statment* which takes each block and numbering it sequentially.
Once we put an input which contains **nested if** with *True* or *False* condition as input shown :

(You can find it in: [input.java](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/input.java))

**INPUT**


![6644ab21-7a2b-4bc9-bb88-3bf5190dbe4b](https://user-images.githubusercontent.com/76706477/227800586-d27d8ef5-e7cf-41d1-88c4-44543e0415dd.jpg)


As Input shown, *IF* function contains another *IF* which have an *Print* function. Our Purpose is to put *\\blocknumber + "number of this block"* in each new statment, as shown in the output.


**OUTPUT**

![14b5866b-ca92-4a17-b4f5-a06a448523aa](https://user-images.githubusercontent.com/76706477/227800626-bab051a5-8b0b-4273-8d3c-f54e4798857e.jpg)



(You can find it in:[output.java](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/output.java))

**To make this scenario:**

1- We took a grammer for if statment as you can find in ([JavaParser.g4](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/JavaParser.g4))
with start rule:

![1cf18c5a-11f6-4f2d-b310-4a1aa0ae9501](https://user-images.githubusercontent.com/76706477/227800660-64117840-ecd7-4d4b-ac52-6fdf7daabc76.jpg)


2- After that we generate a parse tree, to show every branch of the tree and its children :


**Parsing Tree**

![83deae46-0e37-44eb-9b57-35fa0e718f94](https://user-images.githubusercontent.com/76706477/227800672-a5788346-a349-4a09-b465-f7adadd5a698.jpg)


3- By using *ListenerFunctions* for specefic tokens -as we need- We made a class *extends* from **Baselistener** which is:
[TestIf.java](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/TestIf.java)

4- We output our output in new file which is:

(You can find it in:[output.java](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/output.java))




***Some Tips***


In our main file:  [main.java](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/main.java) We use:


1- We use **Walker** to know how to walk through the tree and point to specific position to write before or after this position:

![2023-03-22_18h36_13](https://user-images.githubusercontent.com/76706477/226975538-ef5dc1ce-e98e-4dfc-976d-ac19fc813df2.png)


2- We use **Rewritter** to write in specific position as we need:

![q2023-03-22_18h36_13](https://user-images.githubusercontent.com/76706477/226975441-aaeab462-af3a-4f10-b6af-1ac05a3688ac.png)




## Second Task

This Task depinds on vsiting each block in input file, and write whether the block is visited or not. The block is visited only if the condition is ***True***.

Our input file is look like that:


**INPUT**

![input](https://user-images.githubusercontent.com/76706477/228049601-3dd08901-4ed4-4d36-8e25-9b0f4d4c9514.png)



The output file must be like that:


**OUTPUT**

![output](https://user-images.githubusercontent.com/76706477/228050608-fa3b5dfd-253c-4a5e-adbb-3a9947ec4d60.png)


**To make this scenario:**

1- Through writing our input and gettig the parse tree of it, we look at the branches of ***IF Statment*** and the condition of it and walking through branches to get the right side and left side of the condition.


**Parsing Tree**
(It is just a part of the tree)

![parsingtree](https://user-images.githubusercontent.com/76706477/228052044-63f917fc-c366-45ca-bf73-1257c87cc6e6.png)


2- We get the left side of condition (e.g: x) and get the right side (e.g: 1)  to know if the condition is ***TRUE*** or not, it's only ***True*** when the left side **equals*** the right side. We use  ***visitVariableDeclarator*** to make us able to get the variable (rightside) and the value (leftside) and store it in the **HashMap**


![1111](https://user-images.githubusercontent.com/76706477/228055961-b7641c22-eae6-4796-8339-c610f0c5c16f.png)



3- After that, it is time to check the condition, by visiting the ***visitParExpression*** then checking (leftside) and (rightside) by getting it from **HashMap** & the operation between them (e.g: ==). 

![2222](https://user-images.githubusercontent.com/76706477/228057766-239a3d0d-fd68-4108-8d7f-dc0bb36d9d9c.png)


4- We use **Rewritter** to write the comment which we need after each condition (Parexpression). The file of this scenario is found here: [TestJava](https://github.com/Asmahan-Rashed/Compiler_project/blob/main/TestIf.java)






***Some Tips***

1- We use **HashMap** to store the values of each coming variable, to can get values from it in the phase of checking variables:

![hashmap](https://user-images.githubusercontent.com/76706477/228060969-9342b973-ba16-4176-9536-1a6a6855e353.png)


2- We print the output in the file (outputt.java) to make us able to run it after that again.
