# cet-yucky-utilities

A collection of stupid and hilarious java utility programs.

## Description

These are well documented and stupid methods that do basic programming tasks with yucky logic. Try to integrate them into your personal projects as a practical joke for anyone who might look at your code. 

This project was inspired by this code snip:

```
//I think I had an aneurysm writing this  
public static int Incrementer(int i) {  
	System.out.print("I hate you for making me do this");  
	return ++i;  
}  

public static void main(String[] args) {  
	//Kill it with fire  
	for (int i = 0; i < 10; i = Incrementer(i)) {  
		//This is sinful  
	}
}
```

## Getting Started

### How do I run this? 

There's no main method, so you'll have to flesh out the project and build something yourself. 

### I'd like to help!

Great! Fork this puppy and do some whippets, then you'll probably be ready to go. I encourage you to write well documented, properly named code and have some fun with it. Write utility methods that replicate basic things we're used to in Java. 

And don't write actual program code (ie main()), that will be left up to the people who want to use this project. 

### Need that in step by step form? 

1. Fork the Project
2. Create your Feature Branch (git checkout -b buch-char-array-output-handler)
3. Commit your Changes (git commit -m 'Added output methods for char arrays')
4. Push to the Branch (git push origin buch-char-array-output-handler)
5. Open a Pull Request

### What is the style guide? 

When writing your code, try to name your methods so using them is intuitive. A call of 
```
Derp derp = new derp();
derp.makeDerps(char[] derps);
```

is less useful than 

```
DerpUtils derpUtils = new DerpUtils();
derpUtils.printWords(char[] wordsList);
```

Include class and method level comments explaining general behaviour. Include the author, and date modified

**PLEASE! Do not delete the previous author(s). Add yourself below**

A good method comment would look like 
```
/* 
 * Author(s): 		Albert Einstein 
 *			Brayden Buchner
 * Date Modified:	2023-11-10
 * Behaviour: 		Derive energy from mass
 */
```

When you've made some changes you're proud of, update the CHANGELOG.md with your contributions and issue a pull request. 

## Help

If you've got any questions, best source of help would be the #intro-computer-programming channel in the CET discord 

## License

This project is licensed under the MIT License - see the LICENSE.txt file for details
