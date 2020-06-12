(() => {
    let sciencePlan = [];
    sciencePlan = JSON.parse(JSON.stringify(sciencePlan).replace(/\:null/gi, "\:\"\""));

    function createSPElement(plan) {


        const planNo = document.getElementById('planId')
        planNo.innerHTML = plan.id;

        const planName = document.getElementById('planName')
        planName.innerHTML = plan.planName;

        const creator = document.getElementById('creator')
        creator.innerHTML= plan.creator;

        const submitter = document.getElementById('submitter')
        submitter.innerHTML= plan.submitter;

        const fundingInUSD = document.getElementById('fundingInUSD')
        fundingInUSD.innerHTML= plan.fundingInUSD;

        const objectives = document.getElementById('objectives')
        objectives.innerHTML= plan.objectives;

        const startDate = document.getElementById('startDate')
        startDate.innerHTML= plan.startDate;

        const endDate = document.getElementById('endDate')
        endDate.innerHTML= plan.endDate;

        const fileQuality = document.getElementById('fileQuality')
        fileQuality.innerHTML= plan.fileQuality;

        const contrast = document.getElementById('contrast')
        contrast.innerHTML= plan.contrast;

        const brightness = document.getElementById('brightness')
        brightness.innerHTML= plan.brightness;

        const saturation= document.getElementById('saturation')
        saturation.innerHTML= plan.saturation;

        const teleLoc = document.getElementById('teleLoc')
        teleLoc.innerHTML= plan.teleLoc;

        const fileType = document.getElementById('fileType')
        fileType.innerHTML= plan.fileType;

        const colorType = document.getElementById('colorType')
        colorType.innerHTML= plan.creator;

        const starSystem = document.getElementById('starSystem')
        starSystem.innerHTML= plan.creator;

        // const sElem = document.createElement('div');
        // sElem.setAttribute('class', 'plan');
        // sElem.appendChild(planName);
        // sElem.appendChild(creator);
        // sElem.appendChild(submitter);
        // sElem.appendChild(fundingInUSD);
        // sElem.appendChild(objectives);
        // sElem.appendChild(startDate);
        // sElem.appendChild(endDate);
        // sElem.appendChild(fileQuality);
        // sElem.appendChild(contrast);
        // sElem.appendChild(brightness);
        // sElem.appendChild(saturation);
        // sElem.appendChild(teleLoc);
        // sElem.appendChild(fileType);
        // sElem.appendChild(colorType);
        // sElem.appendChild(starSystem);



        // const imgElem = document.createElement('img');
        // imgElem.setAttribute('src', hero.imageURL);
        //
        // const titleElem = document.createElement('h3');
        // titleElem.innerHTML = hero.name;
        //
        // const heroElem = document.createElement('div');
        // heroElem.setAttribute('class', 'hero');
        // heroElem.appendChild(imgElem);
        // heroElem.appendChild(titleElem);
        //
        // heroElem.addEventListener('click', () => selectHero(hero));

        return sElem;
    }

    function displaySciencePlan(sciencePlan) {
        const spElem = document.getElementById('sciencePlan')
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
})();