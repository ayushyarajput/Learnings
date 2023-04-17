const prompt = require("prompt-sync")();
const equation = prompt("Enter your equation : ");
try{
    // equation needs to string
    // eval function evaluates the equation from string
    console.log(`${equation} = ${eval(equation)}`)
} catch {
    // error handling if equation entered is wrong
    console.log("your equation can not be evaluated")
}
