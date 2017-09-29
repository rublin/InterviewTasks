# Information

We need a user registration which ensures that usernames respect certain rules.
The rules for selecting a username are:
1. The minimum length of the username must be 4 characters, the maximum should be 32.
2. It should contain at least one letter from A-Z
3. It should contain at least one digit from 0-9
4. It should contain at least one special character from amongst @#_-
5. It should not contain any spaces

## Challenge

Write a program which accepts 4 usernames (one username per line) as input and checks if each of them satisfies the above-mentioned conditions.

If a username satisfies the conditions, the program should print PASS (in uppercase).

If a username fails the conditions, the program should print FAIL (in uppercase).

## Implementation

Run [Main.java](https://github.com/rublin/InterviewTasks/blob/master/src/main/java/com/mobilunity/Main.java) and type:
* Am@Z1ng4
* Bob_42#
* Alf
* ABC 7D_

You will receive:

* PASS
* PASS
* FAIL
* FAIL

Test is in [RuleCheckerTest.java](https://github.com/rublin/InterviewTasks/blob/master/src/test/java/com/mobilunity/rule/RuleCheckerTest.java).
