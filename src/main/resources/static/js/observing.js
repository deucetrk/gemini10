// (() => {
//     // function sendNotification(){
//     //     const req = document.getElementsByName('specialEquipment')
//     //     if(req.values() == "Yes"){
//     //
//     //     }
//     //     else{
//     //
//     //     }
//     // }
//     //
//     // function submitAll(){
//     //     let movement = document.getElementById('movement');
//     //     let lens = document.getElementById('lens');
//     //     let filter = document.getElementById('filter');
//     //     let focus = document.getElementById('focus');
//     //     let light = document.getElementById('light');
//     // }
//     //
//     // function setupListeners() {
//     //     const sendNoti = document.getElementById('specialepuip');
//     //     sendNoti.addEventListener('submit', sendNotification);
//     //
//     //     const submitAll = document.getElementById('allsubmit');
//     //     submitAll.addEventListener('submit', submitAll);
//     // }
//     //
//     // async function run() {
//     //     setupListeners();
//     // }
//     //
//     // run();
// })



(() => {
    let observingProgram = [];
    observingProgram = JSON.parse(JSON.stringify(observingProgram).replace(/\:null/gi, "\:\"\""));
    let defRadio = 0


    function createOPElement(program) {

//        console.log("--------------------")
        const opElem = document.createElement('tr');
        const radio = document.createElement('input')
        radio.setAttribute("type","radio")
        radio.setAttribute("name",'selectPlan')
        radio.setAttribute("value",program.id)
        radio.setAttribute("class","radio")
        opElem.appendChild(radio)
        if(defRadio == 0){
            radio.checked = true
            defRadio = 1
        }

        for(const i in program){
//            console.log("====>"+`${plan[i]}`)
            if(`${program[i]}` == 'null'){
                continue
            }
            const cell = document.createElement('th')
            const temp = document.getElementById(`${i}`)
            cell.innerHTML = `${program[i]}`
            opElem.appendChild(cell)
        }
        return opElem
    }

    function displayObserving(program) {
        const oElem = document.getElementById('observingProgramTable')
        observingProgram.forEach(element => {
            const temp = createOPElement(element);
            oElem.appendChild(temp);
        })
    }
    //
    // function setupListener() {
    //     document.getElementById("testBtn").onclick = function () {
    //         setTimeout(function(){location.href = "https://localhost:8443/astronomer/index"},1000) ;
    //     };
    //
    //     // document.getElementById("validateBtn").onclick = function () {
    //     //     setTimeout(function(){location.href = "https://localhost:8443/scienceObserver/index"},1000) ;
    //     // };
    // }




    async function run() {
        //setupListener();

        observingProgram = await getAllObservingProgram(3);
        console.log(observingProgram)
        displayObserving(observingProgram)
    }
    run();




//    Click Test Button
//     async function updateTestStat(id,status){
//         let m = await updateSciStatus(id,status);
//         console.log(m);
//         m.status == 200 ? alert("test successful"):alert("test failed");
//
//     }
//
//
//     document.querySelector(".testBtn").addEventListener("click",()=>{
//         let listradio = document.querySelectorAll(".radio");
//         for(let i = 0; i<listradio.length;i++){
//             console.log(listradio[i])
//             if(listradio[i].checked == true){
//                 const planNo = listradio[i].value
//                 const status = 1
//                 updateTestStat(planNo,status)
//                 break;
//             }
//         }
//
//     })






})();