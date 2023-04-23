const prompt = require("prompt-sync")();
let equation = prompt("Enter your equation : ");
try{
    // equation needs to string
    // eval function evaluates the equation from string
    let result = eval(equation)
    // checking if result exists or not
    if(!!result){
        console.log(`${equation} = ${result}`)
    } else{
        // error handling if equation entered is wrong
        console.log("your equation can not be evaluated")
    }
} catch {
    // error handling if equation entered is wrong
    console.log("your equation can not be evaluated")
}
