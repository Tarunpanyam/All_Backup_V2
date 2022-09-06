const number=[1,23,4,5]

const techs=[]
techs.push("React")
techs.push("Spring Boot")
techs.push("java")
techs.push(123)

// console.log(techs)
// console.log(number)


//iterative approach
// for(let i=0;i<techs.length;i++){
//     console.log(techs[i])
// }

//ES6 features
// Arrow functions
//let and const
//class keyword

//functional approach
techs.forEach(t => console.log(t))

const squares = number.map(n => n*n)
console.log(typeof squares)
function squarenum(n){
    return n*n
}

const squarefun= number.map(squarenum)
console.log(squarefun)

const inbulitsquare = number.map(Math.sqrt)
console.log(inbulitsquare)