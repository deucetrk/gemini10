(() => {
    function sendNotification(){
        const req = document.getElementsByName('specialEquipment')
        if(req.values() == "Yes"){

        }
        else{

        }
    }

    function submitAll(){
        let movement = document.getElementById('movement');
        let lens = document.getElementById('lens');
        let filter = document.getElementById('filter');
        let focus = document.getElementById('focus');
        let light = document.getElementById('light');
    }

    function setupListeners() {
        const sendNoti = document.getElementById('specialepuip');
        sendNoti.addEventListener('submit', sendNotification);

        const submitAll = document.getElementById('allsubmit');
        submitAll.addEventListener('submit', submitAll);
    }

    async function run() {
        setupListeners();
    }

    run();
})