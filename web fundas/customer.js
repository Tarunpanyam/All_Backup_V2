const customer = {
    id : 1,
    name : "test",
    city: "hyderabad"
}
const customer2 = {
    id : 2,
    name : "test2",
    city: "hyderabad"
}

console.log(typeof customer)

console.log("------------")

let cuslist = []
cuslist.push(customer)
cuslist.push(customer2)
cuslist.forEach(Element=>{
    console.log(Element.id +"  "+Element.name)
})
//console.log(cuslist)
//console.log(st)