(() => {
    let sciencePlan = [];
    function createSPElement(plan) {

        const planNo = document.createElement('label');
        planNo.innerHTML = plan.id;

        const planName = document.createElement('label');
        planName.innerHTML = plan.planName;

        const creator = document.createElement('label');
        creator.innerHTML= plan.creator;

        const submitter = document.createElement('label');
        submitter.innerHTML= plan.submitter;

        const fundingInUSD = document.createElement('label');
        fundingInUSD.innerHTML= plan.fundingInUSD;

        const objectives = document.createElement('label');
        objectives.innerHTML= plan.objectives;

        const startDate = document.createElement('label');
        startDate.innerHTML= plan.startDate;

        const endDate = document.createElement('label');
        endDate.innerHTML= plan.endDate;

        const fileQuality = document.createElement('label');
        fileQuality.innerHTML= plan.fileQuality;

        const contrast = document.createElement('label');
        contrast.innerHTML= plan.contrast;

        const brightness = document.createElement('label');
        brightness.innerHTML= plan.brightness;

        const saturation = document.createElement('label');
        saturation.innerHTML= plan.saturation;

        const teleLoc = document.createElement('label');
        teleLoc.innerHTML= plan.teleLoc;

        const fileType = document.createElement('label');
        fileType.innerHTML= plan.fileType;

        const colorType = document.createElement('label');
        colorType.innerHTML= plan.creator;

        const starSystem = document.createElement('label');
        starSystem.innerHTML= plan.creator;

        const sElem = document.createElement('div');
        sElem.setAttribute('class', 'plan');
        sElem.appendChild(planName);
        sElem.appendChild(creator);
        sElem.appendChild(submitter);
        sElem.appendChild(fundingInUSD);
        sElem.appendChild(objectives);
        sElem.appendChild(startDate);
        sElem.appendChild(endDate);
        sElem.appendChild(fileQuality);
        sElem.appendChild(contrast);
        sElem.appendChild(brightness);
        sElem.appendChild(saturation);
        sElem.appendChild(teleLoc);
        sElem.appendChild(fileType);
        sElem.appendChild(colorType);
        sElem.appendChild(starSystem);
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