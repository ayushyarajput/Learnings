const prompt = require("prompt-sync")();
const equation = prompt("Enter your equation : ");
try{
    console.log(`${equation} = ${eval(equation)}`)
} catch {
    console.log("your equation can not be evaluated")
}
