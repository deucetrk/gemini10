
const API_URL = '//localhost:8443';
async function getAllSciencePlan(status) {
    const result = await fetch(`${API_URL}/sciencePlan/getplanByStatus?status=${status}`);
    return await result.json();
}


async function updateSciStatus(id,status) {
  return await fetch(`${API_URL}/sciencePlan/updateStatus?id=${id}&status=${status}`, {
    method: 'PUT'
  });
}

async function getAllObservingProgram(){
    const result = await fetch(`${API_URL}/scienceObserver/getprogram`);
    return await result.json();
}