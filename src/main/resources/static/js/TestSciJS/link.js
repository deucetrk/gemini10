(() => {

function setupListener() {
    document.getElementById("submitSp").onclick = function () {
        alert("Create Science Plan Successfully ")
        location.href = "http://localhost:8443/astronomer/index";
    }
}


async function run() {
    setupListener();
}
run();

})();