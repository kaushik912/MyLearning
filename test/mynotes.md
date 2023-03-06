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

###  keyboard shortcuts in vscode
Beginning of line : Home key
End of line: end key

---

### How to Install NVM
Downloaded NVM executable for windows.    
Then used:`nvm install lts`         
Now, I tried the following      
`npm -v`
`node -v`

---
### Change the execution policy of Powershell
`Get-ExecutionPolicy`       
Now run the below command as an administrator
`Set-ExecutionPolicy RemoteSigned`
---
### How to run resume CLI?
resume export resume.pdf --theme ./node_modules/jsonresume-theme-paper
resume export resume.pdf --theme ./node_modules/jsonresume-theme-paper

Better use:
`npm serve --theme elegant`     

Themes

jsonresume-theme-caffeine
jsonresume-theme-elegant
jsonresume-theme-even
jsonresume-theme-onepage ( some customization here)
jsonresume-theme-straightforward
---







