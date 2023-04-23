const prompt = require("prompt-sync")();
let number = prompt("Enter number to calculate factorial : ");

function factorial(num){
    if(num===1){
        return(1)
    } else {
        return(num*factorial(num-1))
    }
}

console.log(factorial(number))