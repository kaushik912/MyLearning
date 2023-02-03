# Useful Notes

### How to start a new java project from scratch?

* To start with a simple java project, try      
`mvn archetype:generate`        
I selected an option which had java8. ( I recommend this for practice)   
You can select from a number of options/archetypes.   

### How to makes aliases in windows?
* Linux has beautiful aliases. 
In Windows, I found two ways: 

#### Option 1

- created a folder say `aliases` and place a .bat file 
- Add `aliases` folder under Path ( in Windows environment variable settings)
- Sample content for aliasing , say for `gs.bat` ( alias for `git status`): 
    ```
    @echo off
    echo.
    git status %*
    ```
- In Windows terminal/prompt, type `gs` and it should show you `git status` result
- The advantage of this approach is that it works everywhere

#### Option 2
- Use 'git bash' supplied by git
- Create a `~/.bash_profile`
- Add your aliases the linux way!
- I personally find this pretty fast and convenient 

Aliases can save a lot of typing. So use it whenever you can.       

### 



