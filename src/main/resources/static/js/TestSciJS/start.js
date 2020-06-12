(() => {
    let sciencePlan = [];
    sciencePlan = JSON.parse(JSON.stringify(sciencePlan).replace(/\:null/gi, "\:\"\""));
    let defRadio = 0


    function createSPElement(plan) {

//        console.log("--------------------")
        const sElem = document.createElement('tr');
        const radio = document.createElement('input')
        radio.setAttribute("type","radio")
        radio.setAttribute("name",'selectPlan')
        radio.setAttribute("value",plan.planNo)
        radio.setAttribute("class","radio")
        sElem.appendChild(radio)
        if(defRadio == 0){
           radio.checked = true
           defRadio = 1
        }

        for(const i in plan){
//            console.log("====>"+`${plan[i]}`)
            if(`${plan[i]}` == 'null'){
                continue
            }
            const cell = document.createElement('th')
            const temp = document.getElementById(`${i}`)
            cell.innerHTML = `${plan[i]}`
            sElem.appendChild(cell)
        }
        return sElem
    }

    function displaySciencePlan(sciencePlan) {
        const spElem = document.getElementById('sciencePlanTable')
        sciencePlan.forEach(element => {
            const temp = createSPElement(element);
            spElem.appendChild(temp);
        })
    }

    async function run() {
        // setupListener();

        sciencePlan = await getAllSciencePlan();
        console.log(sciencePlan)
        displaySciencePlan(sciencePlan)
    }
    run();

//    Click Test Button
     async function updateStat(id,status){
            alert(await updateSciStatus(id,status))
     }
    document.querySelector(".testBtn").addEventListener("click",()=>{
     let listradio = document.querySelectorAll(".radio");
        for(let i = 0; i<listradio.length;i++){
            console.log(listradio[i])
            if(listradio[i].checked == true){
                const planNo = listradio[i].value
                const status = 0
                updateStat(planNo,status)
                break;
            }
        }

    })





})();