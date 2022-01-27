'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', function(inputStdin) {
    inputString += inputStdin;
});

process.stdin.on('end', function() {
    inputString = inputString.split('\n');

    main();
});

function readLine() {
    return inputString[currentLine++];
}



function fizzBuzz(n) {
    for(var i=1; i<=n; i++){
        var output = "";
        if(!(i%3)) output += "Fizz";
        else if(!(i%5)) output += "Buzz";
        
        if(output == "") output = i;
        console.log(output);
    }

}
function main() {
    const n = parseInt(readLine().trim(), 10);

    fizzBuzz(n);
}
