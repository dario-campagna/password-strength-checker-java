#Password Strength Checker

We want to implement a password checker using TDD.

In order to be an acceptable password, a string must:

- Have a length greater than 7 characters.
- Contain at least one alphabetic characters.
- Contain at least one digit.

We want the test to be as isolated as possible. The followings are two quotes of Kent Beck on isolated tests.

> If I had one test broken, I wanted one problem. If I had two tests broken, I wanted two problems.
> \- *Kent Beck, TDD By Example*
  
> A second implication of isolated tests is that you have to work, sometimes work hard, to break your problem into
little orthogonal dimensions.
> \- *Kent Beck, TDD By Example*

You will find that writing isolated tests for the password checker isn't so easy.