
alert("Hello")

const API_URL = '//localhost:8443';
async function getAllSciencePlan() {
    const result = await fetch(`${API_URL}/sciencePlan/getplan`);
    return await result.json();
}
let sp = getAllSciencePlan();
console.log(sp);

