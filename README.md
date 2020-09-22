[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=291649&assignment_repo_type=GroupAssignmentRepo)
# Programming Assignment 2
### Virginia State University Computer Science
## CSCI445/545 Computer Communication Network / Advanced Data Communications 

Using any programming language of your choice, implement a program that computes the CRC-8 error detection code and uses it for error detection. 

CRC-8	=![x^8+x^2+x^1+1](https://latex.codecogs.com/svg.latex?x^8+x^2+x^1+1)


Your program must meet the following requirement, 
1. The input must be a file. The file can be arbitrarily large. 
2. The output must be another file that consists of the content of the input file appended with the CRC-8 code. 
3. The program must have at least two functions in addition to the main function. 
  One function computes the CRC-8 code and return the code, 
  and the other function checks if a file that is of the format described in requirement 2 has any detectable errors. 
4. Conduct sufficient tests that minimally include the following, 
  - a small input file, 
  - a manually computed CRC-8 code of the content in the input file, 
  - a copy of the output file with an artificially introduced bit error, 
  - and the testing results using your program and the above. 

Test your results using [https://crccalc.com/](https://crccalc.com/)

This is a group assignment. All participants must contribute to commit code changes to the github at least once.
Submit your code through Github Classroom by 11:59PM, October 8, 2020. 
In your submission, include source code files, test support material as described in requirement 4, inputs of your test cases, outputs of test cases, and clearly indicate which input corresponding to which output.
